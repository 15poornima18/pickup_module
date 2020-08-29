package pickupboy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pickupboy.model.EmployeeLoginDao;

public class BillServlet extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
                String[] names = request.getParameterValues("item");
		List list = Arrays.asList(names);
		request.setAttribute("item", list);
		RequestDispatcher rd = request.getRequestDispatcher("Bill.jsp");
		rd.forward(request, response);

        
        
        
//                     String sv3[];
//                      //sv = request.getParameterValues("UPSR");
//		    //  sv2 = request.getParameterValues("PT3");
//		      sv3 = request.getParameterValues("SPM");
//		      
//			   String service = request.getParameter("category");
//			   String subjectId= "";
//			   if(service.equalsIgnoreCase("SPM")){
//				   
//				   for(int i = 0; i <sv3.length; i++){
//					   if(i<sv3.length-1){
//						   subjectId = subjectId +sv3[i] + ",";
//					   }
//					   else{
//						   subjectId = subjectId + sv3[i];
//					   }
//				   }
//				 
//			   }
//			   
//			  
//			   sub.setSubjectId(request.getParameter("subjectId"));
//			   sub.setSubjectId(subjectId);
//			   sb.setCategory(service);
//			   sb.setType(request.getParameter("type"));
//			   System.out.println(service);
//			   
//			   sb = RegisterDAO.registerStudent(sb);
//			   sub = RegisterDAO.registerSubject(sub);
//	
//        
    }

    
}
