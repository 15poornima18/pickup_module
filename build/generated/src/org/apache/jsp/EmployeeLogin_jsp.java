package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"CSS/loginstyle.css\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>        \n");
      out.write("            <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>       \n");
      out.write("<!--            <li><a href=\"EmployeePage.jsp\">Sign Out</a></li>-->\n");
      out.write("             <li><a href=\"EmployeeRegister.jsp\">Sign Up</a></li>\n");
      out.write("            <li><a href=\"EmployeeLogin.jsp\">Sign In</a></li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div class=\"container\" >\n");
      out.write("        <div>\n");
      out.write("            <h3 style=\"text-align:center; margin-top: 30px; margin-bottom: 10px; margin-left: -20px; color: black; font-size: 30px;\">Sign in to your account</h3>\n");
      out.write("        </div><br>\n");
      out.write("           <div  class=\"col-sm-8\" style=\"height: 360px; width: 420px; margin-left: 350px;  background-color:whitesmoke; \">\n");
      out.write("                <div>\n");
      out.write("                    <form class=\"myform loginform\" action=\"EmployeeLoginServlet\" method=\"post\" style=\"font-size: 18px; width:400px;\"><br>\n");
      out.write("                        <label for=\"empid\">Employee Id:</label>\n");
      out.write("                        <input type=\"text\" id=\"empid\" name=\"employeeid\" placeholder=\"Employee id\"><br>\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"pass\">Password:</label>\n");
      out.write("                        <input type=\"password\" id=\"pass\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                        <br><br>\n");
      out.write("                        <label for=\"pass\">Employee Type:</label>\n");
      out.write("                        <label class=\"radio-inline\">\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"Manager\">Manager\n");
      out.write("                        </label>\n");
      out.write("                        <label class=\"radio-inline\" style=\"float:right;\">\n");
      out.write("                              <input type=\"radio\" name=\"type\" value=\"Pickup Boy\">Pickup Boy\n");
      out.write("                          </label>\n");
      out.write("\n");
      out.write("                         <br><br> \n");
      out.write("                       <input id=\"b2\" type=\"submit\"  value=\"Login\" style=\"align-items: center;\">\n");
      out.write("\n");
      out.write("                        <br><br>\n");
      out.write("                        <div class=\"footer\">\n");
      out.write("                       <span>\n");
      out.write("                       <span>Don't have an account?</span>\n");
      out.write("                       <a href=\"EmployeeRegister.jsp\">Create an Account</a>\n");
      out.write("                       </span>\n");
      out.write("                        </div>\n");
      out.write("                      </form> \n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("    ");

        String status = request.getParameter("isvalid");
        if(status!=null && status.equals("Invalid user")){
      
      out.write("\n");
      out.write("        <script>\n");
      out.write("          alert(\"Invalid user_id or password!!\");\n");
      out.write("        </script>\n");
      out.write("        ");

           }
        
      out.write("\n");
      out.write("      \n");
      out.write("</html>\n");
      out.write("<!--style=\"height: 100px; margin-top: 90px; margin-left: 150px; margin-right: 200px; \"-->");
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
