package Ejercicio_7;

public class Funcion {
	
	public static void dividePorCero() throws ArithmeticException {
	    throw new ArithmeticException("¡División por cero!");
	}

	public static void main(String[] args) {
	    try {
	        dividePorCero();
	    } catch (ArithmeticException e) {
	        System.out.println("Esto no puede hacerse");
	    } finally {
	        System.out.println("Demo de código");
	    }
	}

}
/*Crea una función DividePorCero.
 * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante
 * (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 */