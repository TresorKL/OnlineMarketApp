/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.BusinessEJBLocal;
import za.ac.tut.item.Item;

/**
 *
 * @author tresorkl
 */
public class CartServlet extends HttpServlet {

    @EJB
    private BusinessEJBLocal businessEJB;

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String productName = request.getParameter("product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        
        Item newItem = new Item(productName,quantity);
        
        
       businessEJB.updatedCard(session, newItem);
        
        
        
        
        RequestDispatcher disp =request.getRequestDispatcher("mainpage.jsp");
        disp.forward(request, response);
    }
 

}
