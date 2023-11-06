package Condicionales;

import java.util.Scanner;

public class Ej_1_Horoscopo {

    public static void main(String[] args) {
        
        System.out.println("Dime tu dia de nacimiento: "); //se pregunta el día
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        
        System.out.println("Dime tambien tu mes de nacimiento: "); //se pregunta el mes
        int mes = sc.nextInt(); 

        // Comprobamos el horóscopo según el día y mes 
        if (dia >= 21 && (mes == 3 || mes == 4) || dia <= 19 && mes == 4) { //abril
            System.out.println("Tu signo del zodiaco es Aries");
        }
		
		else if (dia >= 20 && (mes == 4 || mes == 5) || dia <= 20 && mes == 5) { //mayo
            System.out.println("Tu signo del zodiaco es Tauro");
        }
		
		else if (dia >= 21 && (mes == 5 || mes == 6) || dia <= 20 && mes == 6) { //junio
            System.out.println("Tu signo del zodiaco es Géminis");
        }
		
		else if (dia >= 21 && (mes == 6 || mes == 7) || dia <= 22 && mes == 7) { //julio
            System.out.println("Tu signo del zodiaco es Cáncer");
        }
		
		else if (dia >= 22 && (mes == 7 || mes == 8) || dia <= 22 && mes == 8) { //agosto
            System.out.println("Tu signo del zodiaco es Leo");
        }
		else if (dia >= 23 && (mes == 8 || mes == 9) || dia <= 22 && mes == 9) { //septiembre
            System.out.println("Tu signo del zodiaco es Virgo");
        }
		
		else if (dia >= 23 && (mes == 9 || mes == 10) || dia <= 22 && mes == 10) { //octubre
            System.out.println("Tu signo del zodiaco es Libra");
        }
		
		else if (dia >= 23 && (mes == 10 || mes == 11) || dia <= 21 && mes == 11) { //noviembre
            System.out.println("Tu signo del zodiaco es Escorpio");
        }
		
		else if (dia >= 22 && (mes == 11 || mes == 12) || dia <= 21 && mes == 12) { //diciembre
            System.out.println("Tu signo del zodiaco es Sagitario");
        }
		
		else if (dia >= 22 && (mes == 12 || mes == 1) || dia <= 19 && mes == 1) { //enero
            System.out.println("Tu signo del zodiaco es Capricornio");
        }
		
		else if (dia >= 20 && (mes == 1 || mes == 2) || dia <= 18 && mes == 2) { //febrero
            System.out.println("Tu signo del zodiaco es Acuario");
        }
		
		else if (dia >= 19 && (mes == 2 || mes == 3) || dia <= 20 && mes == 3) { //marzo
            System.out.println("Tu signo del zodiaco es Piscis");
        }
        sc.close();
    }
}

// Dado una fecha de nacimiento, mostrar el horóscopo, tener en cuenta que hay meses con más días que otros.