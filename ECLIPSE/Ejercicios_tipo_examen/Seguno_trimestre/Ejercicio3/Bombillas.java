package Ejercicio3;

public class Bombillas {
	
	private boolean interruptor;
	private static boolean interruptorGeneral;
	
	public Bombillas() {
		this.interruptor = false;
	}
	
	public void muestraEstado() {
		if (interruptor) {
			System.out.println("La bombilla está encendida.");
		}
		else {
			System.out.println("La bombilla está apagada.");
		}
	}
	
	public void enciende() {
		if (interruptorGeneral) {
			interruptor = true;
			System.out.println("Se ha encendido la bombilla.");
		}
		else {
			System.out.println("No se puede encender la bombilla porque el interruptor general está apagado.");
		}
	}
	
	public void apaga() {
		interruptor = false;
		System.out.println("Se ha apagado la bombilla.");
	}
	
	public static void enciendeGeneral() {
		
		interruptorGeneral = true;
		System.out.println("Se ha encendido el interruptor general.");
	}
	
	public static void apagaGeneral() {
		interruptorGeneral = false;
		System.out.println("Se ha apagado el interruptor general.");
	}
}



/*Tenemos una habitación con varias bombillas, donde cada bombilla se puede apagar o encender individualmente.
 * Además queremos poner un interruptor general, de forma que si este se apaga, todas las bombillas quedan apagadas.
 * Cuando el interruptor general se activa, las bombillas vuelven a su estado anterior, encendias o apagadas, según estuvieran antes.
 * Cada bombilla podrá encenderse si su interruptor individual está activado y ademas hay general.
 * Para ello, hacer una clase Bombillas con al menos lo siguiente:
 *     1. una variable privada interruptor que indique si esta apagada o encendida (debe ser booleana)
 *     2. método muestraEstado() que nos diga si una bombilla en concreto, esta encendida o apagada.
 *     3. un método enciende(), que activa el interruptor de la bombilla.
 *     4. método apaga(), que apaga el interruptor de la bombilla.
 *     5. método enciendeGeneral(), activa el interruptor genrral de la habitación
 *     6. un metodo apagaGeneral(),  que apaga el interruptor general de la habitación.
 */
 