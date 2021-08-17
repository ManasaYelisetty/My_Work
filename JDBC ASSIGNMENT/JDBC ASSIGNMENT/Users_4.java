/*4. Write a code to delete a record whose username field contains steve”.*/

package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Users_4 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			st = con.createStatement();
			String s = "delete from users where username='steve'";
			st.executeUpdate(s);
			System.out.println("Values are deleted");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			st.close();
			con.close();
		}
	}

}
