/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.coffee;

import dal.FoodDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CartDrink;
import model.CartItemDrink;

/**
 *
 * @author Admin
 */
public class CartController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.length() != 0) {
            switch (action) {
                case "Add Food":
                    addToCart(request);
                    break;
                case "Update":
                    updateCart(request);
                    break;
                case "Delete":
                    deleteCart(request);
                    break;
                default:
                    break;
            }
        }
        request.getRequestDispatcher("../view/coffee/cart.jsp").forward(request, response);
    }

    protected void addToCart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String id = request.getParameter("fid");
        String name = request.getParameter("drinkName");
        String size = request.getParameter("size");
        String price = "";
        if (size.equals("M")) {
            price = request.getParameter("priceSizeM");
        } else if (size.equals("L")) {
            price = request.getParameter("priceSizeL");
        }
        String quantity = request.getParameter("quantity");

        CartDrink cartDrink = null;
        Object objCartDrink = session.getAttribute("cart");
        boolean isExisted = false;
        if (objCartDrink != null) {
            cartDrink = (CartDrink) objCartDrink;
            for (CartItemDrink cart : cartDrink.getCarts()) {
                if (cart.getName().equals(name)) {
                    int quantityFood = cart.getQuantity() + Integer.parseInt(quantity);
                    cart.setQuantity(quantityFood);
                    cart.setTotalPrice(cart.getPrice() * quantityFood);
                    cartDrink.calculatorOrderTotal();
                    isExisted = true;
                }
            }
        } else {
            cartDrink = new CartDrink();
            session.setAttribute("cart", cartDrink);
        }
        if (!isExisted) {
            cartDrink.addToCart(id, name, size, price, quantity);
        }

    }

    protected void updateCart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String quantity = request.getParameter("quantity");
        String iNumber = request.getParameter("number");

        CartDrink cartDrink = null;
        Object objCartDrink = session.getAttribute("cart");
        if (objCartDrink != null) {
            cartDrink = (CartDrink) objCartDrink;
        } else {
            cartDrink = new CartDrink();
        }

        cartDrink.updateCart(iNumber, quantity);
    }

    protected void deleteCart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String iNumber = request.getParameter("number");

        CartDrink cartDrink = null;
        Object objCartDrink = session.getAttribute("cart");
        if (objCartDrink != null) {
            cartDrink = (CartDrink) objCartDrink;
        } else {
            cartDrink = new CartDrink();
        }

        cartDrink.deleteCart(iNumber);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
