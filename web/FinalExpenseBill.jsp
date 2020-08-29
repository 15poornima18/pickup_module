<%-- 
    Document   : FinalExpenseBill
    Created on : 18 Mar, 2020, 8:41:10 PM
    Author     : Poornima Tomar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
            <title>FinalExpensePage</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
            <link rel="stylesheet" href="CSS/FinalExpensestyle.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
</head>
<body>
        <div>
        <ul>
            <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>       
            <li><a href="LogOut.jsp">Sign Out</a></li>
            <li><a href="ExpenseBill.jsp">Expenses</a></li>
            <li><a href="Bill.jsp">Bill</a></li>
            <li><a href="RequestPage.jsp">Request</a></li>
            <li><a href="PickupBoyProfile.jsp">Profile</a></li>
         </ul>
        </div>
        <div class="invoice-box" style="margin-top: 50px; height: 900px; font-size: 20px;">
            <table cellpadding="0" cellspacing="0">
                <tr class="top">
                    <td colspan="2">
                        <table>
                            <tr>
                                <td class="title">
                                    <img src="Images/scrap1.jpeg" style="width:100%; max-width:200px;">
                                </td> 
                                <td>
                                    <label style="color: green;">Expense Bill No:</label><p>120</p>
                                    <label style="color: green;">Expense Bill Date:</label><p>March 17,2020</p>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                
                <!-- <tr class="information">
                    <td colspan="2">
                        <table>
                            <tr>
                                <td>
                                    <label style="color: green;">Billed To:</label><br>
                                        <label class="control-label col-sm-2" for="custid"></label><p>c1040</p> 
                                        <label  class="control-label col-sm-2" for="name"></label> <p>Ram Agarwal</p>
                                        <label  class="control-label col-sm-2" for="add"></label> <p>H-155 Vaishali Nagar,Bhopal</p>
                                        <label  class="control-label col-sm-2" for="cno"></label> <p>78965412365</p>
                                </td>
                                <td>
                                    <label style="color: green;">Billed From:</label><br>
                                        <label class="control-label col-sm-2" for="pkid"></label><p>pb101</p> 
                                        <label  class="control-label col-sm-2" for="name"></label> <p>Chirag Patil</p>
                                        <label  class="control-label col-sm-2" for="add"></label> <p>H-100 Vaishali Nagar,Bhopal</p>
                                        <label  class="control-label col-sm-2" for="cno"></label> <p>7854963214</p>
                                </td>            
                            </tr>
                        </table>
                    </td>
                </tr>-->
            </table>
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title" style="color: green; font-family: Gabriola; font-size: 25px;"><strong>Expense summary</strong></h3>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead style="color: green;">
                                        <tr>
                                            <td><strong>S.no</strong></td>
                                            <td class="text-center"><strong>Expense_type</strong></td>
                                            <td class="text-center"><strong>Reciept_img</strong></td>
                                            <td class="text-right"><strong>Cost_of_expense</strong></td>
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