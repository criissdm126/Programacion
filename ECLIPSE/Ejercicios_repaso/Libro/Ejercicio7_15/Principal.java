package Ejercicio7_15;

public class Principal {
   
	public static void main(String[] args) {
        
		// Crear una instancia de Calendario
        Calendario fecha = new Calendario(2023, 5, 24);

        // Mostrar la fecha inicial
        System.out.println("Fecha inicial:");
        fecha.mostrar();

        // Incrementar el día
        System.out.println("\nIncrementando un día:");
        fecha.incrementarDia();
        fecha.mostrar();

        // Incrementar el mes
        System.out.println("\nIncrementando un mes:");
        fecha.incrementarMes();
        fecha.mostrar();

        // Incrementar el año
        System.out.println("\nIncrementando dos años:");
        fecha.incrementarAño(2);
        fecha.mostrar();

        // Crear una segunda instancia de Calendario para comparar
        Calendario otraFecha = new Calendario(2023, 5, 24);

        // Verificar si las fechas son iguales
        System.out.println("\nComparando las dos fechas:");
        System.out.println("¿Son iguales las fechas?");
        System.out.println(fecha.iguales(otraFecha));
    }
}
