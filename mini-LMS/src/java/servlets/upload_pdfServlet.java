package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.*;

/**
 *
 * @author israa
 */
@WebServlet(urlPatterns = {"/uploadPdf"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB 
public class upload_pdfServlet extends HttpServlet {

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
            out.println("<title>Servlet uploadPdf</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet uploadPdf at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException, FileNotFoundException {
       response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
             String stat="select material_id from material where instructor_id=1 ";
 
//  sec c1=new sec();
//   PreparedStatement ps=c1.connect().prepareStatement(stat);
//
//   ResultSet rs = ps.executeQuery();
//   ArrayList<String>lecture_id  = new ArrayList<String>();
//   while (rs.next()) {
//     lecture_id.add(rs.getString("material_id"));
//   }


                   
        InputStream inputStream = null;
        Part filePart = request.getPart("fileName");//part is an interface
        String Filename=filePart.getSubmittedFileName();
        out.print(Filename);
        if (filePart != null) {
       
            inputStream=filePart.getInputStream();
            
            
            
        }
        final byte[] bytes = new byte[inputStream.available()];
             inputStream.read(bytes);  
 
      material m=new material(8,"oop","pdf",1,"dfg");
       
        
//        Object objec = request.getSession().getAttribute("user");
//        
//     if(objec instanceof instructor)
//     {
//        if( ((instructor) objec).uploadmaterial(m, pdfData))
//        {
//            System.out.print("succed");
//        }
//
//            }
//        else
//     {
//         System.out.print("error");
//     }
//        
        
        instructor s=new instructor("we","po","we.12@gmail.com","female");
           try {
               if(s.uploadmaterial(m,inputStream,bytes))
               {
                   request.getRequestDispatcher("homePage.jsp").forward(request, response);
                   
                   
               }  } catch (SQLException ex) {
               Logger.getLogger(upload_pdfServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
    }    }
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
