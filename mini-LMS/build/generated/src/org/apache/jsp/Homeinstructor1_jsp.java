package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import model.user;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.instructor;
import java.sql.PreparedStatement;
import model.DB;

public final class Homeinstructor1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("hhh");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" >\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width , initial-scaler=1.0 , shrink-to-fit=no \" >\n");
      out.write("   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reg.css\" >\n");
      out.write("    \n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("    <style>\n");
      out.write("html ,body {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    width: 100%;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("body { font-family: Quicksand;}\n");
      out.write("header{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100vh;\n");
      out.write("     background-color: whitesmoke;\n");
      out.write("    color: green;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo {\n");
      out.write("    position: fixed;\n");
      out.write("    float: left;\n");
      out.write("    margin: 16px,16px;\n");
      out.write("    color:white;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("    position: fixed;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("nav ul{\n");
      out.write("    list-style: none;\n");
      out.write("    background: #214584 ;\n");
      out.write("    overflow: hidden;\n");
      out.write("    color:#000;\n");
      out.write("    padding: 0 ;\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 0;\n");
      out.write("    transition: 1s;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("nav.black ul { background: green;}\n");
      out.write("nav ul li {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("nav ul li a {\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 30px;\n");
      out.write("}\n");
      out.write(".menu-icon {\n");
      out.write("    width: 100%;\n");
      out.write("    background: #000 ;\n");
      out.write("    text-align: right;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 15px 24px;\n");
      out.write("    margin: 0;\n");
      out.write("    cursor: pointer;\n");
      out.write("    color: white;\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write(".menu .btn {\n");
      out.write("  \n");
      out.write("    text-align: right;\n");
      out.write("    color: white;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    background-color: #214584;\n");
      out.write("    outline: none;\n");
      out.write("    border: 1px solid transparent;\n");
      out.write("    margin: 16px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("btnn{\n");
      out.write("  color: #214584 ;\n");
      out.write("  text-decoration: #000;\n");
      out.write("  width: 50px;\n");
      out.write("  heigt:50px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".menu .btn:hover {\n");
      out.write("    color: grey;\n");
      out.write("    border-color: green;\n");
      out.write("    background-color: whitesmoke;\n");
      out.write("    transition: .3s ;\n");
      out.write("    text-decoration: none;\n");
      out.write("    list-style: none;\n");
      out.write("}\n");
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
      out.write("@media (max-width:580px){\n");
      out.write("    .logo{\n");
      out.write("        position: fixed;\n");
      out.write("        top: 0;\n");
      out.write("        margin-top: 16px;\n");
      out.write("    }\n");
      out.write("    nav ul {\n");
      out.write("        max-height: 0;\n");
      out.write("        background: green;\n");
      out.write("    }\n");
      out.write("    nav.black ul {\n");
      out.write("        background: white;\n");
      out.write("    }\n");
      out.write("    .showing{\n");
      out.write("        max-height: 20em ;\n");
      out.write("    }\n");
      out.write("    nav ul li{\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 15px 0;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("    .menu-icon{\n");
      out.write("        display: block;\n");
      out.write("    }\n");
      out.write("}</style> \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Glory</title>\n");
      out.write("    <meta charset=\"utf-8\" >\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width , initial-scaler=1.0 , shrink-to-fit=no \" >\n");
      out.write("   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/school.css\" >\n");
      out.write("    \n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("     <div class=\"wrapper\">\n");
      out.write("         \n");
      out.write("         <header>\n");
      out.write("             <nav>\n");
      out.write("             <div class=\"menu-icon\">\n");
      out.write("                 <i class=\"fa fa-bars fa-2x\"></i>\n");
      out.write("             </div> \n");
      out.write("                 <div class=\"logo\">oop-coursera</div>\n");
      out.write("             <div class=\"menu\">\n");
      out.write("                 <ul>\n");
      out.write("                 <a class=\"btn\"href=\"editProfile.jsp\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                 ");
      out.write("\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 <a class=\"btn\"href=\"login.jsp\">Sign out</a>\n");
      out.write("                 </ul>\n");
      out.write("             </div>  \n");
      out.write("             </nav>\n");
      out.write("                \n");
      out.write("         </header>\n");
      out.write("            <div class=\"course\">\n");
      out.write("\n");
      out.write("<table align=\"center\" cellpadding=\"3\" cellspacing=\"5\" border=\"1\" >\n");
      out.write("\n");
      out.write("<tr color=\"white\">\n");
      out.write("<td><b>Course code</b></td>\n");
      out.write("<td><b>Course name</b></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");

try{
DB db=new DB();
user u = new instructor();
Connection connection=db.getConnection();
ResultSet resultSet = db.selectRS("instructor_course");
while(resultSet.next()){
if(resultSet.getInt("instructor_id")==2)
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
      out.write("                               \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("     </div>\n");
      out.write("    </body>  </html>\n");
      out.write("<script src=\"js/jquery-3.4.1.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("     \n");
      out.write("     <!-- javascript -->\n");
      out.write("    \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function validate() \n");
      out.write("        {\n");
      out.write("            var username=document.getElementById (\"uname\") ;\n");
      out.write("            var password=document.getElementById (\"pass\") ;\n");
      out.write("            if (username.value.trim()==\"\"|| password.value.trim()==\"\")\n");
      out.write("            {alert(\"no blank value allowed\");\n");
      out.write("             return false ;\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                true;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>");
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
