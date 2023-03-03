package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import model.*;
import java.util.*;
import java.sql.Date;

@WebServlet(urlPatterns = {"/insert"})
public class InsertServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        response.sendRedirect("insert.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String sId,xName,sDob; int xId; boolean xGender; int xHOA;
        Date xDob = null; 
        String [] a; 
        sId = request.getParameter("id");
        xId = Integer.parseInt(sId);
        xName = request.getParameter("name");
        xGender = request.getParameter("gender").trim().equals("male");
        sDob = request.getParameter("dob");
        xDob = Date.valueOf(sDob);
        xHOA = Integer.parseInt("HOA");
        EmployeeDAO u = new EmployeeDAO();
        Employee x = u.getEmployee(xId);
        if(x != null) {
           pr.print("<h2> id = " + xId + " already exists!");
           return;
        }
        else {
         x = new Employee(xId,xName,xDob,xGender, xHOA);
         u.insert(x);
        }
        a = request.getParameterValues("skill");
        if(a==null || a.length==0) return;
        EmpSkillDAO v = new EmpSkillDAO();
        int xSid;
        for(int i=0;i<a.length;i++) {
            xSid = Integer.parseInt(a[i]);    
            v.insert(xId, xSid);
        }
    }

}

