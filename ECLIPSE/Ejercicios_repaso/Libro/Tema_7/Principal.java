package Tema_7;

public class Principal {

	public static void main(String[] args) {
	    
		CuentaCorriente cuenta = new CuentaCorriente("123456789", "John Doe");
	    cuenta.mostrarInformacion(); // Muestra la información inicial de la cuenta

	    cuenta.ingresarDinero(1000);
	    cuenta.mostrarInformacion(); // Muestra la información después de realizar el depósito

	    boolean operacionExitosa = cuenta.sacarDinero(500);
	    if (operacionExitosa) {
	        System.out.println("Retiro exitoso");
	    } else {
	        System.out.println("Saldo insuficiente");
	    }
	    cuenta.mostrarInformacion(); // Muestra la información después de realizar el retiro
	}
}