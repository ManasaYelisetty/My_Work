/*2. Select all records from the Users table and print out details for each record*/

package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Users_2 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select * from users");
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " ," + rs.getString(2) + ", " + rs.getString(3) + " ," + rs.getString(4));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			st.close();
			con.close();
		}

	}

}
