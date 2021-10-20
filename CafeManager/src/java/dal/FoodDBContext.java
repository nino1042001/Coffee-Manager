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
import model.Food;

/**
 *
 * @author Admin
 */
public class FoodDBContext extends DBContext {

    public ArrayList<Food> getFoods() {
        ArrayList<Food> foods = new ArrayList<>();
        try {
            String sql = "select f.id, f.name, fc.name, fp.price, s.size from Food f \n"
                    + "inner join FoodCategory fc on f.idCategory = fc.id\n"
                    + "left join FoodPrice fp on f.id = fp.foodid\n"
                    + "left join Size s on fp.sizeid = s.id";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(FoodDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foods;
    }
}
