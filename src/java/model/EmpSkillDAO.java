package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

public class EmpSkillDAO extends MyDAO {

  public List<EmpSkill> getEmpSkillList() { 
    List<EmpSkill> t = new ArrayList<>();
    xSql = "select * from Employee_Skill";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      int xEid,xSid;
      EmpSkill x;
      while(rs.next()) {
        xEid = rs.getInt("eid");  
        xSid = rs.getInt("sid");  
        x = new EmpSkill(xEid,xSid);
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
  public void insert(int xEid, int xSid) {
     xSql = "insert into Employee_Skill (eid,sid) values (?,?)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setInt(1, xEid);
      ps.setInt(2, xSid);
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }
   
}
