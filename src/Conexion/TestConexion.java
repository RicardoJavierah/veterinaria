package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	
	public static void main(String[] args) {
	
		MySqlDBConexion conexion = new MySqlDBConexion();
		Connection cn = null;
		PreparedStatement pstm = null;
		//Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conexion();
			pstm = cn.prepareStatement("select * from tb_duenio");
			//stm = cn.createStatement();
			//rs = stm.executeQuery("select * from tb_duenio");
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				int idDuenio = rs.getInt(1);
				String nameDuenio = rs.getString(2);
				String telefono = rs.getString(3);
				
				System.out.println(idDuenio +"-"+ nameDuenio +"-"+ telefono);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(rs != null) {
					rs.close();
					}
					if(pstm != null) {
						pstm.close();
					}
					if(cn != null) {
						cn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

