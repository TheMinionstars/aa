
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.*" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<%
  SkillDAO u = new SkillDAO();
  List<Skill> lst = u.getSkillList();
%>  
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert new employee</title>
  </head>
  <body>
    <h3>Insert new worker</h3>
    <form action="insert" method="POST">
       <p>Id: <input type="text" name="id"/>
        
       <p>Name: <input type="text" name="name"/>

       <p>Gender:
       <input type="radio" name="gender" value="male" checked="checked"/> Male
       <input type="radio" name="gender" value="female" /> Female

       <p>Dob: <input type="date" name="dob" value="2001-01-20" />
       <p>HOA: <input type="number" name="HOA"/>
           
       <p>Skill: 
          <% for(Skill x: lst) { %>
       <p>
          <input type="checkbox" name="skill" value="<%= x.getId()%>" /><%= x.getName()%>
          <% } %>

       <p><input type="submit" value="Insert" /> 
    </form>  
  </body>
</html>
