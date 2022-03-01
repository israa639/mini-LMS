package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_005fquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Coursera</title>\n");
      out.write("    <meta charset=\"utf-8\" >\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width , initial-scaler=1.0 , shrink-to-fit=no \" >\n");
      out.write("   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reg.css\" >\n");
      out.write("    \n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("     \n");
      out.write("     <style>\n");
      out.write("         \n");
      out.write("         *{ width: 100%; background:white ; color:#294372;}\n");
      out.write("\n");
      out.write("body {background: white; }\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    margin-top:50px; \n");
      out.write("    font-weight: bold;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("}\n");
      out.write(".container .form-group{\n");
      out.write("    padding: 30px;\n");
      out.write("    border-style:double; \n");
      out.write("    border-radius: 25px;\n");
      out.write("    border-color: #192946;\n");
      out.write("    box-shadow: 1px 1px 7px 3px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write(".container .form-group .a input:hover {box-shadow: 1px 1px 3px 2px;}\n");
      out.write("\n");
      out.write(".form-group .a input{\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    background:white;\n");
      out.write("    border-color: #294372;\n");
      out.write("    border-radius: 50px;\n");
      out.write("    color: #294372;\n");
      out.write("    transition: .25s;\n");
      out.write("}\n");
      out.write(".form-group .a input:focus{\n");
      out.write("    background:white;\n");
      out.write("}\n");
      out.write(".form-group .b input{\n");
      out.write("    width: 10px;\n");
      out.write("   position: absolute;\n");
      out.write("}\n");
      out.write(".form-group .b p {\n");
      out.write("    margin: 0px 0 3px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    font-size: 18px;\n");
      out.write("    width: 90%;\n");
      out.write("    height: 40px;\n");
      out.write("    margin: 10px;\n");
      out.write("    background: #214584;\n");
      out.write("    border-color: white;\n");
      out.write("    border-radius: 50px;\n");
      out.write("    color: white;\n");
      out.write("    transition: .25s;\n");
      out.write("}\n");
      out.write("button:hover {\n");
      out.write("    background: white;\n");
      out.write("    border-color: #294372;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    color: #294372;\n");
      out.write("    transition: .5s;\n");
      out.write("    box-shadow: 1px 1px 3px 2px;\n");
      out.write("}\n");
      out.write("::-webkit-input-placeholder{\n");
      out.write("    font-size: 12px;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    color: #294372; \n");
      out.write("}\n");
      out.write("         \n");
      out.write("     </style>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("     <!-- html -->\n");
      out.write("      \n");
      out.write("     <div class=\"container\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("           <div class=\"col-lg-3\"></div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("         <form class=\"form-group\" action=\"insert_questionServlet\" method=\"post\">\n");
      out.write("         <h1 style=\"text-align: center; margin-bottom: 30px;\">make Question</h1>\n");
      out.write("                     \n");
      out.write("         <label class=\"font\">Question</label><br>\n");
      out.write("    <input  type=\"text\" name=\"question\" class=\"form-control\" ><br>\n");
      out.write("    <label class=\"font\">choice A</label><br>\n");
      out.write("    <input  type=\"text\" name=\"choice1\" class=\"form-control\" ><br>\n");
      out.write("    <label class=\"font\">choice B</label><br>\n");
      out.write("    <input  type=\"text\" name=\"choice2\"  class=\"form-control\"><br>\n");
      out.write("   <label class=\"font\">choice C</label><br>\n");
      out.write("    <input  type=\"text\" name=\"choice3\"  class=\"form-control\"  <br>\n");
      out.write("   <label class=\"font\">choice D</label><br>\n");
      out.write("    <input  type=\"text\" name=\"choice4\"  class=\"form-control\"  ><br>\n");
      out.write("   <label class=\"font\">Write Answer</label><br>\n");
      out.write("    <input  type=\"text\" name=\"answer\"  class=\"form-control\" ><br>\n");
      out.write("    <button href=\"#\">Next Question</button>\n");
      out.write("    </form>                \n");
      out.write("             </div>\n");
      out.write("             <div class=\"col-lg-3\"></div>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     <script src=\"js/jquery-3.4.1.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("     \n");
      out.write("     <!-- javascript -->\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("        function validate() \n");
      out.write("        {\n");
      out.write("            var quistion=document.getElementById (\"quistion\") ;\n");
      out.write("            var a=document.getElementById (\"a\") ;\n");
      out.write("            var b=document.getElementById (\"b\") ;\n");
      out.write("            var c=document.getElementById (\"c\") ;\n");
      out.write("            var d=document.getElementById (\"d\") ;\n");
      out.write("            var answer=document.getElementById (\"answer\") ;\n");
      out.write("            if (quistion.value.trim()==\"\"||a.value.trim()==\"\"||b.value.trim()==\"\"|| \n");
      out.write("                c.value.trim()==\"\"||d.value.trim()==\"\"||answer.value.trim()==\"\")\n");
      out.write("            {alert(\"no blank value allowed\");\n");
      out.write("             return false ;\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                true;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("     \n");
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
