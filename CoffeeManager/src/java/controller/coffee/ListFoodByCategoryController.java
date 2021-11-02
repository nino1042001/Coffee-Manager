/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.coffee;

import dal.FoodCategoryDBContext;
import dal.FoodDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Food;
import model.FoodCategory;

/**
 *
 * @author Admin
 */
public class ListFoodByCategoryController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int tid;
        if (session.getAttribute("tid") == null) {
            tid = Integer.parseInt(request.getParameter("id"));
            session.setAttribute("tid", tid);
        } 
        FoodCategoryDBContext fcDB = new FoodCategoryDBContext();
        ArrayList<FoodCategory> fcs = fcDB.getFoodCategories();
        request.setAttribute("fcs", fcs);
        String raw_category = request.getParameter("fcid");
        if (raw_category == null || raw_category.length() == 0) {
            raw_category = "-1";
        }
        int idCategory = Integer.parseInt(raw_category);
        FoodDBContext fDB = new FoodDBContext();
        ArrayList<Food> foods = fDB.getFoodByCategories(idCategory);
        request.setAttribute("foods", foods);
        request.getRequestDispatcher("../view/coffee/listByCategory.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
