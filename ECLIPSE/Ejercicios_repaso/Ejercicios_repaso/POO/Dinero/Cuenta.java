package Dinero;

public class Cuenta {
	
	String titular;
	double cantidad;
	
	// CONSTRUCTOR CON TODO
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	
	// CONSTRUSCTOR SÓLO CON TITULAR
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}


	// GETTER Y SETTER
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	// TOSTRING
		@Override
	public String toString() {
		return "Cuenta [TITULAR: " + titular + ", CANTIDAD: " + cantidad + "]";
	}
		
		 // Método para ingresar una cantidad a la cuenta
	    public void ingresar(double cantidad) {
	        if (cantidad > 0) {
	            this.cantidad += cantidad;
	        }
	    }

	    // Método para retirar una cantidad de la cuenta
	    public void retirar(double cantidad) {
	        if (cantidad > 0) {
	            if (this.cantidad - cantidad < 0) {
	                this.cantidad = 0;
	            }
	            else {
	                this.cantidad -= cantidad;
	            }
	        }
	    }
	}

/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
 * El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
 * Crea sus métodos get, set y toString.
 * Tendrá dos métodos especiales:
 *         ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
 *         retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */
