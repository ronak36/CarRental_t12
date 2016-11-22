mport java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class registeruser_Mysql
{
	Connection conn = null;
	public String msg;

	public MySqlDataStoreUtilities()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mybestdeal","root","root");
		}
	
		catch(Exception e)
		{}
	}

	public  String Insertuser() throws SQLException
	{
			
	        Statement st = null;
	        ResultSet rs = null;

	        //creating user pojo class object
	        
	        user_pojo userobject;
	       
		    userobject = new userr(fname,lname,pwd,eid,phno,icountry,istate,licensestate,exdate);

		String fname = userobject.getfname(String fname);

        String lname = userobject.getlname(String lname);

        String pwd = userobject.getpwd(String pwd);

        String eid = userobject.geteid(String eid);

        String phno = userobject.getphno(String phno);

        String icountry = userobject.geticountry(String icountry);

        String istate = userobject.getistate(String istate);

        String licensestate = userobject.getlicensestate(String licensestate);
        
        String exdate = userobject.getexdate(String exdate);
             
	        
	        try{
		            st = conn.createStatement();

		          	String insertIntoCustomerRegisterQuery = "INSERT INTO customer(fname,lname,pwd,eid,phno,icountry,istate,licensestate,exdate) VALUES (?,?,?,?,?,?,?,?,?);";
					
					String checkqry = "SELECT fname From registration ";
					PreparedStatement pst = conn.prepareStatement(insertIntoCustomerRegisterQuery);
					PreparedStatement pstcheckqry = conn.prepareStatement(checkqry);

					pst.setString(1,fname);
					pst.setString(2,lname);
					pst.setString(3,pwd);
					pst.setString(4,eid);
					pst.setString(5,phno);
					pst.setString(6,icountry);
					pst.setString(7,istate);
					pst.setString(8,licensestate);
					pst.setString(9,exdate);

					
					rs=pstcheckqry.executeQuery();

					while (rs.next()) 
                        {
                            String exisiting_username=(rs.getString("fname"));

                            if(fname.equals(exisiting_username))
                            {
                            	msg= "user name is already exist";
                            	userexist = true;
                            }

                           
                        }
                      if(!userexist)
                      {
                      	  pst.execute();
                          msg= "User is successfully registered";
                           
                      }
               
                
                return msg;

			  
			    }

		    	
		    	catch(Exception ex)
		    	{
            		ex.printStackTrace();
        		}
		
    } 

    // check if username or password is wrong
    	public  String checkUser(String username,String password) throws SQLException
		{
			//	System.out.println(username);
			//	System.out.println(password);
				
		        
                ResultSet rs = null;
                String msg=null;
                Statement stmt = null;
            	Boolean userexist =false;

			
				
					
					String checkuser = "SELECT * From customer ";
					stmt = conn.createStatement();		
							
				
				

					rs=stmt.executeQuery(checkuser);	
					while(rs.next())
					{
						  
                            String exisiting_username=(rs.getString("fname"));
                            String existingpwd=(rs.getString("userpassword"));

                            if(username.equals(exisiting_username) && password.equals(existingpwd) )
                            {
                            	msg="user successfully login to the system";
                            	userexist = true;
                            }

                           
                    }
                      if(!userexist)
                      {
                      	 
                          msg= "User id or password is wrong";
                          //return msg;   
                      }
								
				
			   	
			   	return msg;
		} 

}