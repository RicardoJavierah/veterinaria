package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Conexion.MySqlDBConexion;
import LOGICA.Duenio;

public class DuenioModel {
	
	public int guardarDuenio(Duenio obj) {
		int salida;
		MySqlDBConexion cn = new MySqlDBConexion();
		
		Connection conexion = null;
		PreparedStatement pstm = null;
	
		try {
			conexion = cn.conexion();
			pstm = conexion.prepareStatement("insert into tb_duenio values (null,?,?)");
			pstm.setString(1,obj.getNombreCliente());
			pstm.setString(2,obj.getTelfDueno());
			pstm.executeUpdate();
			
			salida = 1;
			//salida = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			salida = 0;
		}finally {
			
				try {
					if(conexion!=null) {
						conexion.close();
					}
					if(pstm != null) {
						pstm.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return salida;
	}
	
	public int ultimoIdDuenioIngresado() {

		MySqlDBConexion cn = new MySqlDBConexion();
		
		Connection conexion = null;
		Statement stm = null;
		ResultSet rs =null;
		
		int id=0;
		
		try {
			conexion = cn.conexion();
			stm = conexion.createStatement();
			rs = stm.executeQuery("select *  from tb_duenio");
			
			while(rs.next()) {
				id = rs.getInt(1);
				String nombreCliente = rs.getString(2);
				String telf = rs.getString(3);		
				System.out.println(id + " - "  + nombreCliente + " - "+ telf);

				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(conexion!=null) {
						conexion.close();
					}
					if(stm != null) {
						stm.close();
					}
					if(rs !=null) {
						rs.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return id;
	}

	public ArrayList<Duenio> mostrarDuenio() {
			MySqlDBConexion cn = new MySqlDBConexion();
			
			Connection conexion = null;
			Statement stm = null;
			ResultSet rs =null;
			
			ArrayList<Duenio> arrayList = new ArrayList<Duenio>();
			
			
			try {
				conexion = cn.conexion();
				stm = conexion.createStatement();
				rs = stm.executeQuery("select *  from tb_duenio");
				
				while(rs.next()) {
					Duenio obj = new Duenio();
					
					obj.setIdDuenio(rs.getInt(1));
					obj.setNombreCliente(rs.getString(2));
					obj.setTelfDueno(rs.getString(3));		
					
					arrayList.add(obj);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
					try {
						if(conexion!=null) {
							conexion.close();
						}
						if(stm != null) {
							stm.close();
						}
						if(rs !=null) {
							rs.close();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return arrayList;
	}

	public void actualizarDuenio(Duenio obj,String nombre,String telf) {
		MySqlDBConexion cn = new MySqlDBConexion();
		Connection conexion = null;
		PreparedStatement pstm = null;
		
		
		try {
			conexion = cn.conexion();
			pstm = conexion.prepareStatement("update tb_duenio set nombre_cliente =?, telf_duenio =? where nombre_cliente =? and telf_duenio=?");
			pstm.setString(1, obj.getNombreCliente());
			pstm.setString(2,obj.getTelfDueno());
			pstm.setString(3, nombre);
			pstm.setString(4,telf);
			
			pstm.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(conexion!=null) {
					conexion.close();
				}
				if(pstm != null) {
					pstm.close();
				}}catch (Exception e) {
					e.printStackTrace();
				}
		
		}}
	
	public void eliminarDuenio(Duenio obj) {
		MySqlDBConexion cn = new MySqlDBConexion();
		Connection coneccion = null;
		PreparedStatement pstm = null;
		
		try {
			coneccion = cn.conexion();
			pstm = coneccion.prepareStatement("delete from tb_duenio where nombre_cliente =? and telf_duenio =?");
			pstm.setString(1,obj.getNombreCliente());
			pstm.setString(2,obj.getTelfDueno());
			
			pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

