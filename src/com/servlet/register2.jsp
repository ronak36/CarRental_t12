
<%@ page import="java.io.*,javax.servlet.*,java.sql.Connection,javax.servlet.http.*,java.sql.SQLException,java.sql.Statement,java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.nio.file.Files,java.sql.SQLException,java.util.HashMap,java.util.logging.Level,java.util.logging.Logger,javax.servlet.http.*,java.io.File,java.io.IOException,java.util.List,javax.xml.parsers.ParserConfigurationException,javax.xml.parsers.SAXParser,javax.xml.parsers.SAXParserFactory,org.xml.sax.SAXException" %>




<%

		String fname =  request.getParameter("firstname");

		String lname =  request.getParameter("lastname");

		String pwd =  request.getParameter("password");

		String eid =  request.getParameter("emailid");

		String phno =  request.getParameter("phonenumber");

		String icountry =  request.getParameter("issuecountry");

		String istate =  request.getParameter("issuestate");

		String licensestate =  request.getParameter("licensestate");

		String exdate =  request.getParameter("exdate");

		//creating user pojo class object
		user_pojo userobject = new user_pojo();

		//calling all setter method of user pojo class
		// setting user registration data using setter method

		userobject.setfname(String fname);

		userobject.setlname(String lname);

		userobject.setpwd(String pwd);

		userobject.seteid(String eid);

		userobject.setphno(String phno);

		userobject.seticountry(String icountry);

		userobject.setistate(String istate);

		userobject.setlicensestate(String licensestate);

		userobject.setexdate(String exdate);

		registeruser_Mysql obj= new registeruser_Mysql();
		String message=obj.Insertuser();
		out.println(message);

%>

