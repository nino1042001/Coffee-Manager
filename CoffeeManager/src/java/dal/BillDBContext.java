/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;

/**
 *
 * @author Admin
 */
public class BillDBContext extends DBContext {

    public void insert(Bill b) {
        try {
            String sql = "INSERT INTO [dbo].[Bill]\n"
                    + "           ([dateCheckIn]\n"
                    + "           ,[dateCheckOut]\n"
                    + "           ,[idTable]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm  = connection.prepareStatement(sql);
            stm.setDate(1, (Date) b.getDateCheckIn());
            stm.setDate(2, (Date) b.getDateCheckOut());
            stm.setInt(3, b.getTable().getId());
            stm.setString(4, b.getStatus());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
