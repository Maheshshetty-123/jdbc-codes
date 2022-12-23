package jdbc_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
    PreparedStatement preparedStatement=connection.prepareStatement("insert into students_details values(?,?,?,?,?)");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the id");
    int id=sc.nextInt();
    System.out.println("enter the name");
    String name=sc.next();
    System.out.println("enter the branch");
    String branch=sc.next();
    System.out.println("enter the phonnum");
    long phonenum=sc.nextLong();
    System.out.println("enter the gmail");
    String gmail=sc.next();
    System.out.println("data inserted");
    
    preparedStatement.setInt(1, id);
    preparedStatement.setString(2, name);
    preparedStatement.setString(3, branch);
    preparedStatement.setLong(4, phonenum);
    preparedStatement.setString(5, gmail);
    
    preparedStatement.executeUpdate();
    connection.close();
    
	}

}
