/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
public class sign_upServlet extends HttpServlet {
 static user u1 = null;
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
            out.println("<title>Servlet signupServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signupServlet at " + request.getContextPath() + "</h1>");
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
        
        String name = request.getParameter("fname")+" "+request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String gender = request.getParameter("gender");
        String user = request.getParameter("user");
        
        String []parameters = new String[4];
        String []values = {name,email,password,gender};
        String tableName = user;  
             
        boolean inserted = false;
        DB db = new DB();
        boolean exist = false;
        
        
        try {
        if(user.equals("instructor"))
        {
            String[] valuesS = {email};
            String[] parametersS = {"instructor_email"};
            exist = db.select("instructor",valuesS , parametersS);           
        }
        else if(user.equals("student"))
        {
            String[] valuesS = {email};
            String[] parametersS = {"student_email"};
            exist = db.select("student",valuesS , parametersS);
        }
         } catch (SQLException ex) {
                Logger.getLogger(sign_upServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        if(exist)
        {
                out.println("</alert('email already used')>");  
            request.getRequestDispatcher("signup.jsp").forward(request, response);   
        }
        else
        {
        if(user.equals("instructor"))
        {
            u1 = new instructor(name,email,password,gender);
            parameters[0]= "instructor_name";
            parameters[1]= "instructor_email";
            parameters[2]= "instructor_password";
            parameters[3]= "instructor_gender";
            
             try {
                 inserted = u1.signup(tableName, values, parameters);
              } catch (SQLException ex) {
                  Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
              }
            
        }
        else if(user.equals("student"))
        {
            u1 = new student(name,email,password,gender);
            parameters[0]= "student_name";
            parameters[1]= "student_email";
            parameters[2]= "student_password";
            parameters[3]= "students_gender";
            
             try {
                 inserted = u1.signup(tableName, values, parameters);
              } catch (SQLException ex) {
                  Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
              }
            
        }
        
        if(inserted)
        {             
                if (u1 instanceof student)
               {
                   try {    
                            u1.uType = "studnet";                       
                            u1.setEmail(email);
                            u1.setPassword(password);
                            u1.setId(db.selectInt("student","student_email" , email,"student_id"));
                            u1.setName(name);
                            u1.setGender(gender);
                            ((student) u1).setSection(db.selectInt("student","student_email" , email,"student_section"));
                            ((student) u1).setDepartment(db.selectString("student","student_email",email,"student_department"));
                            ((student) u1).setAcademic_year(db.selectInt("student","student_email" , email,"student_acyear"));
                   } catch (SQLException ex) {
                       Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
                   }
                    // HttpSession session=request.getSession();  
                  //  session.setAttribute("student",u); 
               }
               else if(u1 instanceof instructor)
               {
                   try {                            
                            u1.uType = "instructor";                       
                            u1.setEmail(email);
                            u1.setPassword(password);
                            u1.setId(db.selectInt("instructor","instructor_email" , email,"instructor_id"));
                            u1.setName(name);
                            u1.setGender(gender);
                            ((instructor) u1).setPosition(db.selectString("instructor","instructor_email", email,"instructor_position"));
                   } catch (SQLException ex) {
                       Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
                   }
                  //   HttpSession session=request.getSession();  
                   //  session.setAttribute("instructor",u); 
               }
            
            request.getSession().setAttribute("obj",u1 );
               request.getRequestDispatcher("Homeinstructor1.jsp").forward(request, response);   

           
        }
        else
       {
           request.getRequestDispatcher("signup.jsp").forward(request, response);   
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
