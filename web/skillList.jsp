<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
  SkillDAO u = new SkillDAO();
  List<Skill> lst = u.getSkillList();
%>  
<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>List of skills</title>
  </head>
  <body>
    <h2> List of skills </h2>
    <table border="1">
      <tr>
        <td align="center"> Id </td>
        <td align="center"> Name </td>
      </tr>
      <% for(Skill x: lst) { %>
      <tr>
          <td> <%= x.getId() %></td>
          <td> <%= x.getName() %></td>
      </tr>  
      <% } %>  
    </table>     
    <button onclick='window.location.href="index.html"'>Back to home page</button>
    <p>
    <button onclick='window.history.go(-1);'>Back to previous page</button>
  </body>
</html>
