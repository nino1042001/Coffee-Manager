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
public class CartDrink {

    private ArrayList<CartItemDrink> carts = new ArrayList<>();
    private int total;

    public ArrayList<CartItemDrink> getCarts() {
        return carts;
    }

    public void setCarts(ArrayList<CartItemDrink> carts) {
        this.carts = carts;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLineItemCount() {
        return carts.size();
    }

    public void addToCart(String id, String name, String size, String price, String quantity) {
        int fid = Integer.parseInt(id);
        int iPrice = Integer.parseInt(price);
        int iQuantity = Integer.parseInt(quantity);
        CartItemDrink cartItem = new CartItemDrink();
        if (iQuantity > 0) {
            cartItem.setId(fid);
            cartItem.setName(name);
            cartItem.setSize(size);
            cartItem.setPrice(iPrice);
            cartItem.setQuantity(iQuantity);
            cartItem.setTotalPrice(iPrice * iQuantity);
            carts.add(cartItem);
            calculatorOrderTotal();
        }
    }

    public void updateCart(String number, String quantity) {
        int iNumber = Integer.parseInt(number);
        CartItemDrink cartItem = carts.get(iNumber - 1);
        int iPrice = cartItem.getPrice();
        int iQuantity = Integer.parseInt(quantity);
        if (iQuantity > 0) {
            cartItem.setQuantity(iQuantity);
            cartItem.setTotalPrice(iPrice * iQuantity);
            calculatorOrderTotal();
        }
    }

    public void deleteCart(String number) {
        int iNumber = Integer.parseInt(number);
        carts.remove(iNumber - 1);
        calculatorOrderTotal();
    }
    
    
    public void calculatorOrderTotal() {
        int sum = 0;
        for (int i = 0; i < carts.size(); i++) {
            CartItemDrink cartItem = carts.get(i);
            sum += cartItem.getTotalPrice();
        }
        setTotal(sum);
    }
}
