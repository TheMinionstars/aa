package model;

import java.util.List;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Date; // Date only

public class EmployeeDAO extends MyDAO {

  public List<Employee> getEmployeeList() { // from worker and province tables
    List<Employee> t = new ArrayList<Employee>();
    xSql = "select * from Employee";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      int xId;String xName; Date xDob; boolean xGender; int xHOA;
      Employee x;
      while(rs.next()) {
        xId = rs.getInt("id");  
        xName = rs.getString("name");  
        xDob = rs.getDate("dob");
        xGender = rs.getBoolean("gender");
        xHOA = rs.getInt("HOA");  
        x = new Employee(xId,xName,xDob,xGender,xHOA);
        t.add(x);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }

  public Employee getEmployee(int xId) {
    Employee x = null;
    xSql = "select * from Employee where id=?";
    try {
      ps = con.prepareStatement(xSql);
      ps.setInt(1, xId);
      rs = ps.executeQuery();
      String xName; Date xDob; boolean xGender; int xHOA;
      if(rs.next()) {
        xName = rs.getString("name");  
        xDob = rs.getDate("dob");
        xGender = rs.getBoolean("gender");
        xHOA = rs.getInt("HOA");
        x = new Employee(xId,xName,xDob,xGender,xHOA);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
     return(x);
  }
  
  public void insert(Employee x) {
     xSql = "insert into Employee (id,name,dob,gender,HOA) values (?,?,?,?,?)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setInt(1, x.getId());
      ps.setString(2, x.getName());
      ps.setDate(3, (Date) x.getDob());
      ps.setBoolean(4, x.isGender());
      ps.setInt(5, x.getHOA());
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }

    
}
