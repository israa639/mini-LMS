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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author source
 */
@WebServlet(name = "create_quizServlet", urlPatterns = {"/create_quizServlet"})
public class create_quizServlet extends HttpServlet {

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
            out.println("<title>Servlet create_quizServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet create_quizServlet at " + request.getContextPath() + "</h1>");
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

        String quiz_title = request.getParameter("title");
        int quiz_grade = Integer.parseInt(request.getParameter("grade"));
        String course_code = request.getParameter("code");

      //  HttpSession session = request.getSession(false);
        //instructor in = (instructor)session.getAttribute("instructor");
        
        instructor in = new instructor();
        in.setId(3);
                
        quiz q = new quiz();
        q.setCourse_code(course_code);
        q.setInstructor_id(in.getId());
        q.setQuiz_grade(quiz_grade);
        q.setQuiz_title(quiz_title);
        
        DB db = new DB();
        try {
            in.create_quiz(q);
            int quiz_id = db.selectInt("quiz", "quiz_title", quiz_title,"quiz_id");
            q.setQuiz_id(quiz_id);
            request.getRequestDispatcher("insert_question.jsp").forward(request, response);   

        } catch (SQLException ex) {
            Logger.getLogger(create_quizServlet.class.getName()).log(Level.SEVERE, null, ex);
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
