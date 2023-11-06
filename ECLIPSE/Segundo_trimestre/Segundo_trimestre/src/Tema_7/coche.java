package Tema_7;

public class coche {
	private String marca;
	private String modelo;
	private int kilometraje;
	
	
	//atributo clase
	private static int kilometrajeTotal = 0;
	
	public coche(String ma, String mo) {
		marca = ma;
		modelo = mo;
		kilometraje = 0;
	}
	
	public int getkilometraje() {
		return kilometraje;
	}
	
	//recorre una distancia
	public void recorre (int km) {
		kilometraje += km;
		kilometrajeTotal += km;
	}
	
	//metodo clase
	public static int getkilometrajeTotal() {
		return kilometrajeTotal;
	}


}


