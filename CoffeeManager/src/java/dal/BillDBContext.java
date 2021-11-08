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
import model.Bill;
import model.Table;

/**
 *
 * @author Admin
 */
public class BillDBContext extends DBContext {

    public ArrayList<Bill> getBills(String checkin, String checkout) {
        ArrayList<Bill> bills = new ArrayList<>();
        try {
            String sql = "select b.id, b.dateCheckIn, b.dateCheckOut, t.id, t.name, b.status \n"
                    + "from Bill b inner join [Table] t \n"
                    + "on b.idTable = t.id\n"
                    + "where ? <= ? and  ? <= ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, checkin);
            stm.setString(2, checkout);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill b = new Bill();
                b.setId(rs.getInt("id"));
                b.setDateCheckIn(rs.getDate("dateCheckin"));
                b.setDateCheckOut(rs.getDate("dateCheckout"));
                Table t = new Table();
                t.setId(rs.getInt("idTable"));
                t.setName(rs.getString("name"));
                b.setTable(t);
                b.setStatus(rs.getString("status"));
                bills.add(b);
            }
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }

}
