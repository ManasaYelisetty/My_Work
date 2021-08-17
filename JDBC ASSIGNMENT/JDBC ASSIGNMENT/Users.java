package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Users {

	public static void main(String[] args) throws Exception {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			st=con.createStatement();
			st.execute("create table users(username varchar(20),password varchar(20),fullname varchar(20), email varchar(20))");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			st.close();
			con.close();
		}
		

	}

}
