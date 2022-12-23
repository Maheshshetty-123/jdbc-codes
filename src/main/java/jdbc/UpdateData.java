package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
	Statement statement=connection.createStatement();
	statement.executeUpdate("update students_details set name='mahesh_shetty' where id=1");
	System.out.println("data updated");
	connection.close();
	}

}
