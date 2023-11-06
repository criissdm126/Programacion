package Ejercicio_5;

public class Principal {

	public static void main(String[] args) {

		SmartDevice  s2 = new SmartDevice ("Apple", "MacOs", "Intel");
		// String marca, String sistemaOperativo, String procesador
		

		SmartPhone sm2 = new SmartPhone("Samsung", "S3", "Andorid", 128);
		// String marca, String modelo, String sistemaOperativo, int capacidadAlmacenamiento
		
		
		SmartWatch sw2 = new SmartWatch("Apple", "Series 4", "MacOs", "Aluminio");
		// String marca, String modelo, String sistemaOperativo, String materialCaja

		
		System.out.println("Datos de el SmartDevice: ");
		System.out.println("Marca: " + s2.getmarca());
		System.out.println("Sistema Operativo: " + s2.getSistemaOperativo());
		System.out.println("Procesador: " + s2.getProcesador());
		
		System.out.println();
	
        System.out.println("Datos del SmartPhone:");
        System.out.println("Marca: " + sm2.getmarca());
        System.out.println("Modelo: " + sm2.getModelo());
        System.out.println("Sistema Operativo: " + sm2.getSistemaOperativo());
        System.out.println("Capacidad de Almacenamiento: " + sm2.getCapacidadAlmacenamiento() + " GB");
		
		System.out.println();
		
		System.out.println("Datos de el SmartWatch: ");
		System.out.println("Marca: " + sw2.getmarca());
		System.out.println("Modelo: " + sm2.getModelo());
		System.out.println("Sistema Operativo: " + sw2.getProcesador());
		System.out.println("Material caja: " + sw2.getMaterialCaja());
		

	}

}

// Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.