package pickupboy.model;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import pickupboy.dbutil.PickUpDBUtil;
import pickupboy.pojo.Customer;
import pickupboy.pojo.Employee;
import pickupboy.pojo.EmployeeProfile;
import pickupboy.pojo.Request;
import pickupboy.pojo.ViewRequestM2;

public class EmployeeLoginDao {
    public static boolean validateUser(String empid,String pass,String type) throws SQLException
   {
        Connection conn=PickUpDBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT PASSWORD,EMPLOYEETYPE FROM EMPLOYEE WHERE EMP_ID=?");   
        ps.setString(1,empid);
        ResultSet rs=ps.executeQuery();   
       // String username=null;
        if(rs.next())
        {
            String password = rs.getString(1);
            String etype=rs.getString(2);
            if(pass.equals(password))
            { 
                return true;
             }
            else{
                return false;
            }
        }    
        else{
            return false;
        }     
   }    
 public static  ArrayList<EmployeeProfile> getData(String user){
        ArrayList<EmployeeProfile> emplist=new ArrayList<EmployeeProfile>();
        try {
            Connection conn=PickUpDBUtil.getConnection();   
            PreparedStatement st=conn.prepareStatement("select * from employee where emp_id=?");
            st.setString(1,user);
            ResultSet rs=st.executeQuery();
 
            if(rs.next())
            {
                EmployeeProfile p=new EmployeeProfile();
              
                p.setEmpId(rs.getString("emp_Id"));
                p.setEmpname(rs.getString("name"));  
                p.setAddress(rs.getString("address"));
                p.setSalary(rs.getString("salary"));
                p.setContactno(rs.getString("contact_no"));
                p.setEmptype(rs.getString("employeetype"));
                emplist.add(p);
            }  
        } 
        catch (SQLException ex) {
           ex.printStackTrace();
        }   
      return emplist;
    }    
 
 
 public static ArrayList<ViewRequestM2> listAllRequest(String user) throws SQLException {
        Connection conn=PickUpDBUtil.getConnection();  
        //PreparedStatement st=conn.prepareStatement("select * from request where req_id in(select req_id from assign where pk_id=?)");
        PreparedStatement st= conn.prepareStatement("select customer_name,customer_id ,req_id,schedule_date,request_date,street,landmark,house_no,request_type,status from request  inner join address_book  on request.add_no=address_book.add_no inner join assign on assign.req_id=request.req_id inner join customer c on c.customer_id= request.cust_id where pk_id=?");

        st.setString(1,user);
        ResultSet rs=st.executeQuery();
        
        System.out.println(st);
       ArrayList<ViewRequestM2> req_List=new ArrayList<ViewRequestM2>();
        while(rs.next())
        {
            System.out.println("*");
            ViewRequestM2 obj=new ViewRequestM2();
            java.sql.Date d1=rs.getDate("request_date");
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
            String request_date=sdf.format(d1);
            
            String scheduled_date=rs.getString("schedule_date");
            if(scheduled_date==null)
                scheduled_date="Not Scheduled";
            else
            {
                java.sql.Date d2=rs.getDate("schedule_date");
                scheduled_date=sdf.format(d2);
            }            
            obj.setCust_id(rs.getString("customer_id"));
            obj.setName(rs.getString("customer_name"));
            obj.setReqId(rs.getString("req_id"));
            obj.setRequest(rs.getString("request_type"));
            obj.setSchedule(scheduled_date);
            obj.setReq_date(request_date);
            obj.setAddress(rs.getString("house_no")+" , "+rs.getString("street")+"   near, "+rs.getString("landmark")+" Bhopal");
            obj.setStatus(rs.getString("status"));
            req_List.add(obj);
        }
        return req_List;
 }
 public static ArrayList<ViewRequestM2> getTodaysRequest(String user) throws SQLException
   {
        String today_date=null;
        Connection conn=PickUpDBUtil.getConnection();

       // Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
       // today_date= formatter.format(date);  

      try{
      }
      catch(Exception e){
                    System.out.println(e);

      }
       // String today_date= new SimpleDateFormat("dd/MM/YYYY").format(new Date());
        System.out.println("Today:"+today_date);
        PreparedStatement ps= conn.prepareStatement("select customer_name,customer_id ,req_id,schedule_date,request_date,street,landmark,house_no,status,request_type from request  inner join address_book  on request.add_no=address_book.add_no inner join assign on assign.req_id=request.req_id inner join customer c on c.customer_id= request.cust_id where request_date='12/09/2019' and pk_id=?");
        ps.setString(1,user);
        ResultSet rs=ps.executeQuery();

        ArrayList<ViewRequestM2> req_List=new ArrayList<ViewRequestM2>();
        while(rs.next())
        {
            System.out.println("*");
            ViewRequestM2 obj=new ViewRequestM2();
            java.sql.Date d1=rs.getDate("request_date");
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
            String request_date=sdf.format(d1);
            
            String scheduled_date=rs.getString("schedule_date");
            if(scheduled_date==null)
                scheduled_date="Not Scheduled";
            else
            {
                java.sql.Date d2=rs.getDate("schedule_date");
                scheduled_date=sdf.format(d2);
            }            
            obj.setCust_id(rs.getString("customer_id"));
            obj.setName(rs.getString("customer_name"));
            obj.setReqId(rs.getString("req_id"));
            obj.setRequest(rs.getString("request_type"));
            obj.setSchedule(scheduled_date);
            obj.setReq_date(request_date);
            obj.setAddress(rs.getString("house_no")+" , "+rs.getString("street")+"   near, "+rs.getString("landmark")+" Bhopal");
            obj.setStatus(rs.getString("status"));
            req_List.add(obj);
        }
        return req_List;
   }
 
    public static ArrayList<ViewRequestM2> FetchReqOnFromdate(String date1,String date2 , String user) throws SQLException
   {
      Connection conn=PickUpDBUtil.getConnection();
        PreparedStatement ps= conn.prepareStatement("select customer_name,customer_id,req_id,schedule_date,request_date,street,landmark,house_no,status,request_type from request  inner join address_book  on request.add_no=address_book.add_no inner join assign on assign.req_id=request.req_id inner join customer c on c.customer_id= request.cust_id and request_date between"+"'"+date1+"'"+"and"+"'"+date2+"' and pk_id=?");
         ps.setString(1,user);
        ResultSet rs=ps.executeQuery();
        ArrayList<ViewRequestM2> req_List=new ArrayList<ViewRequestM2>();
        while(rs.next())
        {
            ViewRequestM2 obj=new ViewRequestM2();
            java.sql.Date d1=rs.getDate("request_date");
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
            String request_date=sdf.format(d1);
            
            String scheduled_date=rs.getString("schedule_date");
            if(scheduled_date==null)
                scheduled_date="Not Scheduled";
            else
            {
                java.sql.Date d2=rs.getDate("schedule_date");
                scheduled_date=sdf.format(d2);
            }
      
            obj.setName(rs.getString("customer_name"));
            obj.setReqId(rs.getString("req_id"));
            obj.setRequest(rs.getString("request_type"));
            obj.setSchedule(scheduled_date);
            obj.setReq_date(request_date);
            obj.setAddress(rs.getString("house_no")+" , "+rs.getString("street")+"   near, "+rs.getString("landmark")+" Bhopal");
            obj.setStatus(rs.getString("status"));
            req_List.add(obj);
        }
        return req_List;
       
   }

 
 public static boolean updateEmployee(EmployeeProfile emp) throws SQLException {
        Connection conn=PickUpDBUtil.getConnection();   
       PreparedStatement st = conn.prepareStatement("update employee set name=e.getEmpname(), address=?, salary=?, contact_no=?,employeetype=?" +"where emp_id=?");
       // PreparedStatement st=conn.prepareStatement("update employee set name="+"'"+emp.getEmpname()+"'"+",address="+"'"+emp.getAddress()+"'"+",salary="+"'"+emp.getSalary()+"'"+",employeetype="+"'"+emp.getEmptype()+"'"+", contact="+"'"+emp.getContactno()+"'"+"where emp_id="+"'"+emp.getEmpId()+"'");

        st.setString(1, emp.getEmpId());
        st.setString(2, emp.getEmpname());
        st.setString(3, emp.getAddress());
        st.setString(4, emp.getSalary());
        st.setString(5, emp.getContactno());
        st.setString(6, emp.getEmptype());
        
      int row=st.executeUpdate();
      
      System.out.println("1= " +row);
      
      if(row>0)
          return true;
      else
          return false;
    }
 
 public static  ArrayList<Customer> getCustomer(String user){
        ArrayList<Customer> custlist=new ArrayList<Customer>();
        try {
            Connection conn=PickUpDBUtil.getConnection();   
            PreparedStatement st=conn.prepareStatement("select customer_name,phone_no,house_no,street,landmark,city from customer inner join address_book on customer.customer_id=address_book.cust_id and cust_id=?");
            st.setString(1,user);
            ResultSet rs=st.executeQuery();
 
            if(rs.next())
            {
                Customer  c=new Customer();
              
                c.setCust_id(rs.getString("customer_Id"));
                c.setCust_name(rs.getString("customer_name")); 
                c.setContact_no(rs.getString("phone_no"));
                c.setHouse_no(rs.getString("house_no"));
                c.setStreet(rs.getString("street"));
                c.setLandmark(rs.getString("landmark"));
                c.setCity(rs.getString("city"));

                custlist.add(c);
            }  
        } 
        catch (SQLException ex) {
           ex.printStackTrace();
        }   
      return custlist;
    }    
 
 
 
 
 
 
 
 
}  

    
