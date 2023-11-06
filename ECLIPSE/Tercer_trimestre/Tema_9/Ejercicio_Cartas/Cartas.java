package Ejercicio_Cartas;

import java.util.*;

class Carta implements Comparable<Carta> {
    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public int compareTo(Carta otraCarta) {
        int resultado = this.palo.compareTo(otraCarta.getPalo());
        if (resultado == 0) {
            resultado = Integer.compare(this.numero, otraCarta.getNumero());
        }
        return resultado;
    }

    public String toString() {
        return numero + " de " + palo.toString();
    }

    public static Carta generarCartaAzar() {
        Random rand = new Random();
        int numero = rand.nextInt(13) + 1;
        Palo palo = Palo.values()[rand.nextInt(Palo.values().length)];
        return new Carta(numero, palo);
    }
    

public enum Palo {
	COPAS, OROS, BASTOS, ESPADAS;

}

}