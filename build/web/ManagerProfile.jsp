<%-- 
    Document   : ManagerProfile
    Created on : 4 Mar, 2020, 10:52:07 PM
    Author     : Poornima Tomar
--%>

<%@page import="java.util.Iterator"%>
<%@page import="pickupboy.pojo.EmployeeProfile"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pickupboy.model.EmployeeLoginDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
       <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"> </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="CSS/pickupstyle.css">
        <title>Manager Profile DashBoard</title>
    </head>
    <body>
                 
         <% String user = (String)session.getAttribute("User_id");

             ArrayList<EmployeeProfile> empList = EmployeeLoginDao.getData(user);
         %>
        

        <ul>        
            <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>       
            <li><a href="EmployeePage.jsp">Sign Out</a></li>
            
            <li><a href="ManagerProfile.jsp">Profile</a></li>
        </ul>
          <%
         if(empList != null) 
         {
           Iterator<EmployeeProfile> iterator = empList.iterator();
           while(iterator.hasNext()) 
            {
            EmployeeProfile empDetails = iterator.next();
         %>
       
           <div class="container" style="margin-top: 50px; height: 500px;">
             <div class="row">
                 <div class="col-sm-12" style="height: 500px;">
                     <div class="col1">
                         <form class="myform" action="EmployeeEditServlet" class="form-horizontal">
                             <fieldset>
        
                         <h3 style="text-align: center; color: green; font-family: cursive;"><p>Welcome <%=empDetails.getEmpname()%></p> </h3>

                            <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="name">Name:</label> 
                                    <p><%=empDetails.getEmpname()%>  </p>
                                </div><br>   

                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="empid">Employee Id:</label> 
                                    <p><%=empDetails.getEmpId()%></p> 
                                </div> <br>

                                <div class="form-group" style="width: 50%;"> 
                                    <label  class="control-label col-sm-2" for="contact">Contact No:</label> 
                                    <p><%=empDetails.getContactno()%>  </p>
                                </div> <br>

                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="add">Address:</label> 
                                    <p><%=empDetails.getAddress()%></p>
                                </div> <br>

                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="sal">Salary:</label> 
                                    <p><%=empDetails.getSalary()%>    </p>
                                </div> <br>

                                <div class="form-group" style="width: 50%;"> 
                                    <label class="control-label col-sm-2" for="type">Type:</label> 
                                    <p><%=empDetails.getEmptype()%>  </p>
                                </div> <br>
<%
}
}
%>

           <div>
                                    <a href="EditPickupBoyProfile.jsp"><label id="b1" class=" btn btn-success myclick" style="background-color: green;margin-left: 10px; color:white; text-align:center; center:right; font-size:20px; ">Edit Profile</label></a>             
                                    <a href="EmployeePage.jsp"><label id="b2" type=“button”  class=" btn btn-success myclick" style="background-color: green; color:white;  text-align:center; float:center;  font-size:20px;">Back</label></a>
                                </div>

<!--                        <div>
                               <a href="EmployeePage.jsp">
                                   <button id="b1" type="submit" class="btn bg-success" style="font-size: 20px; "> 
                                    Back
                                </button> 
                               </a>

                              <a href="EditPickupBoyProfile.jsp">
                                  <button id="b2" type="submit"  class="btn bg-success" style="font-size: 20px; ">
                                   Edit
                                </button> 
                                </a>
                        </div>  --> 
                             </fieldset>  
                          </form>      
                         </div>
                     </div>
                 </div>
                </div>
    </body>
       
       
</html>







