import java.sql.*;

public class Conector {
	
	public static Connection conectarSQL(String IP, Integer port, String DBname, String user, String password)
	{
		
		String url= "jdbc:mysql:// " + IP + ":" + "/" + DBname;
		System.out.println(url);
		try {
			Connection conexion = DriverManager.getConnection(url,user,password);
			
		} catch (SQLException e) {
			
		}
		
		
		return null;
	}
	}


