/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.coffee;

import dal.TableDBContext;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CartDrink;
import model.Table;

/**
 *
 * @author Admin
 */
public class UpdateController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.length() != 0) {
            if (action.equals("Book")) {
                putCartWithTableId(request);
                updateTableWhenBooked(request);
            } else if (action.equals("Pay")) {
                updateTableWhenPaid(request);
            }
        }
        response.sendRedirect("table");
    }

    protected void updateTableWhenBooked(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Table t = new Table();
        t.setId((int) session.getAttribute("tid"));
        t.setStatus("Booked");
        TableDBContext tDB = new TableDBContext();
        tDB.updateTableWhenBooked(t);
        session.removeAttribute("tid");
    }

    protected void updateTableWhenPaid(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Table t = new Table();
        t.setId((int) session.getAttribute("tid"));
        t.setStatus("Empty");     
        TableDBContext tDB = new TableDBContext();
        tDB.updateTableWhenPaid(t);
        session.removeAttribute("tid");
    }
    
    protected void putCartWithTableId(HttpServletRequest request){
        HttpSession session = request.getSession();
        CartDrink cartDrink = (CartDrink) session.getAttribute("cart");
        HashMap<Integer, Object> map = new HashMap<>();
        int id = Integer.parseInt(request.getParameter("id"));
        map.put(id, cartDrink);
        session.setAttribute("map", map);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
