import java.sql.*;

public class Conector extends Agenda {

	public static void main(String[] args) {
		Connection con;
		boolean isDBConected;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB?serverTimezone=UTC","root","1234");
			System.out.println("Conexión realizada correctamente con base de datos");
			isDBConected = true;
		}
		catch(Exception e)
		{
			isDBConected = false;
			System.out.println("Error en conexión con base de datos");
			System.out.println(e);
		}
		
	}

}
