package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pickupboy.pojo.ViewRequestM2;
import java.util.Iterator;
import java.util.ArrayList;
import pickupboy.pojo.Request;
import pickupboy.model.EmployeeLoginDao;

public final class ReqDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Request DashBoard PickUpBoy</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/ReqDashBoardStyle.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("         <ul>\n");
      out.write("             <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>\n");
      out.write("            <li><a href=\"EmployeePage.jsp\">Sign Out</a></li>\n");
      out.write("            <li><a href=\"BillDashBoard.jsp\">Bill</a></li>\n");
      out.write("            <li><a href=\"ReqDashBoard.jsp\">Request</a></li>\n");
      out.write("            <li><a href=\"PickupBoyProfile.jsp\">Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("      ");
 String user = (String)session.getAttribute("User_id");

             ArrayList<ViewRequestM2> reqList = EmployeeLoginDao.getTodaysRequest(user);
         
      out.write("\n");
      out.write("    <div class=\"major\">\n");
      out.write("    <div class=\"minor1\">\n");
      out.write("         <form>\n");
      out.write("            <h3>Filters</h3>\n");
      out.write("            <br>\n");
      out.write("            <a onclick=\"enable()\" class=\"resetAnchor\" > <p style=\"color:graytext; font-size: small;float:right\" onMouseOver=\"this.style.color=red\" onMouseOut=\"this.style.color=gray\">Reset Filters</p></a>\n");
      out.write("            <label for=\"Date\">Search by Date Range</label><br>\n");
      out.write("            <label> From</label><br>\n");
      out.write("            <a onclick=\"disable2()\"><input type=\"date\" name=\"fromDate\"></a>\n");
      out.write("            <label> To</label><br>\n");
      out.write("            <a onclick=\"disable2()\"><input type=\"date\" name=\"toDate\"></a><br>\n");
      out.write("            <input onclick=\"searchReq()\" type=\"submit\" value=\"Search\" style=\"background-color: orange;\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    <button onclick=\"todaysReq()\" class=\"refresh\" style=\"background-color:rgb(0, 0, 255); border-radius: 5px; color: white;\" >\n");
      out.write("        <img src=\"Images/prod4.png\" height=\"20\" width=\"20\">\n");
      out.write("        <span>Today's Requests</span>  \n");
      out.write("     </button>\n");
      out.write("        \n");
      out.write("     <button onclick=\"allReq()\" class=\"refresh\" style=\"background-color:red; border-radius: 5px; color:white;\" >\n");
      out.write("        <img src=\"Images/prod4.png\" height=\"20\" width=\"20\" >\n");
      out.write("        <span>All Requests</span>\n");
      out.write("     </button>\n");
      out.write("        <div >\n");
      out.write("         <table class=\"table-responsive table-condensed table-stripped\" text-align=\"center\" style=\"font-size: 15px; background-color: whitesmoke;\">\n");
      out.write("            <thead>\n");
      out.write("            <tr style=\"color: green\">\n");
      out.write("                <th>Req_id</th>\n");
      out.write("                <th>Request_Type</th>\n");
      out.write("                <th>Req_date</th>\n");
      out.write("                <th>Customer_id</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Schedule_date</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("         ");

         if(reqList != null) 
         {
           Iterator<ViewRequestM2> iterator = reqList.iterator();
           while(iterator.hasNext()) 
            {
            ViewRequestM2 req = iterator.next();
        
      out.write("\n");
      out.write("               <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                    <td>");
      out.print(req.getReqId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getRequest());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getReq_date());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getCust_id());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getAddress());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getSchedule());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(req.getStatus());
      out.write("</td>\n");
      out.write("\n");
      out.write("                   </tr>\n");
      out.write("              </tbody>\n");

}
}

      out.write("\n");
      out.write("\n");
      out.write("             </table>\n");
      out.write("          </div> \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     <script>\n");
      out.write("        function todaysReq() {\n");
      out.write("wind ow.open(\"ReqDashBoard.jsp\",\"_self\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("        </script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function allReq()\n");
      out.write("{\n");
      out.write("window.open(\"ReqDashBoardM2.jsp\",\"_self\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function searchReq()\n");
      out.write("{\n");
      out.write("window.open(\"ReqDashBoardM3.jsp\",\"_self\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("</body>\n");
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
