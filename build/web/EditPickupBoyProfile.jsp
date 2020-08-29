<%-- 
    Document   : EditPickupBoyProfile
    Created on : 23 Feb, 2020, 11:39:10 PM
    Author     : Poornima Tomar
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pickupboy.model.EmployeeLoginDao"%>
<%@page import="pickupboy.pojo.EmployeeProfile"%>
<%@page import="pickupboy.dbutil.PickUpDBUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        </script> 
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"> </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="CSS/editstyle.css">
        <title>Edit DashBoard</title>
    </head>
    <body>
        
        <ul> 
         <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>
            <li><a href="EmployeePage.jsp">Sign Out</a></li>
            <li><a href="Bill.jsp">Bill</a></li>
            <li><a href="ReqDashBoard.jsp">Request</a></li>
            <li><a href="PickupBoyProfile.jsp">Profile</a></li>
        </ul>

        <div class="container">
             <div class="row">
                 <div class="col-sm-12">
                     <div class="col1">
                         <form class="myform" action="EmployeeEditServlet" method="post" class="form-horizontal">
                             <fieldset>
                            <h3 style="text-align: center; color: green; font-size: 35px">Edit Profile</h3><br>
                            <div class="form-group" style="width: 50%;"> 
                                <label class="control-label col-sm-2" for="name">Name:</label>
                                   <div class="col-sm-10">
                                    <input type="text" class="form-control" 
                                           id="name" placeholder="Enter Name"
                                           name="name" > 
                                   </div>
                             </div>
                                <br><br>
                                   <div class="form-group" style="width: 50%;">
                                    <label class="control-label col-sm-2" for="contact">Contact No:</label> 
                                    <div class="col-sm-10">
                                    <input type="text" class="form-control" id="contact" 
                                        placeholder="+91" name="contact"  > 
                                        </div>
                                </div> 
                               <br><br>
                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="add">Address:</label> 
                                    <div class="col-sm-10">
                                     <input type="text" class="form-control" id="add" 
                                            placeholder="Enter Address" name="add" >
                                    </div>
                                </div> 
                               <br><br>
                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="sal">Salary:</label> 
                                    <div class="col-sm-10">
                                    <input type="text" class="form-control" id="sal" 
                                        placeholder="Enter Salary" name="sal"> 
                                    </div>
                                </div>
                                <br><br> 
                                  
                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="sal">Type:</label> 
                                    <div class="col-sm-10">
                                     <input type="text" class="form-control" id="type" 
                                        placeholder="Enter Service Type" name="type" >
                                    </div>
                                </div><br><br> 
                          
                                <div>
<!--                            <a href="PickupBoyProfile.jsp">   
                                <button  id="b1" type="submit" class="btn bg-success" style="font-size: 20px;"> 
                                    Submit
                                </button> 
                               </a>-->
<input  id="b1" type="submit" value="Submit"  style="background-color: green; color:white; text-align:center;center:right; font-size:20px; margin-left:20px; padding-top: 4px; padding-bottom: 4px; ">
        <!--<input  id="b1" type="submit" value="Submit">-->
<a href="PickupBoyProfile.jsp"><label id="b2" type=“button”  class="btn btn-success " style="background-color: green; color:white; text-align:center; float:center; font-size:20px;  margin-left:20px;">Back</label></a>
  
<!--                                <a href='PickupBoyProfile.jsp'>
                                    <button id="b2" type="submit" class="btn bg-success" style="font-size: 20px;"> 
                                      Back
                                     </button>
                                </a>-->
                                </div
                             </fieldset>    
                         </form>                    
                     </div>
                     </div>
                 </div>
                </div>             
    </body>
     <%
        String status = request.getParameter("Editisvalid");
        if(status!=null && status.equals("true")){
      %>
        <script>
          alert("Edit is successfull!!");
        </script>
        <%
           }
        %>
     
</html>

 