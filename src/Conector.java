import java.sql.*;

public class Conector {
	
	public static Connection conectarSQL(String IP, Integer port, String DBname, String user, String password)
	{
		
		String url= "jdbc:mysql:// " + IP + ":" + "/" + DBname;
		System.out.println(url);
		try {
			Connection conexion = DriverManager.getConnection(url,user,password);
			System.out.println("Conexion realizada");
			return conexion;
		} catch (SQLException e) {
			System.out.println("error al conectar");
		}
			
		return null;
	}
	
	public static void main(String[] args) {
		
		try {
			Connection con1 = conectarSQL("127.0.0.1", 3306,"conductores","root","1234");
			if(con1==null) {System.exit(1);}
			
		String sql1 = "Insert INTO 'agenda'.'contactos'('nombre', 'apellidos','direccion','email',telefono') VALUES ('pepe','gomez', 'calle uno', 'ejemplo6@email.com','654321098')";
			try {
				Statement orden = con1.createStatement();
				orden.executeUpdate(sql1);
			} catch (SQLException e) {
				System.out.println("error al ejecutar la orden");
				e.printStackTrace();
			}
		}	
	}	



