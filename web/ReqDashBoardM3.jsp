<%-- 
    Document   : ReqDashBoardM3
    Created on : 13 Jun, 2020, 8:37:40 PM
    Author     : Poornima Tomar
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pickupboy.pojo.ViewRequestM2"%>
<%@page import="pickupboy.model.EmployeeLoginDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Request DashBoard PickUpBoy</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/ReqDashBoardStyle.css">
        
    </head>
<body>
        <ul>
             <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>
            <li><a href="EmployeePage.jsp">Sign Out</a></li>
            <li><a href="Bill.jsp">Bill</a></li>
            <li><a href="ReqDashBoard.jsp">Request</a></li>
            <li><a href="PickupBoyProfile.jsp">Profile</a></li>
        </ul>

    <div class="major">
    <div class="minor1">
         <form>
            <h3>Filters</h3>
            <br>
            <a onclick="enable()" class="resetAnchor" > <p style="color:graytext; font-size: small;float:right" onMouseOver="this.style.color=red" onMouseOut="this.style.color=gray">Reset Filters</p></a>
            <label for="Date">Search by Date Range</label><br>
            <label> From</label><br>
            <a onclick="disable2()"><input type="date" name="fromDate"></a>
            <label> To</label><br>
            <a onclick="disable2()"><input type="date" name="toDate"></a>
            <input type="submit" value="Search" style="background-color: orange;">
        </form>
    </div>
             <% String user = (String)session.getAttribute("User_id");
             String fromdate=request.getParameter("fromDate");
             String todate=request.getParameter("toDate");

   //  String date1= new SimpleDateFormat("dd/MM/YYYY").format(new Date());
     //String date2= new SimpleDateFormat("dd/MM/YYYY").format(new Date());

             ArrayList<ViewRequestM2> reqList = EmployeeLoginDao.FetchReqOnFromdate(fromdate,todate,user);
         %>

    <button onclick="todaysReq()" class="refresh" style="background-color:rgb(0, 0, 255); border-radius: 5px; color: white;" >
        <img src="Images/prod4.png" height="20" width="20">
        <span>Today's Requests</span>  
     </button>


     <button onclick="missedReq()" class="refresh" style="background-color:red; border-radius: 5px; color:white;" >
        <img src="Images/prod4.png" height="20" width="20" >
        <span>All Requests</span>
     </button>
     <div>
          <table class="table-responsive table-condensed table-striped table-hover" text-align="center" style="font-size: 15px;background-color:whitesmoke;">
             <thead>           
 <tr style="color: green">
                <th>Req_id</th>
                <th>Request_Type</th>
                <th>Req_date</th>
                <th>Customer_id</th>
                <th>Name</th>
                <th>Address</th>
                <th>Schedule_date</th>
                <th>Status</th>

            </tr>
             </thead>
         <%
         if(reqList != null) 
         {
           Iterator<ViewRequestM2> iterator = reqList.iterator();
           while(iterator.hasNext()) 
            {
            ViewRequestM2 req = iterator.next();
        %>
        <tbody>
                <tr>
                    <td><%=req.getReqId()%></td>
                    <td><%=req.getRequest()%></td>
                    <td><%=req.getReq_date()%></td>
                    <td><%=req.getCust_id()%></td>
                    <td><%=req.getName()%></td>
                    <td><%=req.getAddress()%></td>
                    <td><%=req.getSchedule()%></td>
                    <td><%=req.getStatus()%></td>

                   </tr>
        </tbody>
<%
}
}
%>

             </table>
          </div> 
    
 <script language="javascript" type="text/javascript">

function todaysReq(){
    
window.open("ReqDashBoard.jsp","_self");
}


</script>     
<script language="javascript" type="text/javascript">

function allReq()
{
window.open("ReqDashBoardM2.jsp","_self");
}


</script>

        
        </div>
</body>
</html>
