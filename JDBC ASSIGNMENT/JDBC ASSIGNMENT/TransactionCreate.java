/*Jdbc Transaction Management
1.Create a table named customer including name,salary,email.
2.One of the constraints on the table is that email has to be unique.
 If we enter same email a second time to violate this constraint.
  It results in SQL exception. Have to  rollback transaction programmatically in
   exception handling block.*/

package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionCreate {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			st = con.createStatement();
			st.execute("create table customers_table(name varchar(20), salary int(8), email varchar(30) unique)");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			st.close();
			con.close();
		}

	}

}
