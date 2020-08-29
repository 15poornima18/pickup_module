<%-- 
    Document   : update
    Created on : 10 Mar, 2020, 11:28:31 PM
    Author     : Poornima Tomar
--%>

<%@page import="pickupboy.dbutil.PickUpDBUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

<%@page import="java.sql.*"%>
<%
String user = (String)session.getAttribute("User_id");
String name=request.getParameter("name");
String empid=request.getParameter("emp_id");
String address=request.getParameter("add");
String contact=request.getParameter("contact");
String type=request.getParameter("type");
String salary=request.getParameter("sal");


try{
Connection conn=PickUpDBUtil.getConnection();
Statement st=null;
st=conn.createStatement();
st.executeUpdate("update employee set name='"+name+"',address='"+address+"',contact_no='"+contact+"',emp_id='"+empid+"',employeetype='"+type+"',salary='"+salary+"' where id='"+user+"'");
response.sendRedirect("PickupBoyProfile.jsp");
}
catch(Exception e){
System.out.println(e);
}
%>

    </body>
</html>
