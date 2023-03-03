<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
  EmployeeDAO u = new EmployeeDAO();
  List<Employee> lst = u.getEmployeeList();
  request.setAttribute("lst", lst);
%>  
<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>List of employees</title>
  </head>
  <body>
    <h2> List of employees </h2>
    <table border="1">
      <tr>
        <td align="center"> Id </td>
        <td align="center"> Name </td>
        <td align="center"> Dob </td>
        <td align="center"> Gender </td>
        <td align="center"> HOA </td>

      </tr>
      <c:forEach var="x" items="${lst}">
      <tr>
        <td> ${x.id} </td>
        <td> ${x.name}  </td>
        <td> ${x.dob}  </td>
        <td> ${x.gender}  </td>
        <td> ${x.HOA}  </td>

      </tr>  
      </c:forEach>  
    </table>
    

    <button onclick='window.location.href="index.html"'>Back to home page</button>
    <p>
    <button onclick='window.history.go(-1);'>Back to previous page</button>
  </body>
</html>
