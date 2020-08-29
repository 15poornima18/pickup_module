<%-- 
    Document   : EmployeeLogin
    Created on : 29 Feb, 2020, 9:37:06 PM
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
        <link rel="stylesheet" href="CSS/loginstyle.css">
       
    </head>
    <body>
        <ul>        
            <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>       
<!--            <li><a href="EmployeePage.jsp">Sign Out</a></li>-->
             <li><a href="EmployeeRegister.jsp">Sign Up</a></li>
            <li><a href="EmployeeLogin.jsp">Sign In</a></li>
        </ul>
        
        
       <div class="container" >
        <div>
            <h3 style="text-align:center; margin-top: 30px; margin-bottom: 10px; margin-left: -20px; color: black; font-size: 30px;">Sign in to your account</h3>
        </div><br>
           <div  class="col-sm-8" style="height: 360px; width: 420px; margin-left: 350px;  background-color:whitesmoke; ">
                <div>
                    <form class="myform loginform" action="EmployeeLoginServlet" method="post" style="font-size: 18px; width:400px;"><br>
                        <label for="empid">Employee Id:</label>
                        <input type="text" id="empid" name="employeeid" placeholder="Employee id"><br>
                        <br>
                        <label for="pass">Password:</label>
                        <input type="password" id="pass" name="password" placeholder="Password">
                        <br><br>
                        <label for="pass">Employee Type:</label>
                        <label class="radio-inline">
                            <input type="radio" name="type" value="Manager">Manager
                        </label>
                        <label class="radio-inline" style="float:right;">
                              <input type="radio" name="type" value="Pickup Boy">Pickup Boy
                          </label>

                         <br><br> 
                       <input id="b2" type="submit"  value="Login" style="align-items: center;">

                        <br><br>
                        <div class="footer">
                       <span>
                       <span>Don't have an account?</span>
                       <a href="EmployeeRegister.jsp">Create an Account</a>
                       </span>
                        </div>
                      </form> 
                 </div>
            </div>
       </div>
    </body>
    <%
        String status = request.getParameter("isvalid");
        if(status!=null && status.equals("Invalid user")){
      %>
        <script>
          alert("Invalid user_id or password!!");
        </script>
        <%
           }
        %>
      
</html>
<!--style="height: 100px; margin-top: 90px; margin-left: 150px; margin-right: 200px; "-->