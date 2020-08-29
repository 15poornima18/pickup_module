<%@page import="java.util.ArrayList"%>      
<%@page import="pickupboy.model.EmployeeLoginDao"%>
<%@page import="java.util.Iterator"%> 
<%@page import="pickupboy.pojo.EmployeeProfile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% ArrayList<EmployeeProfile> empList = EmployeeLoginDao.getData();
%> 

<table cellspacing="2" cellpadding="2">
<tr>
    <th>Employee ID</th>
    <th>Employee Name</th>
    <th>Employee Contact</th>
    <th>Employee Salary</th>
    <th>Employee Address</th>
    
    
</tr>

<%
if(empList != null) 
{
Iterator<EmployeeProfile> iterator = empList.iterator(); 
 
while(iterator.hasNext()) 
{
EmployeeProfile empDetails = iterator.next();
 
%>

<tr><td><%=empDetails.getEmpId()%></td>
<td><%=empDetails.getEmpname()%></td>
<td><%=empDetails.getContactno()%></td>
<td><%=empDetails.getSalary()%></td>
<td><%=empDetails.getAddress()%></td>
</tr>
<%
}
}
%>
</table>

</body>
</html>



<%-- 
    Document   : Demo
    Created on : 24 Feb, 2020, 5:39:10 PM
    Author     : Poornima Tomar
--%>