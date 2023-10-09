package LOGICA;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int numeroAleatorio = (int)(1000*Math.random());
		int numero = (int)(Math.random()*10+1);
		double num = Math.random();
		//System.out.println(numeroAleatorio);
		System.out.println(numero);
		
		Mascota mas = new Mascota(1, "wws","wws", "wws", "wws", "wws", "wws");
		mas = new Mascota(3, "hola", "hola", "hola","hola", "hola", "hola");
		
		System.out.println(mas.getNombreMascota());
	}

}
