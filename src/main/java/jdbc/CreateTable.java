package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
        Statement statement=connection.createStatement();
    statement.execute("create table students_details(id integer primary key,name varchar(20),branch varchar(15),phonnum bigint,gmailid varchar (30))");
    System.out.println("table created");
	}

}
