package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/registerstyle.css\">\n");
      out.write("       \n");
      out.write("        <script> \n");
      out.write("            function validate()                                    \n");
      out.write("            { \n");
      out.write("                var name = document.forms[\"RegForm\"][\"Name\"];   \n");
      out.write("                var address = document.forms[\"RegForm\"][\"Address\"];            \n");
      out.write("                var empid = document.forms[\"RegForm\"][\"Empid\"];  \n");
      out.write("                var password = document.forms[\"RegForm\"][\"Password\"];   \n");
      out.write("                var phone = document.forms[\"RegForm\"][\"Contact\"];  \n");
      out.write("                var type =  document.forms[\"RegForm\"][\"EmployeeType\"];  \n");
      out.write("                var sal = document.forms[\"RegForm\"][\"Salary\"]; \n");
      out.write("                 \n");
      out.write("               \n");
      out.write("                if (name.value == \"\")                                  \n");
      out.write("                { \n");
      out.write("                    window.alert(\"Please enter your name.\"); \n");
      out.write("                    name.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("               \n");
      out.write("                if (address.value == \"\")                               \n");
      out.write("                { \n");
      out.write("                    window.alert(\"Please enter your address.\"); \n");
      out.write("                    address.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("                   \n");
      out.write("                if (empid.value == \"\")                                   \n");
      out.write("                { \n");
      out.write("                    window.alert(\"Please enter a valid e-mail address.\"); \n");
      out.write("                    empid.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("               \n");
      out.write("                if (phone.value == \"\")                           \n");
      out.write("                { \n");
      out.write("                    window.alert(\"Please enter your telephone number.\"); \n");
      out.write("                    phone.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("               \n");
      out.write("                if (password.value == \"\")                        \n");
      out.write("                { \n");
      out.write("                    window.alert(\"Please enter your password\"); \n");
      out.write("                    password.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("               \n");
      out.write("                if (type.value == \"\")                  \n");
      out.write("                { \n");
      out.write("                    alert(\"Please select your type.\"); \n");
      out.write("                    type.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("                if (sal.value == \"\")                        \n");
      out.write("                { \n");
      out.write("                    window.alert(\"Please enter your salary.\"); \n");
      out.write("                    sal.focus(); \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                return true; \n");
      out.write("            }</script> \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>\n");
      out.write("            <li><a href=\"EmployeePage.jsp\">Sign Out</a></li>\n");
      out.write("            <li><a href=\"EmployeeRegister.jsp\">Sign Up</a></li>\n");
      out.write("            <li><a href=\"EmployeeLogin.jsp\">Sign In</a></li>\n");
      out.write("        </ul>\n");
      out.write("      <div class=\"container\" style=\"height: 900px; width: 460px; margin-top: 50px; background-color:white;\">\n");
      out.write("        <div>\n");
      out.write("            <h3 style=\"text-align:center; margin-top: 30px; margin-bottom: 20px; font-size: 35px;\">Create your account</h3>\n");
      out.write("        </div>\n");
      out.write("        <div  class=\"col-sm-8\">\n");
      out.write("            <form name=\"RegForm\" action=\"EmployeeRegisterServlet\" onsubmit=\"return validate()\" method=\"post\" style=\"font-size:20px; \">  \n");
      out.write("                <p>Name: <input type=\"text\" size=40 name=\"Name\"></p><br>       \n");
      out.write("                <p>Address: <input type=\"text\" size=40 name=\"Address\"></p><br> \n");
      out.write("                <p>Employee Id: <input type=\"text\" size=40 name=\"Empid\"></p><br> \n");
      out.write("                <p>Password: <input type=\"password\" size=40 name=\"Password\"></p><br> \n");
      out.write("                <p>Contact No: <input type=\"text\" size=40 name=\"Contact\"></p><br>   \n");
      out.write("                <p>Employee Type: <input type=\"text\" size=40 name=\"EmployeeType\"></p><br> \n");
      out.write("                <p>Salary: <input type=\"text\" size=40 name=\"Salary\"></p><br> \n");
      out.write("\n");
      out.write("                <input id=\"b1\" type=\"submit\"  value=\"Register\"   style=\"align-items: center;\">\n");
      out.write("\n");
      out.write("                 <br><br>\n");
      out.write("                   <div class=\"footer\">\n");
      out.write("                       <span>\n");
      out.write("                  <span>Already had an account?</span>\n");
      out.write("                  <a href=\"EmployeeLogin.jsp\">Sign in</a>\n");
      out.write("                       </span>\n");
      out.write("                   </div>\n");
      out.write("             </form> \n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
