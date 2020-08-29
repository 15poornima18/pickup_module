package pickupboy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pickupboy.model.EmployeeLoginDao;
import pickupboy.pojo.EmployeeProfile;

public class EmployeeEditServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
           // String emp=request.getParameter("empid");
            String name=request.getParameter("name");
            String address=request.getParameter("add");
            String contact=request.getParameter("contact");
            String salary=request.getParameter("sal");
            String type=request.getParameter("type");      
            
          //  System.out.println("2= "+emp);            
            System.out.println("2= "+name);
            System.out.println("3= "+address);
            System.out.println("4= "+contact);
            System.out.println("5= "+salary);
            System.out.println("6= "+type);
          
            HttpSession session = request.getSession();
            String user=session.getAttribute("User_id").toString();
                       
            EmployeeProfile e=new EmployeeProfile();
            System.out.println("7= "+e);

          //  e.setEmpId(emp);
            e.setEmpname(name);
            e.setAddress(address);
            e.setContactno(contact);
            e.setSalary(salary);
            e.setEmptype(type);
            
       try{       
            boolean status=EmployeeLoginDao.updateEmployee(e);
            System.out.println("8= "+status);
            
            if(status==true){
               out.println("Edit successfull!!");
               response.sendRedirect("PickupBoyProfile.jsp?Editisvalid=true");
            }
            else{
              out.println("Edit is not performed!!");
              response.sendRedirect("PickupBoyProfile.jsp");
           }
         }
           catch (SQLException ex) {
            // ex.printStackTrace();
            response.sendRedirect("PickupBoyProfile.jsp");

           }
    }
}