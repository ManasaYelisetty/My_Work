/*Sample Input and Output:
If Email is unique then data should save successfully.
Enter name
revathi
Enter salary
10000
Enter email
a@hcl.com
Want to add more records y/n
y
Enter name
drishnaa
Enter salary
20000
enter email
b@hcl.com
Want to add more records y/n
n
Data Saved Successfully
If Email is  violated.
Enter name
revathi
Enter salary
10000
Enter email
a@hcl.com
Email Id must be unique . Data Rollback successfully.*/

package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws SQLException {
		Connection con = null;

		try {
			while (true) {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name:");
				String name = sc.next();
				System.out.println("Enter Salary:");
				int salary = sc.nextInt();
				System.out.println("Enter email:");
				String email = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
				con.setAutoCommit(false);

				PreparedStatement ps = con.prepareStatement("insert into customers_table values(?,?,?)");
				ps.setString(1, name);
				ps.setInt(2, salary);
				ps.setString(3, email);
				ps.executeUpdate();
				con.commit();
				System.out.println("Want to add more records y/n");
				String ans = sc.next();
				if (!"y".equalsIgnoreCase(ans)) {
					System.out.println("Data save successfully");
					break;
				}
			}

		} catch (Exception e) {

			con.rollback();
			System.out.println("Email Id must be unique . Data Rollback successfully");

		} finally {
			con.close();
		}

	}

}
