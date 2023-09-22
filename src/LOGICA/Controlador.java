package LOGICA;

import java.util.ArrayList;

import MODEL.DuenioModel;
import MODEL.MascotaModel;

public class Controlador {
	
	public boolean guardarDuenioMascota(String nombreDuenio,String telefono,int numCliente,String nombreMascota,
									String raza,String color,String alergia,String atencion,String observacion) {
		
		Duenio duenio = new Duenio(nombreDuenio,telefono);
		
		Mascota mascota = new Mascota(numCliente,nombreMascota,raza,color,alergia,atencion,observacion);
		
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
	
}
