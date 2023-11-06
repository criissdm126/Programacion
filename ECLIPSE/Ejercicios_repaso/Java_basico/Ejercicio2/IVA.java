package Ejercicio2;

public class IVA {


	public static void main(String[] args) {
		
		double precio = 100.0;
		double precioConIVA = calcularPrecioConIVA(precio);
		System.out.println("El precio con IVA es: " + precioConIVA);


	}
	
	public static double calcularPrecioConIVA(double precio) {
	    double iva = 0.21; // IVA del 21%
	    double precioConIVA = precio * (1 + iva);
	    return precioConIVA;
	}


}
