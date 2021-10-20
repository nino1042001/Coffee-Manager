/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Food {
    private int id;
    private String name;
    private float price;
    private int idCaregory;
    ArrayList<FoodPrice> fps = new ArrayList<>();

    public ArrayList<FoodPrice> getFps() {
        return fps;
    }

    public void setFps(ArrayList<FoodPrice> fps) {
        this.fps = fps;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIdCaregory() {
        return idCaregory;
    }

    public void setIdCaregory(int idCaregory) {
        this.idCaregory = idCaregory;
    }
    
    
}
