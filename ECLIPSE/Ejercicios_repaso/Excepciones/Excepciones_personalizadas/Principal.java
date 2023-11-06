package Excepciones_personalizadas;

public class Principal {

	public class Main {
	    public static void main(String[] args) throws NoTieneSaldo {
	        Cajero cajero = new Cajero();
	        cajero.retirar(4);
	        cajero.retirar(5);
	        try {
	            cajero.retirar(3);
	            System.out.println("Retiro exitoso. Saldo restante: " + cajero.getSaldo());
	        } catch (NoTieneSaldo e) {
	            System.out.println("No se puede retirar la cantidad solicitada. Saldo disponible: " + e.getSaldoDisponible());
	        }
	    }
	}
}