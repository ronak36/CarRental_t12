
<%@ page import="java.io.*,javax.servlet.*,java.sql.Connection,javax.servlet.http.*,java.sql.SQLException,java.sql.Statement,java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.nio.file.Files,java.sql.SQLException,java.util.HashMap,java.util.logging.Level,java.util.logging.Logger,javax.servlet.http.*,java.io.File,java.io.IOException,java.util.List,javax.xml.parsers.ParserConfigurationException,javax.xml.parsers.SAXParser,javax.xml.parsers.SAXParserFactory,org.xml.sax.SAXException" %>



<%@ page import="mysql.*"%>


<html>
<head></head>
<body>

<div id='content'>             
    <h3 align='center'>Please fill your personal detail</h3><hr>
             
                
            <form method='post' action='register2.jsp' style='color:black;'>

		        Type of user<br><br>
		    	<input type='radio' name='usertype' value='customer'>Customer 
		        <input type='radio' name='usertype' value='admin'>Admin <br><br>


		        User Name:<br>
		        <input type='text' name='username'><br><br>
 
		        Password:<br>
		        <input type='password' name='password'><br><br>

		        Gender:<br>
		        <input type="radio" name="gender" value="M"> Male<br>
  				<input type="radio" name="gender" value="F"> Female<br><br>

		        Date of Birth:<br>
		        <input type='text' name='dob'><br><br>

		        Email Id:<br>
		        <input type='email' name='emailid'><br><br>

		        Address:<br>

		        <textarea rows="4" cols="50" name="address">
				</textarea>
		       
		          
		     	<input type='submit' value='Register'><br>

      		</form>
</div>

</body>

</html>


