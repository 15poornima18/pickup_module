package pickupboy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pickupboy.model.EmployeeRegisterDao;
import pickupboy.pojo.EmployeeProfile;

public class EmployeeRegisterServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();  

        String name = request.getParameter("Name");
        String address = request.getParameter("address");
        String empid = request.getParameter("Empid");
        String password = request.getParameter("Password");
        String contact_no = request.getParameter("Contact");
        String employeetype= request.getParameter("Employeetype");
        String salary = request.getParameter("Salary");
       
        EmployeeProfile emp=new EmployeeProfile();

        emp.setEmpname(name);
        emp.setAddress(address);
        emp.setEmpId(empid);
        emp.setPassword(password);
        emp.setContactno(contact_no);
        emp.setEmptype(employeetype);
        emp.setSalary(salary);
            
        String empRegistered = EmployeeRegisterDao.registerEmployee(emp);
        
if(empRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
{
    out.println("<script language=\"javascript\">");
    out.println("alert(Registered Successfully)"); 
    out.println("</script>");

    System.out.println("Registered!!");
  request.getRequestDispatcher("/EmployeePage.jsp").forward(request, response);
}
else   //On Failure, display a meaningful message to the User.
{
request.setAttribute("errMessage", empRegistered);
request.getRequestDispatcher("/EmployeeRegister.jsp").forward(request, response);
}

}
}
        
        
        
    

