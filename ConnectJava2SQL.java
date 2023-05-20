import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectJava2SQL {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver:sqlsrv;
		String user = "sa";
		String password = "PH@123456789";
		
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			
			System.out.println("Connected to Microsoft SQL Server");
		}
		
		catch(SQLException e){
			System.out.println("There is an error");
			e.printStackTrace();
		}
	}

	

}
