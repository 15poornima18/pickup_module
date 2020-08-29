package pickupboy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import pickupboy.model.EmployeeLoginDao;
import pickupboy.pojo.Employee;
import pickupboy.pojo.EmployeeProfile;

public class EmployeeLoginServlet extends HttpServlet {

       protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                         
               String empid=request.getParameter("employeeid");
               String pass=request.getParameter("password");
               String type=request.getParameter("type");
               boolean result;     
            try
            {
              result = EmployeeLoginDao.validateUser(empid,pass,type);
              if(result==true)
              {
                 HttpSession session=request.getSession();
                 session.setAttribute("User_id",empid);
                 if("Pickup Boy".equals(type)) 
                 {
                  response.sendRedirect("PickupBoyProfile.jsp");
                 }
                 else if("Manager".equals(type))
                 {
                   response.sendRedirect("ManagerProfile.jsp");
                  }
              }
            else{
                  response.sendRedirect("EmployeePage.jsp?isvalid=false");
                 }
           }                  
               catch (SQLException ex) {
               Logger.getLogger(EmployeeLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
              }  
              
       }
}
         
           
           
           
           
           
           
           
           
           
           
           
           
