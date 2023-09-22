package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class MySqlDBConexion {
	private final static String driver = "com.mysql.jdbc.Driver"; 
	private final static String cadenaConexion = "jdbc:mysql://localhost:3306/BD_PeluqueriaCanina";
	private final static String user = "root";
	private final static String password = "mysql";	
		
	static {
		
		//carga el driver de mysql-connector
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
			e.printStackTrace();
		}
		
	}
	public Connection conexion() {
		Connection conexion = null;		
		try {			
			//Estable coneccion con una BD
			conexion = DriverManager.getConnection(cadenaConexion,user,password);
			System.out.println("Coneccion OKEY!!!");
		}catch (SQLException e) {
			System.out.println("Error en la coneccion");
			e.printStackTrace();
		}return conexion;
		
	}	
}
