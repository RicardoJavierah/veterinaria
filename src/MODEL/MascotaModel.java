package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Conexion.MySqlDBConexion;
import LOGICA.Duenio;
import LOGICA.Mascota;

public class MascotaModel {
	
	DuenioModel dn = new DuenioModel();
	
	public int guardarMascota(Mascota obj1) {
		int salida;
		MySqlDBConexion cn = new MySqlDBConexion();
		Connection conexion = null;
		PreparedStatement pstm = null;
		
		
		try {
			conexion = cn.conexion();
			pstm = conexion.prepareStatement("insert into tb_mascota values (?,?,?,?,?,?,?,?)");
			pstm.setInt(1,obj1.getNumCliente());
			pstm.setString(2,obj1.getNombreMascota());
			pstm.setString(3, obj1.getRaza());
			pstm.setString(4, obj1.getColor());
			pstm.setString(5, obj1.getAlergia());
			pstm.setString(6, obj1.getAtencion());
			pstm.setString(7, obj1.getObservaciones());
			pstm.setString(8,String.valueOf(dn.ultimoIdDuenioIngresado()));
			//pstm.setInt(8,obj2.getIdDuenio());
			
			pstm.executeUpdate();
			salida = 1;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("0");
			salida = 0;
			
		}finally {
			try {
				if(conexion != null) {
					conexion.close();
				}
				if(pstm != null) {
					pstm.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
		return salida;
		
	}
	
	public ArrayList<Mascota> mostrarMascota() {
		
		MySqlDBConexion cn = new MySqlDBConexion();
		
		Connection conexion = null;
		Statement stm = null;
		ResultSet rs = null;
		
		ArrayList<Mascota> arrayList = new ArrayList<Mascota>();
		Mascota obj = new Mascota();
		try {
			conexion = cn.conexion();
			stm = conexion.createStatement();
			rs = stm.executeQuery("select * from tb_mascota");
			
			while(rs.next()){
				obj.setNumCliente(rs.getInt(1));
				obj.setNombreMascota(rs.getString(2));
				obj.setRaza(rs.getString(3));
				obj.setColor(rs.getString(4));
				obj.setAlergia(rs.getString(5));
				obj.setAtencion(rs.getString(6));
				obj.setObservaciones(rs.getString(7));
			
				arrayList.add(obj);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrayList;
	}
	

}
