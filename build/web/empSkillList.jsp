<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<!DOCTYPE html>
<%
  EmpSkillDAO u = new EmpSkillDAO();
  List<EmpSkill> lst = u.getEmpSkillList();
%>  
<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>List of employees - skills</title>
  </head>
  <body>
    <h2> List of employees - skills </h2>
    <table border="1">
      <tr>
        <td align="center"> Eid </td>
        <td align="center"> Sid </td>
      </tr>
      <% for(EmpSkill x: lst) { %>
      <tr>
          <td> <%= x.getEid() %></td>
          <td> <%= x.getSid() %></td>
      </tr>  
      <% } %>  
    </table>     
    <button onclick='window.location.href="index.html"'>Back to home page</button>
    <p>
    <button onclick='window.history.go(-1);'>Back to previous page</button>
  </body>
</html>
