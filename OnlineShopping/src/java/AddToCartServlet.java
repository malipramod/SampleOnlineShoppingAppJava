/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.or;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddToCartServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InstantiationException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           int id=Integer.parseInt(request.getParameter("txtHidden"));           
            int q=Integer.parseInt(request.getParameter("txtQuantity"));
            
            if(q<1)
            {
                out.println("<script>alert('Please Provide correct quantity');</script>");
                 RequestDispatcher rd = request.getRequestDispatcher("Shop.jsp");
                 rd.include(request, response);
            }
            else
            {
               int c = AddToCartClass.addToCart(id,q);
               if (c > 0) {
                    out.println("<script>alert('Successfully Added to Cart');</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("Shop.jsp");
                    rd.include(request, response);
                } else {
                    out.println("<script>alert('Item could not added to cart);</script>");
                }
            }
           
        } finally {
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddToCartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddToCartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
