package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BillDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=PT+Sans|Roboto+Mono&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/calculator.css\">\n");
      out.write("    <title>Bill DashBoard</title>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("    <ul >        \n");
      out.write("            <a href=\"EmployeePage.jsp\"><img src=\"Images/scrap1.jpeg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a>       \n");
      out.write("            <li><a href=\"EmployeePage.jsp\">Sign Out</a></li>\n");
      out.write("            <li><a href=\"BillDashBoard.jsp\">Bill</a></li>\n");
      out.write("            <li><a href=\"ReqDashBoard.jsp\">Request</a></li>\n");
      out.write("            <li><a href=\"PickupBoyProfile.jsp\">Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("       \n");
      out.write("        <div class=\"row\" >\n");
      out.write("            <h3>\n");
      out.write("                <img class =\"gif\"src=\"Images/new.gif\"><strong>SCRAPKART BILL CALCULATOR</strong>\n");
      out.write("            </h3>\n");
      out.write("            <p>Select Scrap Items and enter an approximate weight </p><br>\n");
      out.write("            \n");
      out.write("<!--        <div class=\"col-sm-10\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"custid\" style=\"font-size: 20px; color: green; margin-left: 40px;\">Customer Id:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"custid\" \n");
      out.write("                   placeholder=\"\" name=\"cust_id\" required=\"\" style=\"width: 30%; margin-left: 20px;\"> \n");
      out.write("        </div>-->\n");
      out.write("           <a href=\"#amount\"><button type=\"button\" class=\"btn btn-warning\"  id=\"calculate\" onclick=\"on();\">Generate Bill</button></a>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("        <!--background-color:rgba(178,238,144,0.695);-->\n");
      out.write("        <div class=\"container Details\" style=\"background-color:whitesmoke ; border-radius: 7px;\">\n");
      out.write("            <div class=\"table-responsive\">          \n");
      out.write("                <table class=\"table\" >\n");
      out.write("                    <thead style=\"color: green;\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Items</th>\n");
      out.write("                      <th>Rate (per kg)</th>\n");
      out.write("                      <th>Weight(in kg)</th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tbody class=\"mycontent\">\n");
      out.write("                    <tr>\n");
      out.write("                      <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Books</span></td>\n");
      out.write("                      <td>7</td>\n");
      out.write("                      <td ><div class=\"form-group placebox\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                      </div>\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Aluminium</span></td>\n");
      out.write("                        <td>75</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Iron</span></td>\n");
      out.write("                        <td>14</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Newpapers</span></td>\n");
      out.write("                        <td>8</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Hard plastic</span></td>\n");
      out.write("                        <td>8</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Brass</span></td>\n");
      out.write("                        <td>100</td>\n");
      out.write("                        <td><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Carton_House</span></td>\n");
      out.write("                        <td>5</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Carton_Shop</span></td>\n");
      out.write("                        <td>6</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Polythene</span></td>\n");
      out.write("                        <td>6</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("  \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Tin</span></td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Steel</span></td>\n");
      out.write("                        <td>23</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Tyre</span></td>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Water/Oilcovers</span></td>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Fibre</span></td>\n");
      out.write("                        <td>7</td>\n");
      out.write("                        <td><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>E-Waste</span></td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Water/Oilcovers</span></td>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>Fibre</span></td>\n");
      out.write("                        <td>7</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"checkbox\" class=\"form-check-input\" value=\"\" onclick=\"able();\"><span>E-Waste</span></td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td ><div class=\"form-group placebox\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Weight\" name=\"text1\" disabled>\n");
      out.write("                          </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                  </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"amount\" onclick=\"off();\">\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    function on()\n");
      out.write("    {\n");
      out.write("    document.getElementById(\"calculate\").disabled=true;\n");
      out.write("    createTable();\n");
      out.write("    document.getElementById(\"amount\").style.display =\"block\";\n");
      out.write("  \n");
      out.write("   \n");
      out.write("    \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function off()\n");
      out.write("  {\n");
      out.write("    document.getElementById(\"amount\").style.display=\"none\";\n");
      out.write("    var elem=document.getElementById(\"amount\");\n");
      out.write("    elem.innerHTML=\"\";\n");
      out.write("    document.getElementById(\"calculate\").disabled=false;\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  function able()\n");
      out.write("  {\n");
      out.write("    var flag=0;\n");
      out.write("    var l= document.getElementsByTagName(\"TABLE\")[0].getElementsByClassName(\"mycontent\")[0].rows.length;\n");
      out.write("\n");
      out.write("    var base=document.getElementsByTagName(\"TABLE\")[0].getElementsByClassName(\"mycontent\")[0];\n");
      out.write("\n");
      out.write("    for(var i=0;i<l;i++)\n");
      out.write("    {\n");
      out.write("      var check= base.rows[i].getElementsByClassName(\"form-check-input\")[0].checked;\n");
      out.write("      var amt=base.rows[i].getElementsByClassName(\"form-control\")[0].value;\n");
      out.write("      if(check)\n");
      out.write("      {\n");
      out.write("          document.getElementsByClassName(\"form-control\")[i].disabled=false;\n");
      out.write("          flag=1;\n");
      out.write("      }\n");
      out.write("      else{\n");
      out.write("        document.getElementsByClassName(\"form-control\")[i].disabled=true;\n");
      out.write("        base.rows[i].getElementsByClassName(\"form-control\")[0].value=\"\";\n");
      out.write("        flag=0;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  function createTable(){\n");
      out.write("\n");
      out.write("    var table=document.createElement(\"table\");\n");
      out.write("    table.setAttribute('id','calTable');\n");
      out.write("    var arrHead=new Array();\n");
      out.write("    arrHead=['Selected Item','Rate (Rs/kg)','Entered Quantity (in kg)'];\n");
      out.write("\n");
      out.write("    var arrValue=new Array();\n");
      out.write("    var l= document.getElementsByTagName(\"TABLE\")[0].getElementsByClassName(\"mycontent\")[0].rows.length;\n");
      out.write("\n");
      out.write("    var base=document.getElementsByTagName(\"TABLE\")[0].getElementsByClassName(\"mycontent\")[0];\n");
      out.write("    \n");
      out.write("    var sum=0;\n");
      out.write("    for(var i=1;i<l;i++)\n");
      out.write("    {\n");
      out.write("      var check= base.rows[i].getElementsByClassName(\"form-check-input\")[0].checked;\n");
      out.write("\n");
      out.write("      var x=base.rows[i].getElementsByTagName(\"SPAN\")[0].innerHTML;\n");
      out.write("      var r= base.rows[i].getElementsByTagName(\"TD\")[1].innerHTML;\n");
      out.write("      var amt=base.rows[i].getElementsByClassName(\"form-control\")[0].value;\n");
      out.write("     \n");
      out.write("      if(check )\n");
      out.write("      {\n");
      out.write("        arrValue.push([x,r,amt]);\n");
      out.write("        sum+=r*amt;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    var tr=table.insertRow(-1);\n");
      out.write("\n");
      out.write("    for(var h=0;h<arrHead.length;h++)\n");
      out.write("    {\n");
      out.write("      var th = document.createElement('th');  \n");
      out.write("      th.innerHTML=arrHead[h];\n");
      out.write("      tr.appendChild(th);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    for (var c = 0; c <= arrValue.length - 1; c++)\n");
      out.write("     {\n");
      out.write("            tr = table.insertRow(-1);\n");
      out.write("\n");
      out.write("            for (var j = 0; j < arrHead.length; j++) \n");
      out.write("            {\n");
      out.write("                var td = document.createElement('td');          // TABLE DEFINITION.\n");
      out.write("                td = tr.insertCell(-1);\n");
      out.write("                td.innerHTML = arrValue[c][j];                  // ADD VALUES TO EACH CELL.\n");
      out.write("            }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      document.getElementById(\"amount\").appendChild(table);\n");
      out.write("      var div=document.createElement('div');\n");
      out.write("      div.innerHTML= \"Amount is: \"+sum+\" Rupees\";\n");
      out.write("      div.setAttribute(\"id\",'result');\n");
      out.write("      document.getElementById(\"amount\").appendChild(div);\n");
      out.write("      var button=document.createElement(\"input\");\n");
      out.write("      button.setAttribute(\"value\",'Scroll To Top');\n");
      out.write("      button.setAttribute(\"id\",\"mybtn\");\n");
      out.write("      button.setAttribute('type',\"button\");\n");
      out.write("      document.getElementById(\"amount\").appendChild(button);\n");
      out.write("      button.setAttribute(\"onclick\",\"funcScroll()\");\n");
      out.write("\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function funcScroll()\n");
      out.write("  {\n");
      out.write("    document.body.scrollTop = 0;\n");
      out.write("  document.documentElement.scrollTop = 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // function funcFooter(){\n");
      out.write("  //     var newelem=document.createElement(\"div\");\n");
      out.write("  //     newelem.setAttribute(\"id\",\"info\");\n");
      out.write("  //     document.getElementById(\"info\").innerHTML=\"Give the terms and Conditions\";\n");
      out.write("  //     document.getElementById(\"info\").style.display=\"block\";\n");
      out.write("      \n");
      out.write("  // }\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</script>\n");
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
