<%-- 
    Document   : LoginEmployee
    Created on : 14 Jun, 2020, 9:24:45 AM
    Author     : Poornima Tomar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>ScrapKart Login Employee</title> 
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/logincss.css">
       
    </head>
    <body>
        <div>
            <ul>
            <li id="logo"><a href="index.html"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a></li>
            <li><a href="LogOut.jsp">Sign Out</a></li>
            <li><a href="EmployeeRegister.jsp">Sign Up</a></li>
            <li><a href="EmployeeLogin.jsp">Sign In</a></li>
            </ul>
        </div>
        <div class="container">
            <div class="row" >
                <div class="col-sm-3"></div>
                <div class="col-sm-6 loginform" style="background-color: ">
                    <h1 class="heading">Employee Login</h1><br>
                    <form method="post" action="EmployeeLoginServlet">
                        <label>Employee Id:</label><br>
                        <input type="text" name="employeeid" required><br><br>
                        <label>Password:</label><br>
                        <input type="password" name="password" required><br><br>
                        <label>Login As:</label><br>
                        <h4> <input type="radio" class="form-check-input" name="type" value="Manager">Manager</h4>
                        <h4><input type="radio" class="form-check-input" name="type" value="PickUp Boy">PickUp Boy</h4><br>

                        <input  type="submit" value="Submit"><br><br>
                    </form>

                </div>
                <div class="col-sm-3"></div>
            </div>
        </div>

    </body>
         
</html>