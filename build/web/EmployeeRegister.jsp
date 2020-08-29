<%-- 
    Document   : EmployeeRegister
    Created on : 29 Feb, 2020, 9:37:36 PM
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
        <link rel="stylesheet" href="CSS/registerstyle.css">
       
        <script> 
            function validate()                                    
            { 
                var name = document.forms["RegForm"]["Name"];   
                var address = document.forms["RegForm"]["Address"];            
                var empid = document.forms["RegForm"]["Empid"];  
                var password = document.forms["RegForm"]["Password"];   
                var phone = document.forms["RegForm"]["Contact"];  
                var type =  document.forms["RegForm"]["EmployeeType"];  
                var sal = document.forms["RegForm"]["Salary"]; 
                 
               
                if (name.value == "")                                  
                { 
                    window.alert("Please enter your name."); 
                    name.focus(); 
                    return false; 
                } 
               
                if (address.value == "")                               
                { 
                    window.alert("Please enter your address."); 
                    address.focus(); 
                    return false; 
                } 
                   
                if (empid.value == "")                                   
                { 
                    window.alert("Please enter a valid e-mail address."); 
                    empid.focus(); 
                    return false; 
                } 
               
                if (phone.value == "")                           
                { 
                    window.alert("Please enter your telephone number."); 
                    phone.focus(); 
                    return false; 
                } 
               
                if (password.value == "")                        
                { 
                    window.alert("Please enter your password"); 
                    password.focus(); 
                    return false; 
                } 
               
                if (type.value == "")                  
                { 
                    alert("Please select your type."); 
                    type.focus(); 
                    return false; 
                } 
                if (sal.value == "")                        
                { 
                    window.alert("Please enter your salary."); 
                    sal.focus(); 
                    return false; 
                } 
               
               
                return true; 
            }</script> 

    </head>
    <body>
        <ul>
            <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>
<!--            <li><a href="EmployeePage.jsp">Sign Out</a></li>-->
            <li><a href="EmployeeRegister.jsp">Sign Up</a></li>
            <li><a href="EmployeeLogin.jsp">Sign In</a></li>
        </ul>
      <div class="container" style="height: 900px; width: 460px; margin-top: 50px; background-color:whitesmoke;">
        <div>
            <h3 style="text-align:center; margin-top: 30px; margin-bottom: 20px; font-size: 30px;">Create your account</h3>
        </div>
        <div  class="col-sm-8">
            <form class="loginform" name="RegForm" action="EmployeeRegisterServlet" onsubmit="return validate()" method="post" style="font-size:18px; ">  
                <p>Name: <input type="text" size=40 name="Name"></p><br>       
                <p>Address: <input type="text" size=40 name="Address"></p><br> 
                <p>Employee Id: <input type="text" size=40 name="Empid"></p><br> 
                <p>Password: <input type="password" size=40 name="Password"></p><br> 
                <p>Contact No: <input type="text" size=40 name="Contact"></p><br>   
                <p>Employee Type: <input type="text" size=40 name="EmployeeType"></p><br> 
                <p>Salary: <input type="text" size=40 name="Salary"></p><br> 

                <input id="b1" type="submit"  value="Register"   style="align-items: center;">

                 <br><br>
                   <div class="footer">
                       <span>
                  <span>Already had an account?</span>
                  <a href="EmployeeLogin.jsp">Sign in</a>
                       </span>
                   </div>
             </form> 
        </div>
    </div> 
    </body>
</html>
