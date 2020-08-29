<%-- 
    Document   : FinalBill
    Created on : 18 Mar, 2020, 8:40:26 PM
    Author     : Poornima Tomar
--%>

<%@page import="java.util.Iterator"%>
<%@page import="pickupboy.pojo.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pickupboy.model.EmployeeLoginDao"%>
<%@page import="pickupboy.pojo.EmployeeProfile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
            <title>Customers Bill DashBoard</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
            <link rel="stylesheet" href="CSS/BillPagestyle.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
            
</head>
<body>
      
        <div>
        <ul>
            <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>       
            <li><a href="Bill.jsp">Bill</a></li>
            <li><a href="BillDashBoard.jsp">ScrapKart Calculator</a></li>
            <li><a href="RequestPage.jsp">Request</a></li>
            <li><a href="PickupBoyProfile.jsp">Profile</a></li>
         </ul>
        </div>
        
        <div class="invoice-box" style="margin-top: 50px; height: 900px; font-size: 20px; background-color: white;">
            <table cellpadding="0" cellspacing="0">
                <tr class="top">
                    <td colspan="2">
                        <table>
                            <tr>
                                <td class="title">
                                    <img src="Images/scrap1.jpeg" style="width:100%; max-width:200px;">
                                </td> 
                                <td>
                                    <label style="color: green;">Bill Date:</label><p>March 17,2020</p>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
         
                <tr class="information">
                    <td colspan="2">
                        <table>
                            <tr>
                                <td>
                                    <label style="color: green;">Billed To:</label><br>
                                        <label  class="control-label col-sm-2" for="name"></label> <p>RAM Agarwal</p>
                                        <label  class="control-label col-sm-2" for="add"></label> <p>H-155,Vaishali nagar,Bhopal</p>
                                        <label  class="control-label col-sm-2" for="cno"></label> <p>7895462135</p>
                                </td>

                       <td>
                          <label style="color: green;">Billed From:</label><br>
                          <label  class="control-label col-sm-2" for="name"></label> <p>Chirag Patil</p>
                          <label  class="control-label col-sm-2" for="add"></label> <p>H-101,Nehru nagar,Bhopal</p>
                          <label  class="control-label col-sm-2" for="cno"></label> <p>123654789</p>
                        </td>            
                       </tr>

                        </table>
                       
                    </td>
                </tr>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title" style="color: green;  font-size: 25px;"><strong>Items summary</strong></h3>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead style="color: green;">
                                        <tr>
                                            <td><strong>Items</strong></td>
                                            <td class="text-center"><strong>Rate(per kg)</strong></td>
                                            <td class="text-center"><strong>Weight(in kg)</strong></td>
                                            <td class="text-right"><strong>Totals</strong></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <!-- foreach ($order->lineItems as $line) or some such thing here -->
                                        <tr>
                                            <td><p>Books</p></td>
                                            <td class="text-center"><p>10</p></td>
                                            <td class="text-center"><p>1</p></td>
                                            <td class="text-right"><p>10</p></td>
                                        </tr>
                                        <tr>
                                            <td><p>Tin</p></td>
                                            <td class="text-center"><p>20</p></td>
                                            <td class="text-center"><p>3</p></td>
                                            <td class="text-right"><p>60</p></td>
                                        </tr>
                                        <tr>
                                            <td><p>Aluminium</p></td>
                                            <td class="text-center"><p>60</p></td>
                                            <td class="text-center"><p>1</p></td>
                                            <td class="text-right"><p>60</p></td>
                                        </tr>
                                        <tr>
                                            <td class="thick-line"></td>
                                            <td class="thick-line"></td>
                                            <td class="thick-line text-center"><strong>Subtotal</strong></td>
                                            <td class="thick-line text-right"><p>600</p></td>
                                        </tr>
                                        <!-- <tr>
                                            <td class="no-line"></td>
                                            <td class="no-line"></td>
                                            <td class="no-line text-center"><strong>Shipping</strong></td>
                                            <td class="no-line text-right"><p>15</p></td>
                                        </tr> -->
                                        <tr>
                                            <td class="no-line"></td>
                                            <td class="no-line"></td>
                                            <td class="no-line text-center"><strong>Total</strong></td>
                                            <td class="no-line text-right"><p>685</p></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            
</body>
</html>