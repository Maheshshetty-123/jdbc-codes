package jdbc_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
	     PreparedStatement preparedStatement=connection.prepareStatement("update students_details set name=?,branch=? where id=?");
       
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the new name");
	     String name=sc.next();
	     System.out.println("enter the new branch");
	     String branch=sc.next();
	     System.out.println("enter the id");
	     int id=sc.nextInt();
	     
	     preparedStatement.setString(1, name);
	     preparedStatement.setString(2, branch);
	   preparedStatement.setInt(3, id);
	   preparedStatement.executeUpdate();
	   connection.close();
	}

}
