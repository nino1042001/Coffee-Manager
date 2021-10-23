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
import model.FoodCategory;
import model.FoodPrice;
import model.Size;

/**
 *
 * @author Admin
 */
public class FoodDBContext extends DBContext {

    public ArrayList<Food> getFoods(int idCategory) {
        ArrayList<Food> foods = new ArrayList<>();
        try {
            String sql = "select f.id, f.name, fc.id as fcid, fc.name as fcname, fp.price, s.id as sid, s.size from Food f \n"
                    + "inner join FoodCategory fc on f.idCategory = fc.id\n"
                    + "left join FoodPrice fp on f.id = fp.foodid\n"
                    + "left join Size s on fp.sizeid = s.id";
            PreparedStatement stm = connection.prepareStatement(sql);
            if (idCategory != -1) {
                sql += "where fc.id = ?";
                stm = connection.prepareStatement(sql);
                stm.setInt(1, idCategory);
            }
            ResultSet rs = stm.executeQuery();
            Food f = new Food();
            f.setId(-1);
            while (rs.next()) {
                int fid = rs.getInt("id");
                if (f.getId() != fid) {
                    f = new Food();
                    f.setId(fid);
                    f.setName(rs.getString("name"));
                    FoodCategory fc = new FoodCategory();
                    fc.setId(rs.getInt("fcid"));
                    fc.setName(rs.getString("fcname"));
                    f.setFc(fc);
                    foods.add(f);
                }
                int sid = rs.getInt("sid");
                if (sid != 0) {
                    FoodPrice fp = new FoodPrice();
                    fp.setPrice(rs.getInt("price"));
                    Size s = new Size();
                    s.setId(sid);
                    s.setSize(rs.getString("size"));
                    fp.setF(f);
                    fp.setS(s);
                    f.getFps().add(fp);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foods;
    }

    public Food getFoodByIDFood(int id) {
        try {
            String sql = "select f.id, f.name, fc.id as fcid, fc.name as fcname, fp.price, s.id as sid, s.size from Food f \n"
                    + "inner join FoodCategory fc on f.idCategory = fc.id\n"
                    + "left join FoodPrice fp on f.id = fp.foodid\n"
                    + "left join Size s on fp.sizeid = s.id"
                    + "where f.id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            Food f = null;
            while (rs.next()) {
                if (f == null) {
                    f = new Food();
                    f.setId(rs.getInt("id"));
                    f.setName(rs.getString("name"));
                    FoodCategory fc = new FoodCategory();
                    fc.setId(rs.getInt("fcid"));
                    fc.setName(rs.getString("fcname"));
                    f.setFc(fc);
                }
                int sid = rs.getInt("sid");
                if (sid != 0) {
                    FoodPrice fp = new FoodPrice();
                    Size s = new Size();
                    s.setId(sid);
                    s.setSize(rs.getString("size"));
                    fp.setF(f);
                    fp.setS(s);
                    fp.setPrice(rs.getInt("price"));
                    f.getFps().add(fp);
                }
            }
            return f;
        } catch (SQLException ex) {
            Logger.getLogger(FoodDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
