/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Size;

/**
 *
 * @author Admin
 */
public class SizeDBContext extends DBContext {

    public ArrayList<Size> getSizes() {
        ArrayList<Size> sizes = new ArrayList<>();
        try {
            String sql = "select * from Size";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Size s = new Size();
                s.setId(rs.getInt("id"));
                s.setSize(rs.getString("size"));
                sizes.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SizeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sizes;
    }

}
