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
public class TableDBContext extends DBContext {

    public ArrayList<Table> getTables() {
        ArrayList<Table> tables = new ArrayList<>();
        try {
            String sql = "select id, name, status from [Table]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Table> getEmptyTables() {
        ArrayList<Table> tables = new ArrayList<>();
        try {
            String sql = "select id, name, status from [Table]\n"
                    + "where status = 'Empty'";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
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

    public void update(Table t) {
        try {
            String sql = "UPDATE [dbo].[Table]\n"
                    + "   SET [status] = ?\n"
                    + " WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, t.getStatus());
            stm.setInt(2, t.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTableWhenBooked(Table t) {
        try {
            connection.setAutoCommit(false);

            //update table
            String sql = "UPDATE [dbo].[Table]\n"
                    + "   SET [status] = ?\n"
                    + " WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, t.getStatus());
            stm.setInt(2, t.getId());
            stm.executeUpdate();

            //insert Bill
            String sql_insert_bill = "INSERT INTO [dbo].[Bill]\n"
                    + "           ([dateCheckIn]\n"
                    + "           ,[dateCheckOut]\n"
                    + "           ,[idTable]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (GETDATE()\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm_insert_bill = connection.prepareStatement(sql_insert_bill);
            stm_insert_bill.setDate(1, null);
            stm_insert_bill.setInt(2, t.getId());
            stm_insert_bill.setString(3, "Unpaid");
            stm_insert_bill.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
                Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void updateTableWhenPaid(Table t) {
        try {
            connection.setAutoCommit(false);

            //update table
            String sql = "UPDATE [dbo].[Table]\n"
                    + "   SET [status] = ?\n"
                    + " WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, t.getStatus());
            stm.setInt(2, t.getId());
            stm.executeUpdate();

            //get bill id
            Bill b = new Bill();
            String sql_get_id = "select max(id) as bid from Bill";
            PreparedStatement stm_get_id = connection.prepareStatement(sql_get_id);
            ResultSet rs = stm_get_id.executeQuery();
            while (rs.next()) {
                b.setId(rs.getInt("bid"));
            }

            //update Bill
            String sql_update_bill = "UPDATE [dbo].[Bill]\n"
                    + "   SET [dateCheckOut] = GETDATE()\n"
                    + "      ,[idTable] = ?\n"
                    + "      ,[status] = ?\n"
                    + " WHERE id = ? and idTable = ?";
            PreparedStatement stm_update_bill = connection.prepareStatement(sql_update_bill);
            stm_update_bill.setInt(1, t.getId());
            stm_update_bill.setString(2, "Paid");
            stm_update_bill.setInt(3, b.getId());
            stm_update_bill.setInt(4, t.getId());
            stm_update_bill.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
                Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(TableDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
