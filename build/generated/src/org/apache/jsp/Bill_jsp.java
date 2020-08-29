package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"> </script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=PT+Sans|Roboto+Mono&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/billstyle.css\">\n");
      out.write("    <title>Bill DashBoard</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("    <ul>\n");
      out.write("        <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>\n");
      out.write("        <li><a href=\"EmployeePage.jsp\">Sign Out</a></li>\n");
      out.write("        <li><a href=\"Bill.jsp\">Bill</a></li>\n");
      out.write("        <li><a href=\"BillDashBoard.jsp\">ScrapKart Calculator</a></li>\n");
      out.write("        <li><a href=\"ReqDashBoard.jsp\">Request</a></li>\n");
      out.write("        <li><a href=\"PickupBoyProfile.jsp\">Profile</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("<div class=\"container\"  class=\"col-sm-8\" style=\"margin-top: 50px; height: 900px; background-color:white; \">\n");
      out.write("    <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-12\" style=\"height: 1250px; background-color:whitesmoke;  \"> \n");
      out.write("\n");
      out.write("         <form class=\"form-horizontal\" action=\"\" style=\"font-size: 20px; overflow: hidden;\">\n");
      out.write("          <fieldset>\n");
      out.write("            <h3 style=\"text-align: center; color: green; font-size: 35px;\">ScrapKart Bill</h3><br>\n");
      out.write("                <label style=\"color: green; align-items: center; text-align: center; margin-left: 50px;\">Billed To:</label>\n");
      out.write("          <div class=\"form-group\" style=\"width: 50%; margin-left: 30px;\"> \n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"custid\">Customer Id:</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"custid\" \n");
      out.write("                placeholder=\"\" name=\"cust_id\"> \n");
      out.write("            </div>\n");
      out.write("          </div> <br>\n");
      out.write("   <table class=\"table table-responsive\" >\n");
      out.write("            <tr style=\"color: green; text-align: center;\">\n");
      out.write("                <th style=\"width:120px; text-align: center;\">Item</th>\n");
      out.write("                <th style=\"width:120px; text-align: center;\">Cost</th>\n");
      out.write("                <th style=\"width:120px; text-align: center;\">Weight</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td><input type=\"checkbox\" >  Book </td>\n");
      out.write("                <td>6</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Aluminium </td>\n");
      out.write("                <td>75</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Iron </td>\n");
      out.write("                <td>14</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  NewsPaper </td>\n");
      out.write("                <td>13</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Hard Plastic </td>\n");
      out.write("                <td>8</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("               <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Brass </td>\n");
      out.write("                <td>180</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Carton_house </td>\n");
      out.write("                <td>5</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("               <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Carton_shop </td>\n");
      out.write("                <td>6</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Polythene </td>\n");
      out.write("                <td>4</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Tin </td>\n");
      out.write("                <td>10</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Steel </td>\n");
      out.write("                <td>23</td> \n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("               <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Tyre</td>\n");
      out.write("                <td>3</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  Fiber </td>\n");
      out.write("                <td>7</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\">  E-waste </td>\n");
      out.write("                <td>10</td>\n");
      out.write("                <td><input type=\"number\" name=\"weight\"></td>\n");
      out.write("\n");
      out.write("            </tr>   \n");
      out.write("        </table>\n");
      out.write("    \n");
      out.write("        <br>\n");
      out.write("        <div id=\"b1\">\n");
      out.write("        <a href=\"FinalBill.jsp\" >   \n");
      out.write("            <label id=\"b2\" type=\"submit\" class=\"btn bg-success\" style=\"font-size:20px; background-color: green;\"> \n");
      out.write("                Submit\n");
      out.write("            </label> \n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("    </fieldset>\n");
      out.write("         </form>      \n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("</body>\n");
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
