package dateanddatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import interfaceprac.int1;
import prac.randomgenerator;

public class writedata {

	public static void main(String[] args) throws SQLException {
		String url= "jdbc:mysql://localhost:3306/table1?useSSL=false";
		Connection connection= DriverManager.getConnection(url,"root","1234");
		for (int i = 1; i <=10000; i++) {
//			String first_name= randomgenerator.stringgenerator();
//			String last_name= randomgenerator.stringgenerator();
//			int age= randomgenerator.intgenerator(1, 100);
//			String gender= randomgenerator.gendergenerator();
//			String id= Integer.toString(randomgenerator.intgenerator(1, 109));
			String q1="insert into test1 (first_name, last_name, age, gender,country_id) values (?,?,?,?,?);";
			System.out.println(i);
			PreparedStatement statement=connection.prepareStatement(q1);
			statement.setString(1, randomgenerator.stringgenerator());
			statement.setString(2, randomgenerator.stringgenerator());
			statement.setInt(3,randomgenerator.intgenerator(1, 100));
			statement.setString(4, randomgenerator.gendergenerator());
			statement.setInt(5,randomgenerator.intgenerator(1, 109));
			System.out.println(statement.executeUpdate());
		}
		connection.close();
	}

}
