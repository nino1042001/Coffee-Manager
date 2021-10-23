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
import model.FoodCategory;

/**
 *
 * @author Admin
 */
public class FoodCategoryDBContext extends DBContext {

    public ArrayList<FoodCategory> getFoodCategories() {
        ArrayList<FoodCategory> fcs = new ArrayList<>();
        try {
            String sql = "select id, name from FoodCategory";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                FoodCategory fc = new FoodCategory();
                fc.setId(rs.getInt("id"));
                fc.setName(rs.getString("name"));
                fcs.add(fc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodCategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fcs;
    }
}
