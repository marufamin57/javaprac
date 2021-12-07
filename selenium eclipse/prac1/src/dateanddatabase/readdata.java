package dateanddatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class readdata {
	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/sakila?useSSL=false";
		String q1="select country from country;";
		String q2="select count(country) from country;";
		try {
			Connection connection= DriverManager.getConnection(url,"root","1234");
			Statement statement=connection.createStatement();
			Statement statement2=connection.createStatement();
			ResultSet rs= statement.executeQuery(q1);
			ResultSet rs2= statement2.executeQuery(q2);
			while (rs.next()) {
				String zx= rs.getString("country");
				System.out.println(zx);
			}
			while (rs2.next()) {
				int zx= rs2.getInt("count(country)");
				System.out.println(zx);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
