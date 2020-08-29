<%-- 
    Document   : LogOut
    Created on : 16 Mar, 2020, 10:06:03 PM
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
        <title>Logout Page</title>
        <style>
   body{ 
       font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;

       /*font-family: Gabriola;*/
    /*font-weight: bold;*/
    background-repeat: no-repeat; 
    background-size: 100%;
    background-color:whitesmoke;
/*  background: linear-gradient(90deg, orange,white,green);*/
/*      background: linear-gradient(90deg, green,orange,cyan);*/

/* background:  repeating-linear-gradient(
      25deg,
      white 0px,
      white 40px,
      green 40px,
      green 80px
    );*/

    
 }
/* ul{
    border: 0.2 solid black;
    list-style-type: none;
    margin-top: 0;
    margin-bottom: 0;
    padding: 0;
    overflow: hidden;
    background-color: white;
    position: fixed;
    width: 100%;
    top: 0;
    box-shadow:5px 10px 10px #888888;
}*/
ul{
    list-style-type: none;
   margin-top: 15px;
    margin-bottom: 15px;
    overflow: hidden;
    background-color: white;
    box-shadow:5px 10px 10px #888888;
}

 li{
    float: right;
    margin-top: 0;
    text-align: center;
    padding-left: 15px;
    padding-right: 15px;
    text-decoration: none;
    font-size:20px;
}
li a{
    display: block;
    color: green;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
a:hover{
    color:orangered;
    cursor:pointer;   
    text-decoration: none;
}
li:hover
{
    color:orangered;
    cursor:pointer;  
}

li a:hover:not(.active) {
    background-color:white;
   
} 
.active {
    background-color: #4CAF50;
 } 
img{
   float: left;
   margin-left: 00px;
}   
.heading{
   text-align: center;
   color: green;
}
.myform{
    margin-top: 10px;
    text-align: center;
    font-size: 20px;
    opacity: 1;
    padding: 20px;
    background-color:wheat;
    height: 540%;
    width: 100%;
}
.col1{
    height: 110px;
    margin-top: 50px;
    padding: 0;
    
}
            </style>
    </head>
    <body style="background-color: whitesmoke;">
        <ul>
             <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>
             <li><a href="EmployeeRegister.jsp">Sign Up</a></li>
              <li><a href="EmployeeLogin.jsp">Sign In</a></li>
        </ul>
      
<%
session.invalidate();
%>
<div style="margin-top:100px;">
       <p style="color:blue; font-size: 30px; text-align: center; ">You have been successfully logout!!</p>
  </div>
    </body>
</html>
