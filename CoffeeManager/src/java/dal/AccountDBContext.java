/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Feature;

/**
 *
 * @author Admin
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String username, String password) {
        try {
            String sql = "SELECT a.username,a.password,a.displayname,f.fid,f.url FROM Account a \n"
                    + "LEFT JOIN GroupAccount ga ON ga.username = a.username\n"
                    + "LEFT JOIN [Group] g ON g.gid = ga.gid\n"
                    + "LEFT JOIN GroupFeature gf ON gf.gid = g.gid\n"
                    + "LEFT JOIN Feature f ON f.fid = gf.fid\n"
                    + "WHERE a.username = ? AND a.password = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            Account account = null;
            while (rs.next()) {
                if (account == null) {
                    account = new Account();
                    account.setUsername(username);
                    account.setPassword(password);
                }
                int fid = rs.getInt("fid");
                if (fid != 0) {
                    Feature f = new Feature();
                    f.setId(fid);
                    f.setUrl(rs.getString("url"));
                }
            }
            return account;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(Account a) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([username]\n"
                    + "           ,[password]\n"
                    + "           ,[displayname])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getUsername());
            stm.setString(2, a.getPassword());
            stm.setString(3, a.getDisplayName());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account checkAccountExisted(String username) {
        try {
            String sql = "SELECT * FROM Account \n"
                    + "WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                account.setPassword(rs.getString("password"));
                account.setDisplayName(rs.getString("displayName"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
