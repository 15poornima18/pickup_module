package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ExpenseBill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("             <title>ExpensePage</title>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("             <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"CSS/expensestyle.css\">\n");
      out.write("             <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        <div>\n");
      out.write("            <ul>\n");
      out.write("            <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>       \n");
      out.write("            <li><a href=\"LogOut.jsp\">Sign Out</a></li>\n");
      out.write("            <li><a href=\"ExpenseBill.jsp\">Expenses</a></li>\n");
      out.write("            <li><a href=\"Bill.jsp\">Bill</a></li>\n");
      out.write("            <li><a href=\"RequestPage.jsp\">Request</a></li>\n");
      out.write("            <li><a href=\"PickupBoyProfile.jsp\">Profile</a></li>\n");
      out.write("            </ul>   \n");
      out.write("         </div>\n");
      out.write("         <div class=\"container\"  class=\"col-sm-6\" style=\"margin-top: 50px; height: 600px; background-color:white; \">\n");
      out.write("            <div class=\"row\">        \n");
      out.write("                 <form class=\"form-horizontal\" action=\"\" style=\"font-size: 20px;\">\n");
      out.write("                  <fieldset>\n");
      out.write("                    <h3 style=\"text-align: center; color: green; font-size: 35px; font-family: Gabriola;\">Expense Bill</h3><br>\n");
      out.write("                             <label style=\"color: green; align-items: center; text-align: center; margin-left: 50px;\">Billed To:</label>\n");
      out.write("        \n");
      out.write("                  <div class=\"form-group\" style=\"width: 50%; margin-left: 30px;\"> \n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"custid\">PickupBoy Id: </label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"custid\" \n");
      out.write("                        placeholder=\"\" name=\"cust_id\"> \n");
      out.write("                    </div>\n");
      out.write("                  </div> <br>\n");
      out.write("        \n");
      out.write("         <table cellspacing=\"10\" rules=\"all\" border=\"1\" id=\"Table1\" style=\"border-collapse: collapse; font-size: 20px; width: 52%; text-align: center; margin-left: 50px;\">\n");
      out.write("                    <tr style=\"color: green;\">\n");
      out.write("                        <th style=\"width:80px; text-align: center;\">S.no</th>\n");
      out.write("                        <th style=\"width:120px; text-align: center;\">Expenses_type</th>\n");
      out.write("                        <th style=\"width:120px; text-align: center;\">Reciept_img</th>\n");
      out.write("                        <th style=\"width:120px; text-align: center;\">Cost_of_expense</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"number\" name=\"no\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"exp_type\"> </td>\n");
      out.write("                        <td><input type=\"image\"></td>\n");
      out.write("                        <td><input type=\"number\" name=\"cost_exp\"></td>\n");
      out.write("          \n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div id=\"b1\">\n");
      out.write("                <a href=\"billpage.html\" >   \n");
      out.write("                    <button id=\"b2\" type=\"submit\" class=\"btn bg-success\" style=\"font-size:20px;\"> \n");
      out.write("                        Submit\n");
      out.write("                    </button> \n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("            </fieldset>\n");
      out.write("                 </form>      \n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
