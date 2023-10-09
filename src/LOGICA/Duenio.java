package LOGICA;

public class Duenio {

	private static int idDuenio;
	private String nombreCliente;
	private String telfDueno;
	
	public Duenio() {
		
	}
	
	public Duenio(String nombreCliente,String telfDueno) {
		this.nombreCliente=nombreCliente;
		this.telfDueno=telfDueno;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelfDueno() {
		return telfDueno;
	}

	public void setTelfDueno(String telfDueno) {
		this.telfDueno = telfDueno;
	}
	
	public int getIdDuenio() {
		return idDuenio;
	}

	public void setIdDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
	}
	
}
