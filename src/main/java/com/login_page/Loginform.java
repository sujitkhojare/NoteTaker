package com.login_page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Loginform")
public class Loginform extends HttpServlet {
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
	            throws ServletException, IOException {
	        
	        resp.setContentType("text/html");

	        PrintWriter out = resp.getWriter();
	        
	        String myemail = req.getParameter("email1");
	        String mypass = req.getParameter("pass1"); 
	        try { 
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata2","root","root"); 
	            PreparedStatement ps = con.prepareStatement("select * from users where emailid=? and password=?"); 
	            
	            ps.setString(1, myemail);
	            ps.setString(2, mypass); 
	            ResultSet rs = ps.executeQuery(); 
	            if (rs.next()) { 
	                HttpSession session  = req.getSession();
	                session.setAttribute("session_username", rs.getString("Username"));
	                session.setAttribute("session_Password", rs.getString("Password"));
	                session.setAttribute("session_mobno", rs.getString("mobno"));
	                session.setAttribute("session_emailid", rs.getString("emailid"));
	                
	                RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
	                rd.forward(req, resp); 
	                
	            } 
	            else {  
	                out.print("<h3 style='color:red'>Email id and password didn't match</h3>");
	                RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
	                rd.include(req, resp); 
	                
	            }
	        } 
	        catch (Exception e) 
	        { 
	            e.printStackTrace();
	            
	            out.print("<h3 style='color:red'>"+e.getMessage()+"</h3>");
	            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
	            rd.include(req, resp); 
	        }    
	    }
	}