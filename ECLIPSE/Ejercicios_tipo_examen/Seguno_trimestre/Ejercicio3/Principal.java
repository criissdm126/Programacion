package Ejercicio3;

public class Principal {
	
	public static void main(String[] args) {
		
		Bombillas bombilla1 = new Bombillas();
		Bombillas bombilla2 = new Bombillas();
		
		bombilla1.muestraEstado(); // La bombilla está apagada.
		bombilla2.muestraEstado(); // La bombilla está apagada.
		Bombillas.enciendeGeneral(); // Se ha encendido el interruptor general.
		
		bombilla1.enciende(); // Se ha encendido la bombilla.
		bombilla2.apaga(); // Se ha apagado la bombilla.
		
		bombilla1.muestraEstado(); // La bombilla está encendida.
		bombilla2.muestraEstado(); // La bombilla está apagada.
		
		Bombillas.apagaGeneral(); // Se ha apagado el interruptor general.
		
		bombilla1.enciende(); // No se puede encender la bombilla porque el interruptor general está apagado.
		bombilla2.apaga(); // Se ha apagado la bombilla.
		
		bombilla1.muestraEstado(); // La bombilla está apagada.
		bombilla2.muestraEstado(); // La bombilla está apagada.
	}
}