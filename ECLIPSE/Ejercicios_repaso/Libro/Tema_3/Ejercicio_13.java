package Tema_3;

import java.util.*;

public class Ejercicio_13 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce la hora: ");
	        int hora = sc.nextInt();
	        System.out.print("Introduce los minutos: ");
	        int minutos = sc.nextInt();
	        System.out.print("Introduce los segundos: ");
	        int segundos = sc.nextInt();
	        System.out.print("Introduce los segundos a incrementar: ");
	        int segundosAIncrementar = sc.nextInt();

	        // Convertimos todo a segundos para facilitar el cálculo
	        int tiempoEnSegundos = hora * 3600 + minutos * 60 + segundos;
	        tiempoEnSegundos += segundosAIncrementar;

	        // Calculamos la nueva hora, minutos y segundos
	        hora = tiempoEnSegundos / 3600;
	        minutos = (tiempoEnSegundos % 3600) / 60;
	        segundos = tiempoEnSegundos % 60;

	        // Mostramos el resultado
	        System.out.println("La hora resultante es: " + hora + ":" + minutos + ":" + segundos);
	        sc.close();
	    }
	}
/*Escribe un programa que incremente la hora d eun reloj.
 * Se pedirá por teclado la hora, minutos y segundos, así como cuántos segundos se deasea incrementar la hora introducida.
 * La aplicación mostrará de nuevo la hora.
 * Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01
 */
 