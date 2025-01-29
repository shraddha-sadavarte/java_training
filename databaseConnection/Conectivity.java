package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/hr";
		String user="root";
		String password="root";
		String query="select * from employees limit 10";
		
		Connection con=null;
		Statement statement=null;
		try {
			con=DriverManager.getConnection(url,user,password);
			statement=con.createStatement();
			ResultSet resultset=statement.executeQuery(query);
			
			while(resultset.next()) {
				int employee_id=resultset.getInt("employee_id");
				String first_name=resultset.getString("first_name");
				String last_name=resultset.getString("last_name");
				System.out.println("===================================");
				System.out.println("Employee id: "+employee_id+"\nFirst_name: "+first_name+"\nLast_name: "+last_name);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
            // Closing resources
            try {
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
		}
	}

}
