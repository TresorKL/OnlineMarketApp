/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.item.Item;

/**
 *
 * @author tresorkl
 */
public class StartSessionServlet extends HttpServlet {
 

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String productName = request.getParameter("product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        
        Item newItem = new Item(productName,quantity);
        
        List<Item> istems = new ArrayList<>();
        
       istems.add(newItem);
        
       
        
        session.setAttribute("items", istems);
        
        RequestDispatcher disp =request.getRequestDispatcher("mainpage.jsp");
        disp.forward(request, response);
       
    }

     

}
