package model;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SkillDAO extends MyDAO {

  public List<Skill> getSkillList() { 
    List<Skill> t = new ArrayList<>();
    xSql = "select * from Skill";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      int xId; String xName;
      Skill x;
      while(rs.next()) {
        xId = rs.getInt("id");  
        xName = rs.getString("name");  
        x = new Skill(xId,xName);
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
}
