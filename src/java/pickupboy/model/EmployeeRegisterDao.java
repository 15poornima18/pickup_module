package pickupboy.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pickupboy.dbutil.PickUpDBUtil;
import pickupboy.pojo.EmployeeProfile;

public class EmployeeRegisterDao {
 
 public static String registerEmployee(EmployeeProfile emp)
{
String name = emp.getEmpname();
String emp_id = emp.getEmpId();
String password = emp.getPassword();
String employeetype=emp.getEmptype();
String contact_no=emp.getContactno();
String address=emp.getAddress();
String salary=emp.getSalary();

Connection con = null;
PreparedStatement preparedStatement = null;

try
{
con = PickUpDBUtil.getConnection();
String query = "insert into employee(name,emp_id,password,employeetype,contact_no,address,salary) values (?,?,?,?,?,?,?)"; 
preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
preparedStatement.setString(1, name);
preparedStatement.setString(2, emp_id);
preparedStatement.setString(3, password);
preparedStatement.setString(4, employeetype);
preparedStatement.setString(5, contact_no);
preparedStatement.setString(6, address);
preparedStatement.setString(7, salary);


int i= preparedStatement.executeUpdate();
if (i!=0)  //Just to ensure data has been inserted into the database
return "SUCCESS"; 
}
catch(SQLException e)
{
e.printStackTrace();
}
return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
}
}
    
    
    
    
    
    

