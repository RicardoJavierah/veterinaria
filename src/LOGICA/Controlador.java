package LOGICA;

import java.util.ArrayList;

import MODEL.DuenioModel;
import MODEL.MascotaModel;

public class Controlador {
	
	//Variables Globales que vamos a usar en todo el controlador
	Duenio duenio;
	Mascota mascota;
	
	public boolean guardarDuenioMascota(String nombreDuenio,String telefono,int numCliente,String nombreMascota,
									String raza,String color,String alergia,String atencion,String observacion) {
		
		duenio = new Duenio(nombreDuenio,telefono);
		
		mascota = new Mascota(numCliente,nombreMascota,raza,color,alergia,atencion,observacion);
		
		DuenioModel duenioModel = new DuenioModel();
		MascotaModel mascotaModel = new MascotaModel();
		
		
		if(duenioModel.guardarDuenio(duenio) == 1 ) {
			if(mascotaModel.guardarMascota(mascota) == 1) {
				return true;
			}
		}	
		return false;
	
	}
	
	public ArrayList<Mascota> listarMascota() {		
		MascotaModel masModel = new MascotaModel();
		return masModel.mostrarMascota();
	}
	
	public ArrayList<Duenio> listarDuenio() {		
		DuenioModel dueModel = new DuenioModel();
		return dueModel.mostrarDuenio();
	}
	
	public void actualizarMascota(int numMascota,String nombreMascota,String raza,String color,String alergia,String atencion,String obs,int idCliente) {
		mascota = new Mascota(numMascota, nombreMascota, raza, color, alergia, atencion, obs);
		MascotaModel masModel = new MascotaModel();
		masModel.actualizarMascota(mascota,idCliente);
	}
	
	public void actualizarDuenio(String nombreDuenio,String telfDuenio,String nombre,String telf) {
		duenio = new Duenio(nombreDuenio, telfDuenio);
		DuenioModel dueModel = new DuenioModel();
		dueModel.actualizarDuenio(duenio,nombre,telf);
	}

	public void eliminarMascota(int numCliente,String nombreMascota, String raza, String color, String alergia,String atencion,String observacion) {
		mascota = new Mascota(numCliente,nombreMascota,raza,color,alergia,atencion,observacion);
		MascotaModel masModel = new MascotaModel();
		masModel.eliminarMascota(mascota);
	}
	
	public void eliminarDuenio(String nombreCliente,String telfDueno) {
		duenio = new Duenio(nombreCliente, telfDueno);
		DuenioModel dueModel = new DuenioModel();
		dueModel.eliminarDuenio(duenio);
	}
}
