package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import pickupboy.model.EmployeeLoginDao;
import pickupboy.pojo.EmployeeProfile;
import pickupboy.dbutil.PickUpDBUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class EditPickupBoyProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        </script> \n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"> </script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/editstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <ul> \n");
      out.write("         <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>\n");
      out.write("            <li><a href=\"LogOut.jsp\">Sign Out</a></li>\n");
      out.write("<!--            <li><a href=\"ExpenseBill.jsp\">Expenses</a></li>-->\n");
      out.write("            <li><a href=\"BillDashBoard.jsp\">Bill</a></li>\n");
      out.write("            <li><a href=\"ReqDashBoard.jsp\">Request</a></li>\n");
      out.write("            <li><a href=\"PickupBoyProfile.jsp\">Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-top: 50px; height: 600px;\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-12\" style=\"height: 500px;\">\n");
      out.write("                     <div class=\"col1\">\n");
      out.write("                         <form class=\"myform\" action=\"EmployeeEditServlet\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("                             <fieldset>\n");
      out.write("                            <h3 style=\"text-align: center; color: green; font-family:Gabriola; font-size: 35px\">Edit Profile</h3><br>\n");
      out.write("                            <div class=\"form-group\" style=\"width: 50%;\"> \n");
      out.write("                                <label class=\"control-label col-sm-2\" for=\"name\">Name:</label>\n");
      out.write("                                   <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" \n");
      out.write("                                           id=\"name\" placeholder=\"Enter Name\"\n");
      out.write("                                           name=\"name\" > \n");
      out.write("                                   </div>\n");
      out.write("                             </div>\n");
      out.write("                                <br><br>\n");
      out.write("<!--                                <div class=\"form-group\" style=\"width: 50%;\"> \n");
      out.write("                                    <label class=\"control-label col-sm-2\" for=\"empid\">Employee Id:</label> \n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"empid\"  \n");
      out.write("                                        placeholder=\"pb101\" name=\"empid\"> \n");
      out.write("                                    </div>\n");
      out.write("                                </div>-->\n");
      out.write("                               <br><br>\n");
      out.write("                                   <div class=\"form-group\" style=\"width: 50%;\">\n");
      out.write("                                    <label class=\"control-label col-sm-2\" for=\"contact\">Contact No:</label> \n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"contact\" \n");
      out.write("                                        placeholder=\"+91\" name=\"contact\"  > \n");
      out.write("                                        </div>\n");
      out.write("                                </div> \n");
      out.write("                               <br><br>\n");
      out.write("                                <div class=\"form-group\" style=\"width: 50%;\"> \n");
      out.write("                                    <label class=\"control-label col-sm-2\" for=\"add\">Address:</label> \n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                     <input type=\"text\" class=\"form-control\" id=\"add\" \n");
      out.write("                                            placeholder=\"Enter Address\" name=\"add\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                               <br><br>\n");
      out.write("                                <div class=\"form-group\" style=\"width: 50%;\"> \n");
      out.write("                                    <label class=\"control-label col-sm-2\" for=\"sal\">Salary:</label> \n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"sal\" \n");
      out.write("                                        placeholder=\"Enter Salary\" name=\"sal\"> \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <br><br> \n");
      out.write("                                  \n");
      out.write("                                <div class=\"form-group\" style=\"width: 50%;\"> \n");
      out.write("                                    <label class=\"control-label col-sm-2\" for=\"sal\">Type:</label> \n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                     <input type=\"text\" class=\"form-control\" id=\"type\" \n");
      out.write("                                        placeholder=\"Enter Service Type\" name=\"type\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div><br><br> \n");
      out.write("                          \n");
      out.write("                                <div>\n");
      out.write("<!--                            <a href=\"PickupBoyProfile.jsp\">   \n");
      out.write("                                <button  id=\"b1\" type=\"submit\" class=\"btn bg-success\" style=\"font-size: 20px;\"> \n");
      out.write("                                    Submit\n");
      out.write("                                </button> \n");
      out.write("                               </a>-->\n");
      out.write("   <input  type=\"submit\" value=\"Submit\"  style=\"background-color: green; color:white; text-align:center;float:right; font-size:20px; margin-left:20px; padding-top: 6px; padding-bottom: 4px; \"><br><br>\n");
      out.write("\n");
      out.write("<button type=“button”  class=\"btn btn-success \" style=\"background-color: green; color:white; text-align:center;float:right; font-size:20px; margin-left:20px;font-weight: bold;\"><a href=\"PickupBoyProfile.jsp\">Back</a></button>\n");
      out.write("  \n");
      out.write("<!--                                <a href='PickupBoyProfile.jsp'>\n");
      out.write("                                    <button id=\"b2\" type=\"submit\" class=\"btn bg-success\" style=\"font-size: 20px;\"> \n");
      out.write("                                      Back\n");
      out.write("                                     </button>\n");
      out.write("                                </a>-->\n");
      out.write("                                </div\n");
      out.write("                             </fieldset>    \n");
      out.write("                         </form>                    \n");
      out.write("                     </div>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("                </div>             \n");
      out.write("    </body>\n");
      out.write("     ");

        String status = request.getParameter("Editisvalid");
        if(status!=null && status.equals("true")){
      
      out.write("\n");
      out.write("        <script>\n");
      out.write("          alert(\"Edit is successfull!!\");\n");
      out.write("        </script>\n");
      out.write("        ");

           }
        
      out.write("\n");
      out.write("     \n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" ");
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
