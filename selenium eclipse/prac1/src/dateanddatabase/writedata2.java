package dateanddatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import collection.listdemo;
import prac.randomgenerator;

public class writedata2 {

	public static void main(String[] args) throws SQLException {
		String url= "jdbc:mysql://localhost:3306/table1?useSSL=false";
		StringBuilder q1=new StringBuilder("insert into test1(first_name,last_name,age,gender) values ");
		for (int i = 0; i <10000; i++) {
			q1.append(" (\"");
			q1.append(randomgenerator.stringgenerator());
			q1.append("\",\"");
			q1.append(randomgenerator.stringgenerator());
			q1.append("\",");
			q1.append(Integer.toString(randomgenerator.intgenerator(1, 100)));
			q1.append(",\"");
			q1.append(randomgenerator.gendergenerator());
			q1.append("\"),");
			System.out.println(i);
		}
		q1.deleteCharAt(q1.length()-1);
		System.out.println(q1.toString());
		String querry=q1.toString();
		Connection connection= DriverManager.getConnection(url,"root","1234");
		PreparedStatement statement=connection.prepareStatement(querry);
//		Statement statement=connection.createStatement();
		System.out.println(statement.executeUpdate());
		connection.close();
	}

}
