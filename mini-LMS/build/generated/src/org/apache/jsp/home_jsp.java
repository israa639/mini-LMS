package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DB;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import java.io.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Project Home</title>\n");
      out.write("    <meta charset=\"utf-8\" >\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width , initial-scaler=1.0 , shrink-to-fit=no \" >\n");
      out.write("   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/school.css\" >\n");
      out.write("    \n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write(".home {\n");
      out.write("    \n");
      out.write("    height: 100vh;\n");
      out.write("    background-image: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)), url(home.png);\n");
      out.write("    background-size:100%;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("    float: right;\n");
      out.write("    margin-right: 50px;\n");
      out.write("}\n");
      out.write(".logo p{\n");
      out.write("    position: fixed;\n");
      out.write("    float: left;\n");
      out.write("    margin-left: 20px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 24px;\n");
      out.write("}\n");
      out.write(".logo2 p{\n");
      out.write("    position: fixed;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 100px;\n");
      out.write("    margin-left: 450px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    list-style: none;\n");
      out.write("}\n");
      out.write("ul li{\n");
      out.write("    float: left ;\n");
      out.write("    color :white;\n");
      out.write("    width: 200px;\n");
      out.write("    height: 40px;\n");
      out.write("    background:  linear-gradient(rgba(0,0,0,0.9),rgba(0,0,0,0.9));\n");
      out.write("    opacity: 0.8;\n");
      out.write("    line-height: 40px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 20px;\n");
      out.write("    margin-right: 2px;\n");
      out.write("}\n");
      out.write("ul li a {\n");
      out.write("    text-decoration:none;\n");
      out.write("    color: white;\n");
      out.write("   display: block;\n");
      out.write("}\n");
      out.write("ul li a:hover{\n");
      out.write("    background-color:#736eaa;\n");
      out.write("}\n");
      out.write("ul li ul li {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul li:hover ul li {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".course{\n");
      out.write("    position: fixed;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 230px;\n");
      out.write("    margin-left: 450px;\n");
      out.write("    color: wheat;\n");
      out.write("    font-size: 24px;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("    background:  linear-gradient(rgba(0,0,0,0.6),rgba(0,0,0,0.6));\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("     <div class=\"home\"> \n");
      out.write("         <div class=\"logo\"><p>OOP Courcera</p></div>\n");
      out.write("         <div class=\"logo2\"><p>Welcome to OOP Coursera</p></div>\n");
      out.write("    <nav>\n");
      out.write("                 \n");
      out.write("       <ul>\n");
      out.write("        <li><a href=\"#\">Courses</a></li>\n");
      out.write("             <li><a>Profile</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"http://localhost:8080/coursera_project/view_profile_instructor.jsp\">View Profile</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8080/coursera_project/edit_profile.jsp\">Edit Profile</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li><a href=\"http://localhost:8080/coursera_project/view_announcement.jsp\">Announcements</a></li>\n");
      out.write("        <li><a href=\"http://localhost:8080/coursera_project/view_feedback.jsp\">Feedbacks</a></li>\n");
      out.write("   \n");
      out.write("        </ul> \n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("    <div class=\"course\">\n");
      out.write("         <h2 align=\"center\" color=\"white\"><font><strong>Your Courser</strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"3\" cellspacing=\"5\" border=\"1\" >\n");
      out.write("\n");
      out.write("<tr color=\"white\">\n");
      out.write("<td><b>Course code</b></td>\n");
      out.write("<td><b>Course name</b></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");

try{
int id =2;
DB db=new DB();
Connection connection=db.getConnection();
ResultSet resultSet = db.selectRS("student_course");
while(resultSet.next()){
if(resultSet.getInt("student_id")==id)
{
    String course_name = db.selectString("course", "course_code",resultSet.getString("course_code"), "course_name");

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"350px\" color=\"white\">");
      out.print(resultSet.getString("course_code") );
      out.write("</td>\n");
      out.write("<td width=\"350px\" color=\"white\">");
      out.print(course_name);
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");

 }
}
connection.close();
} 
catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>    \n");
      out.write("             \n");
      out.write("     </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
