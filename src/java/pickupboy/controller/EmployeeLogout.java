package pickupboy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogout extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out=response.getWriter();  
       
       // request.getRequestDispatcher("LogOut.jsp").include(request, response); 
        
        HttpSession session=request.getSession(false);
        if(session!=null){
        session.removeAttribute("User_id");
         
        request.getRequestDispatcher("EmployeePage.jsp").include(request, response); 
      
        out.print("You are successfully logged out!");  
        out.close();  
        }
        
    }
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}