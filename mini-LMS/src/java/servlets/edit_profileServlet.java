/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import static servlets.loginServlet.u;
import static servlets.sign_upServlet.u1;


/**
 *
 * @author source
 */
public class edit_profileServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet edit_profileServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet edit_profileServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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

        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String newpass = request.getParameter("newpass");
        String values[]={uname,email,newpass};
         if(u !=null)
         {
        if(u instanceof  student)
        {
            try {
                if(((student)u).editprofile("student", values, "student_id"))
                {
                    request.getSession().setAttribute("obj",u );
                        request.getRequestDispatcher("Homestudent1.jsp").forward(request, response);
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(edit_profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(u instanceof instructor)
        {
            
             try {
                if(((instructor)u).editprofile("instructor", values, "instructor_id"))
                {
                    request.getSession().setAttribute("obj",u );
                        request.getRequestDispatcher("Homestudent1.jsp").forward(request, response);
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(edit_profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
         }
        
         else if(u1 !=null)
         {
        if(u1 instanceof  student)
        {
            try {
                if(((student)u1).editprofile("student", values, "student_id"))
                {
                    request.getSession().setAttribute("obj",u1 );
                        request.getRequestDispatcher("Homestudent1.jsp").forward(request, response);
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(edit_profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(u1 instanceof instructor)
        {
            
             try {
                if(((instructor)u1).editprofile("instructor", values, "instructor_id"))
                {
                    request.getSession().setAttribute("obj",u1 );
                        request.getRequestDispatcher("Homestudent1.jsp").forward(request, response);
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(edit_profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
         }
        
        
        
        
        
        
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
