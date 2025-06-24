package Mysqlprograms;
import java.sql.*;
public class Task3 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc";

		String user = "root";

		String password = "";



		int rollNo = 2326ka50;

		String name = "sreevarshini";

		String email = "sreevarshini@gmail.com";

		String phone = "1234567890";

		String dept = "CT";

		String course = "Computer Technology";

//		String query = "Create table students(studname varchar(50),studrollno int,studemail varchar(50),studphno int,studdept varchar(40),course varchar(50))";



		//String query1 = "INSERT INTO Students (studrollno, studname, studemail, studphno, studdept, course) VALUES (?, ?, ?, ?, ?, ?)";

		String selectQuery = "Select* from students";

		Connection conn = DriverManager.getConnection(url, user, password);



		PreparedStatement stmt = conn.prepareStatement(selectQuery);

//		stmt.setInt(1, rollNo);

//		stmt.setString(2, name);

//		stmt.setString(3, email);

//		stmt.setString(4, phone);

//		stmt.setString(5, dept);

//		stmt.setString(6, course);



		//stmt.executeUpdate();



		//System.out.println("Student data inserted successfully.");



		Statement selectStmt = conn.createStatement();

		ResultSet rs = selectStmt.executeQuery(selectQuery);



		System.out.println("\n--- Student Table Data ---");

		while (rs.next()) {

			int rno = rs.getInt("studrollno");

			String sname = rs.getString("studname");

			String semail = rs.getString("studemail");

			String sphone = rs.getString("studphno");

			String sdept = rs.getString("studdept");

			String scourse = rs.getString("course");



			System.out.println("Roll No: " + rno + ", Name: " + sname + ", Email: " + semail + ", Phone: " + sphone

					+ ", Dept: " + sdept + ", Course: " + scourse);

		}



		rs.close();

		selectStmt.close();

		stmt.close();

		conn.close();

	}

}

