package Ejercicio_Cartas;

import java.util.*;

public class Baraja {

	    public static void main(String[] args) {
	        List<Carta> cartas = new ArrayList<>();
	        cartas.add(new Carta(5, Palo.PICAS));
	        cartas.add(new Carta(3, Palo.CORAZONES));
	        cartas.add(new Carta(2, Palo.TREBOLES));
	        cartas.add(new Carta(8, Palo.DIAMANTES));
	        cartas.add(new Carta(10, Palo.PICAS));
	        cartas.add(new Carta(6, Palo.CORAZONES));
	        
	        System.out.println("Cartas ordenadas por palo y número:");
	        Collections.sort(cartas);
	        for (Carta carta : cartas) {
	            System.out.println(carta);
	        }
	        
	        System.out.println("\nCartas ordenadas por número:");
	        cartas.sort((Carta c1, Carta c2) -> c1.getNumero() - c2.getNumero());
	        for (Carta carta : cartas) {
	            System.out.println(carta);
	        }
	        
	        System.out.println("\nCartas al azar:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(Carta.generarCartaAzar());
	        }
	    }
	}