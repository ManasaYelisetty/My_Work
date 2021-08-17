/*3. Write a code to update all the details  of “steve paul”.*/

package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Users_3 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			st = con.createStatement();
			String s = "update users set username='Manasa',password='Manu',fullname='Manasa Yelisetty', email='manasa@hcl.com' where fullname='steve paul'";
			st.executeUpdate(s);
			System.out.println("Values are updated");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			st.close();
			con.close();
		}

	}

}
