package LOGICA;

public class Mascota {
	
	private int numCliente;
	private String nombreMascota;
	private String raza;
	private String color;
	private String alergia;
	private String atencion;
	private String observaciones;
	//Relacion para la DB
	private int idDuenio;
	
	public Mascota() {
		
	}
	
	public Mascota(int numCliente,String nombreMascota, String raza, String color, String alergia,String atencion,String observacion) {
		this.numCliente = numCliente;
		this.nombreMascota = nombreMascota;
		this.raza = raza;
		this.color = color;
		this.alergia = alergia;
		this.atencion = atencion;
		this.observaciones = observacion;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public String getAtencion() {
		return atencion;
	}

	public void setAtencion(String atencion) {
		this.atencion = atencion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
