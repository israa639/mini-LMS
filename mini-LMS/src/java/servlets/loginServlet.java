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
import javax.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author source
 */
public class loginServlet extends HttpServlet {
 static user u = null;
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
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
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

          String email = request.getParameter("email");
          String password = request.getParameter("password");
          String user = request.getParameter("user");
          String []parameters = new String[2];
          String []values = {email,password};
          String tableName = user;

    /**
     *
     */
   
          boolean exist = false ;
          DB db = new DB();        
          
          if(user.equals("instructor"))
          {
             u = new instructor(email,password);
              parameters[0]="instructor_email";
              parameters[1]="instructor_password";
             
              try {
                 exist = u.login(tableName, values, parameters);
              } catch (SQLException ex) {
                  Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
              }

          }
          else if(user.equals("student"))
          {
              u = new student(email,password);
              parameters[0]="student_email";
              parameters[1]="student_password";
           
              try {
                 exist = u.login(tableName, values, parameters);
              } catch (SQLException ex) {
                  Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
              }

          }
          
           if(exist)
           {             
               if (u instanceof student)
               {
                   try {
                            u.uType = "studnet";
                            u.setEmail(email);
                            u.setPassword(password);
                            u.setId(db.selectInt("student","student_email" , email,"student_id"));
                            u.setName(db.selectString("student","student_email", email,"student_name"));
                            u.setGender(db.selectString("student","student_email",email,"student_gender"));
                            ((student) u).setSection(db.selectInt("student","student_email" , email,"student_section"));
                            ((student) u).setDepartment(db.selectString("student","student_email",email,"student_department"));
                            ((student) u).setAcademic_year(db.selectInt("student","student_email" , email,"student_acyear"));
                   } catch (SQLException ex) {
                       Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
                   }
                //     HttpSession session=request.getSession();  
                  //  session.setAttribute("student",u); 
                           request.getSession().setAttribute("obj",u );
                                   request.getRequestDispatcher("Homestudent1.jsp").forward(request, response);   

               }
               else if(u instanceof instructor)
               {
                   try {
                            u.uType = "instructor";                       
                            u.setEmail(email);
                            u.setPassword(password);
                            u.setId(db.selectInt("instructor","instructor_email" , email,"instructor_id"));
                            u.setName(db.selectString("instructor","instructor_email", email,"instructor_name"));
                            u.setGender(db.selectString("instructor","instructor_email",email,"instructor_gender"));
                            ((instructor) u).setPosition(db.selectString("instructor","instructor_email", email,"instructor_position"));
                   } catch (SQLException ex) {
                       Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
                   }
                    // HttpSession session=request.getSession();  
                    // session.setAttribute("instructor",u); 
                    request.getSession().setAttribute("obj",u );
                                   request.getRequestDispatcher("Homeinstructor1.jsp").forward(request, response);   

               }
               
               
           }
           else
           {
               request.getRequestDispatcher("signup.jsp").forward(request, response);   
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
