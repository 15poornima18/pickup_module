<%-- 
    Document   : ExpenseBill
    Created on : 18 Mar, 2020, 8:40:50 PM
    Author     : Poornima Tomar
--%>
   <table class="table table-striped table-responsive" cellspacing="10" rules="all" border="1" id="Table1" style="border-collapse: collapse; font-size: px; width: 52%;  margin-left: 50px;">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
             <title>ExpensePage</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
             <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
            <link rel="stylesheet" href="CSS/expensestyle.css">
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
         <div class="container"  class="col-sm-6" style="margin-top: 50px; height: 600px; background-color:white; ">
            <div class="row">        
                 <form class="form-horizontal" action="" style="font-size: 20px;">
                  <fieldset>
                    <h3 style="text-align: center; color: green; font-size: 35px; font-family: Gabriola;">Expense Bill</h3><br>
                             <label style="color: green; align-items: center; text-align: center; margin-left: 50px;">Billed To:</label>
        
                  <div class="form-group" style="width: 50%; margin-left: 30px;"> 
                    <label class="control-label col-sm-2" for="custid">PickupBoy Id: </label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="custid" 
                        placeholder="" name="cust_id"> 
                    </div>
                  </div> <br>
        
         <table cellspacing="10" rules="all" border="1" id="Table1" style="border-collapse: collapse; font-size: 20px; width: 52%; text-align: center; margin-left: 50px;">
                    <tr style="color: green;">
                        <th style="width:80px; text-align: center;">S.no</th>
                        <th style="width:120px; text-align: center;">Expenses_type</th>
                        <th style="width:120px; text-align: center;">Reciept_img</th>
                        <th style="width:120px; text-align: center;">Cost_of_expense</th>
                    </tr>
                    <tr>
                        <td><input type="number" name="no"></td>
                        <td><input type="text" name="exp_type"> </td>
                        <td><input type="image"></td>
                        <td><input type="number" name="cost_exp"></td>
          
                    </tr>
                   
                </table>
                <br>

                <div id="b1">
                <a href="billpage.html" >   
                    <button id="b2" type="submit" class="btn bg-success" style="font-size:20px;"> 
                        Submit
                    </button> 
                    </a>
                </div>
                  
            </fieldset>
                 </form>      
                 </div>
             </div>
        
            
 </body>
</html>






