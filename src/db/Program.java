package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.connector.DbConnect;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connect = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			connect = DbConnect.getConnection();
			st = connect.createStatement();
			rs = st.executeQuery("Select * from department");
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt("Id") + 
									", Name: " + rs.getString("Name"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DbConnect.closeConnection();
			DbConnect.closeStatement(st);
			DbConnect.closeResultSet(rs);
		}
		
	}

}
