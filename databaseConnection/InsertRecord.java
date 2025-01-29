package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertRecord {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/hr";
		String user="root";
		String password="root";
		String query="insert into emp(id,dname,city) values(?,?,?)";
		
		Connection con=null;
		PreparedStatement preparedstatement=null;
		try {
			con=DriverManager.getConnection(url,user,password);
			preparedstatement=con.prepareStatement(query);
			
			preparedstatement.setInt(1, 301);
			preparedstatement.setString(2, "Account");
			preparedstatement.setString(3, "Pune");
			
			int rowsAffected=preparedstatement.executeUpdate();
			
			if(rowsAffected>0) {
				System.out.println("Record inserted successfully!");
			}
			else {
				System.out.println("Failed to insert the record...");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
            // Closing resources
            try {
                if (preparedstatement != null) preparedstatement.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
		}

	}

}
