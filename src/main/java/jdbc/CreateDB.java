package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) throws Exception 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement statement=connection.createStatement();
	statement.execute("create database JSPIDER");
	System.out.println("create database");
	connection.close();
	}

}
