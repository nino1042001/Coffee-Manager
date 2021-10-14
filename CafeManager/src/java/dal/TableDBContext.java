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
import model.Table;

/**
 *
 * @author Admin
 */
public class TableDBContext extends DBContext {

    public ArrayList<Table> getTables() {
        ArrayList<Table> tables = new ArrayList<>();
        try {
            String sql = "select id, name, status from [Table]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Table t = new Table();
                t.setId(rs.getInt("id"));
                t.setName(rs.getString("name"));
                t.setStatus(rs.getString("status"));
                tables.add(t);
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tables;
    }
}
