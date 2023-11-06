package Condicionales;


import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pon tu dia de nacimiento: ");
		int dia = sc.nextInt();
		
		System.out.println("Ahora pon tu mes de nacimiento, en numeros, por ejemplo si es marzo pon un 3: ");
		int mes = sc.nextInt();
		
		
		String signo = ""; // variable para almacenar el signo del zodiaco
		
		if (mes == 1) { // Enero
			if (dia >= 1 && dia <= 19) {
				signo = "Capricornio";
			}
			else {
				signo = "Acuario";
			}
		}
		else if (mes == 2) { // Febrero
			if (dia >= 1 && dia <= 18) {
				signo = "Acuario";
			}
			else {
				signo = "Piscis";
			}
		}
		else if (mes == 3) { // Marzo
			if (dia >= 1 && dia <= 20) {
				signo = "Piscis";
			}
			else {
				signo = "Aries";
			}
		}
		else if (mes == 4) { // Abril
			if (dia >= 1 && dia <= 19) {
				signo = "Aries";
			}
			else {
				signo = "Tauro";
			}
		}
		else if (mes == 5) { // Mayo
			if (dia >= 1 && dia <= 20) {
				signo = "Tauro";
			}
			else {
				signo = "Geminis";
			}
		}
		else if (mes == 6) { // Junio
			if (dia >= 1 && dia <= 20) {
				signo = "Geminis";
			}
			else {
				signo = "Cancer";
			}
		}
		else if (mes == 7) { // Julio
			if (dia >= 1 && dia <= 22) {
				signo = "Cancer";
			}
			else {
				signo = "Leo";
			}
		}
		else if (mes == 8) { // Agosto
			if (dia >= 1 && dia <= 22) {
				signo = "Leo";
			}
			else {
				signo = "Virgo";
			}
		}
		else if (mes == 9) { // Septiembre
			if (dia >= 1 && dia <= 22) {
				signo = "Virgo";
			}
			else {
				signo = "Libra";
			}
		}
		else if (mes == 10) { // Octubre
			if (dia >= 1 && dia <= 22) {
				signo = "Libra";
			}
			else {
				signo = "Escorpio";
			}
		}
		else if (mes == 11) { // Noviembre
			if (dia >= 1 && dia <= 21) {
				signo = "Escorpio";
			}
			else {
				signo = "Sagitario";
			}
		}
		else if (mes == 12) {
			if (dia < 22) {
			signo = "Sagitario";
			}
			else {
			signo = "Capricornio";
			}
			}
			else {
			signo = "Fecha de nacimiento no valida";
			}
		System.out.println("Tu signo del zodiaco es " + signo);
		
		sc.close();
	}
}
// Dado una fecha de nacimiento, mostrar el horóscopo, tener en cuenta que hay meses con más días que otros.