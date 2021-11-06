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

    public ArrayList<Food> getFoodByCategories(int fcid) {
        ArrayList<Food> foods = new ArrayList<>();
        try {
            String sql = "select f.id, f.name, fc.fcid, fc.name as fcname, s.id as sid, s.size, fp.price from Food f\n"
                    + "inner join FoodCategory fc on f.fcid = fc.fcid\n"
                    + "left join FoodPrice fp on f.id = fp.foodid\n"
                    + "left join Size s on fp.sizeid = s.id\n";
            PreparedStatement stm = connection.prepareStatement(sql);
            if (fcid != -1) {
                sql += "where fc.fcid = ?";
                stm = connection.prepareStatement(sql);
                stm.setInt(1, fcid);
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
                    Size s = new Size();
                    s.setId(sid);
                    s.setSize(rs.getString("size"));
                    fp.setFood(f);
                    fp.setSize(s);
                    fp.setPrice(rs.getInt("price"));
                    f.getFps().add(fp);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foods;
    }

    public Food getFood(int id) {
        try {
            String sql = "select f.id, f.name, fc.fcid, fc.name as fcname, s.id as sid, s.size, fp.price from Food f \n"
                    + "inner join FoodCategory fc on f.fcid = fc.fcid\n"
                    + "left join FoodPrice fp on f.id = fp.foodid\n"
                    + "left join Size s on fp.sizeid = s.id\n"
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
                    fp.setFood(f);
                    fp.setSize(s);
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

    public ArrayList<Food> getFoods(int pageindex, int pagesize) {
        ArrayList<Food> foods = new ArrayList<>();
        try {
            String sql = "SELECT f.id, f.name, f.fcid, f.name as fcname, f.id as sid, f.size, f.price FROM \n"
                    + "(SELECT ROW_NUMBER() OVER (ORDER BY f.id asc) as rownum, f.id, f.name, fc.fcid, fc.name as fcname, s.id as sid, s.size, fp.price from Food f\n"
                    + "inner join FoodCategory fc on f.fcid = fc.fcid\n"
                    + "left join FoodPrice fp on f.id = fp.foodid\n"
                    + "left join Size s on fp.sizeid = s.id\n"
                    + "where s.size = 'M') f\n"
                    + "WHERE \n"
                    + "rownum >= (? - 1)*? + 1 AND rownum <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
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
                    Size s = new Size();
                    s.setId(sid);
                    s.setSize(rs.getString("size"));
                    fp.setFood(f);
                    fp.setSize(s);
                    fp.setPrice(rs.getInt("price"));
                    f.getFps().add(fp);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foods;
    }

    public int getRowCount() {
        try {
            String sql = "select COUNT(*) as Total from Food";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
