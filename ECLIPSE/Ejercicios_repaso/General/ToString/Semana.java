package ToString;

import java.util.*;

public class Semana {

	public static void main(String[] args) {
		
	       Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un dia de la semana:");
	        String diaIngresado = scanner.nextLine().toUpperCase();

	        try {
	        	   DiaSemana dia = DiaSemana.valueOf(diaIngresado);

	               System.out.println(dia + " es " + dia.toString());
	               
	        } catch (IllegalArgumentException e) {
	            System.out.println("Dia no valido.");
	        }

	        scanner.close();
	    }
	}