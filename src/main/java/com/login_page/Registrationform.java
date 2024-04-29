package com.login_page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Registrationform")
public class Registrationform extends HttpServlet {  
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {		// TODO Auto-generated method stub 
		PrintWriter out = resp.getWriter();
	
	String myusername = req.getParameter("Username"); 
	String mypass = req.getParameter("Password");
	String mymobno = req.getParameter("mobno");
	String myemail = req.getParameter("emailid");
	
	try {  
		
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata2","root","root"); 
        PreparedStatement ps = con.prepareStatement("INSERT INTO users (Username, Password, mobno, emailid) VALUES (?, ?, ?, ?)");
        ps.setString(1, myusername);
        ps.setString(2, mypass);
        ps.setString(3, mymobno); 
        ps.setString(4, myemail);

       int count =   ps.executeUpdate(); 
       if (count > 0) { 
    	   
    	   resp.setContentType("text/html"); 
    	   out.print("<h2 style = 'color:green'> User Registred Succesfully </h2>") ;
    	   
    	   RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
    	   rd.include(req, resp);
       
       }
       else {  
    	   
    	   resp.setContentType("text/html"); 
    	   out.print("<h3 style = 'color:red'> User  Not Registred  Due To Error  </h3>") ;
    	   
    	   RequestDispatcher rd = req.getRequestDispatcher("/Registor.jsp");
    	   rd.include(req, resp);
    	   
       } 
       
	} 
catch(Exception e)
	{ 
		e.printStackTrace(); 
		 resp.setContentType("text/html"); 
  	   out.print("<h3 style = 'color:green'> exception occured"+e.getMessage()+" </h3>") ;
  	   
  	   RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
  	   rd.include(req, resp);
	} 
	  }
}
	