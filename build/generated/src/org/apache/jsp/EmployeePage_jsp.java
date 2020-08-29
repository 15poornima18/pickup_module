package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/empstyle.css\">\n");
      out.write("        <title>Employee DashBoard</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <a href=\"index.html\"><a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a></a>\n");
      out.write("            <li><a href=\"EmployeeRegister.jsp\">Sign Up</a></li>\n");
      out.write("            <li><a href=\"EmployeeLogin.jsp\">Sign In</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6 loginform\">\n");
      out.write("                    <h1 class=\"heading\">Employee Login</h1><br>\n");
      out.write("                        <form action=\"EmployeeLoginServlet\" method=\"post\">\n");
      out.write("                            <label for=\"empid\">Employee Id:</label><br>\n");
      out.write("                            <input type=\"text\" id=\"empid\" name=\"employeeid\" placeholder=\"Employee id\" required><br>\n");
      out.write("                            <br>\n");
      out.write("                            <label for=\"pass\">Password:</label><br>\n");
      out.write("                            <input type=\"password\" id=\"pass\" name=\"password\" placeholder=\"Password\" required><br>\n");
      out.write("                            <br>\n");
      out.write("                            <label for=\"pass\">Login As:</label><br>\n");
      out.write("                             <label class=\"radio-inline\" style=\"color: black;\">\n");
      out.write("                                 <input type=\"radio\" name=\"type\" value=\"Manager\" required>Manager\n");
      out.write("                             </label>\n");
      out.write("                            <label class=\"radio-inline\" style=\"color: black;\">\n");
      out.write("                                <input type=\"radio\" name=\"type\"  value=\"Pickup Boy\" required>Pickup Boy\n");
      out.write("                            </label>\n");
      out.write("                            <br><br>\n");
      out.write("                           <input  type=\"submit\" value=\"Submit\"><br><br>\n");
      out.write("                             </form> \n");
      out.write("                        <div class=\"col-sm-3\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         </body>\n");
      out.write("         \n");
      out.write("      ");

          String status = request.getParameter("isvalid");
          if(status!=null && status.equals("false")){
      
      out.write("\n");
      out.write("      \n");
      out.write("        <script>\n");
      out.write("          alert(\"Invalid user_id or password!!\");\n");
      out.write("        </script>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("         \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                     \n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t ");
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
