package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import pickupboy.pojo.Customer;
import java.util.ArrayList;
import pickupboy.model.EmployeeLoginDao;
import pickupboy.pojo.EmployeeProfile;

public final class FinalBill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("            <title>Customers Bill DashBoard</title>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"CSS/BillPagestyle.css\">\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script> \n");
      out.write("            \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      \n");
      out.write("        <div>\n");
      out.write("        <ul>\n");
      out.write("            <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>       \n");
      out.write("            <li><a href=\"Bill.jsp\">Bill</a></li>\n");
      out.write("            <li><a href=\"BillDashBoard.jsp\">ScrapKart Calculator</a></li>\n");
      out.write("            <li><a href=\"RequestPage.jsp\">Request</a></li>\n");
      out.write("            <li><a href=\"PickupBoyProfile.jsp\">Profile</a></li>\n");
      out.write("         </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"invoice-box\" style=\"margin-top: 50px; height: 900px; font-size: 20px; background-color: white;\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                <tr class=\"top\">\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"title\">\n");
      out.write("                                    <img src=\"Images/scrap1.jpeg\" style=\"width:100%; max-width:200px;\">\n");
      out.write("                                </td> \n");
      out.write("                                <td>\n");
      out.write("                                    <label style=\"color: green;\">Bill Date:</label><p>March 17,2020</p>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("         \n");
      out.write("                <tr class=\"information\">\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <label style=\"color: green;\">Billed To:</label><br>\n");
      out.write("                                        <label  class=\"control-label col-sm-2\" for=\"name\"></label> <p>RAM Agarwal</p>\n");
      out.write("                                        <label  class=\"control-label col-sm-2\" for=\"add\"></label> <p>H-155,Vaishali nagar,Bhopal</p>\n");
      out.write("                                        <label  class=\"control-label col-sm-2\" for=\"cno\"></label> <p>7895462135</p>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                       <td>\n");
      out.write("                          <label style=\"color: green;\">Billed From:</label><br>\n");
      out.write("                          <label  class=\"control-label col-sm-2\" for=\"name\"></label> <p>Chirag Patil</p>\n");
      out.write("                          <label  class=\"control-label col-sm-2\" for=\"add\"></label> <p>H-101,Nehru nagar,Bhopal</p>\n");
      out.write("                          <label  class=\"control-label col-sm-2\" for=\"cno\"></label> <p>123654789</p>\n");
      out.write("                        </td>            \n");
      out.write("                       </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                       \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\" style=\"color: green;  font-size: 25px;\"><strong>Items summary</strong></h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-condensed\">\n");
      out.write("                                    <thead style=\"color: green;\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td><strong>Items</strong></td>\n");
      out.write("                                            <td class=\"text-center\"><strong>Rate(per kg)</strong></td>\n");
      out.write("                                            <td class=\"text-center\"><strong>Weight(in kg)</strong></td>\n");
      out.write("                                            <td class=\"text-right\"><strong>Totals</strong></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <!-- foreach ($order->lineItems as $line) or some such thing here -->\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td><p>Books</p></td>\n");
      out.write("                                            <td class=\"text-center\"><p>10</p></td>\n");
      out.write("                                            <td class=\"text-center\"><p>1</p></td>\n");
      out.write("                                            <td class=\"text-right\"><p>10</p></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td><p>Tin</p></td>\n");
      out.write("                                            <td class=\"text-center\"><p>20</p></td>\n");
      out.write("                                            <td class=\"text-center\"><p>3</p></td>\n");
      out.write("                                            <td class=\"text-right\"><p>60</p></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td><p>Aluminium</p></td>\n");
      out.write("                                            <td class=\"text-center\"><p>60</p></td>\n");
      out.write("                                            <td class=\"text-center\"><p>1</p></td>\n");
      out.write("                                            <td class=\"text-right\"><p>60</p></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"thick-line\"></td>\n");
      out.write("                                            <td class=\"thick-line\"></td>\n");
      out.write("                                            <td class=\"thick-line text-center\"><strong>Subtotal</strong></td>\n");
      out.write("                                            <td class=\"thick-line text-right\"><p>600</p></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <!-- <tr>\n");
      out.write("                                            <td class=\"no-line\"></td>\n");
      out.write("                                            <td class=\"no-line\"></td>\n");
      out.write("                                            <td class=\"no-line text-center\"><strong>Shipping</strong></td>\n");
      out.write("                                            <td class=\"no-line text-right\"><p>15</p></td>\n");
      out.write("                                        </tr> -->\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"no-line\"></td>\n");
      out.write("                                            <td class=\"no-line\"></td>\n");
      out.write("                                            <td class=\"no-line text-center\"><strong>Total</strong></td>\n");
      out.write("                                            <td class=\"no-line text-right\"><p>685</p></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("</body>\n");
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
