/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class FoodPrice {
    private Food f;
    private Size s;
    private int price;

    public Food getF() {
        return f;
    }

    public void setF(Food f) {
        this.f = f;
    }

    public Size getS() {
        return s;
    }

    public void setS(Size s) {
        this.s = s;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
