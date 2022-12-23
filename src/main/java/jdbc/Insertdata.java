package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertdata {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into students_details value(2,'mahesh','MBA',98765400,'mallu12@gmai.com')");
		System.out.println("value inserted");
		connection.close();
	}

}
