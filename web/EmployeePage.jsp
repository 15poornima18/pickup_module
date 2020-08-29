<%-- 
    Document   : EmployeePage
    Created on : 23 Feb, 2020, 11:25:28 PM
    Author     : Poornima Tomar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="CSS/empstyle.css">
        <title>Employee DashBoard</title>
    </head>
    <body>
        <ul>
            <a href="index.html"><a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a></a>
            <li><a href="EmployeeRegister.jsp">Sign Up</a></li>
            <li><a href="EmployeeLogin.jsp">Sign In</a></li>
        </ul>
        <div class="container" >
            <div class="row">
            <div class="col-sm-3"></div>
                <div class="col-sm-6 loginform">
                    <h1 class="heading">Employee Login</h1><br>
                        <form action="EmployeeLoginServlet" method="post">
                            <label for="empid">Employee Id:</label><br>
                            <input type="text" id="empid" name="employeeid" placeholder="Employee id" required><br>
                            <br>
                            <label for="pass">Password:</label><br>
                            <input type="password" id="pass" name="password" placeholder="Password" required><br>
                            <br>
                            <label for="pass">Login As:</label><br>
                             <label class="radio-inline" style="color: black;">
                                 <input type="radio" name="type" value="Manager" required>Manager
                             </label>
                            <label class="radio-inline" style="color: black;">
                                <input type="radio" name="type"  value="Pickup Boy" required>Pickup Boy
                            </label>
                            <br><br>
                           <input  type="submit" value="Submit"><br><br>
                             </form> 
                        <div class="col-sm-3"></div>

                </div>
            </div>
        </div>
         </body>
         
      <%
          String status = request.getParameter("isvalid");
          if(status!=null && status.equals("false")){
      %>
      
        <script>
          alert("Invalid user_id or password!!");
        </script>
        <%
        }
        %>
       
        
         
</html>


                     
 											 