package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		Statement statement=connection.createStatement();
	//ResultSet	e=statement.executeQuery("select * from students_details where id=1"); // fetching perticular data
	ResultSet	e=statement.executeQuery("select * from students_details"); // fetching all data  
	while(e.next()){
        System.out.println("student id-->  "+e.getInt(1)+"student name-->  "+e.getString(2)+"student branch-->  "+e.getString(3)+"student phonenum-->  "+e.getLong(4)+"student gmailid-->  "+e.getString(5));
	}}

}
