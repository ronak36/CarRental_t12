
<%@ page import="java.io.*,javax.servlet.*,java.sql.Connection,javax.servlet.http.*,java.sql.SQLException,java.sql.Statement,
java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.nio.file.Files,java.sql.SQLException,java.util.HashMap,
java.util.logging.Level,java.util.logging.Logger,javax.servlet.http.*,java.io.File,java.io.IOException,java.util.List,
javax.xml.parsers.ParserConfigurationException,javax.xml.parsers.SAXParser,javax.xml.parsers.SAXParserFactory,org.xml.sax.SAXException" %>





<%@ page import="mysql.*"%>




<%@include  file="header.jsp" %>
<%@include  file="navigationbar.html" %>  
<%     
		String username = request.getParameter("username");
		String password = request.getParameter("password");

	//	out.println(username+"-"+password+"-"+usertype);
	registeruser_Mysql obj= new registeruser_Mysql();
	String message=null;
	// call the checkuser method from mysql DAO class
	message= obj.checkUser(username,password);
	out.println(message);

%>
         
   
