package Tema_5;

import java.util.Scanner;

public class Tres_raya_bidimensional {

    static char jugador = '$';
    static char maquina = '%';

    public static void main(String[] args) {

        // i = filas, j = columnas

        char tablero[][] = new char[3][3];
        System.out.println("Juego de 3 en raya");
        rellena(tablero);
        pinta(tablero);

        for (int k = 0; k < 4; k++) {
            juego(tablero, jugador);
            if (ganador(tablero) != ' ') {
                break;
            }
            maq(tablero, maquina);
            if (ganador(tablero) != ' ') {
                break;
            }
        }

        if (ganador(tablero) == jugador) {
            System.out.println("Gana el jugador.");
        } else if (ganador(tablero) == maquina) {
            System.out.println("Gana la maquina.");
        } else {
            System.out.println("Ninguno ha resultado ganador.");
        }

        System.out.println("Acaba de terminar la partida.");

    }

    static void rellena(char a[][]) {
        char cont = '1';
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = cont++;
            }
        }
    }

    static void pinta(char x[][]) {

        System.out.println("Selecciona una casilla disponible.");

        int cont = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] == jugador || x[i][j] == maquina) {
                    System.out.print(x[i][j] + " ");
                } else {
                    System.out.print(cont + " ");
                }
                cont++;
            }
            System.out.println("");
        }
        System.out.println();
    }

    static void juego(char tablero[][], char ficha) {
        Scanner sc = new Scanner(System.in);

        int hueco;
        do {
            System.out.println("Turno del jugador");
            hueco = sc.nextInt() - 1; // se resta 1 para ajustar el índice
            int i = hueco / 3;
            int j = hueco % 3;
            if (tablero[i][j] == jugador || tablero[i][j] == maquina) {
                System.out.println("Ese lugar ya está ocupado. Inténtelo de nuevo.");
            } else {
                tablero[i][j] = ficha;
                pinta(tablero);
                break;
            }
        } while (true);

        sc.close();
    }

    static void maq(char tablero[][], char ficha) {
        int espacio = 0;
        int i = 0, j = 0;

        do {
            System.out.println("Turno de la maquina");
            espacio = (int) (Math.random() * 9); // no es necesario sumar 1 aquí
            i = espacio / 3;
            j = espacio % 3;
        } while (tablero[i][j] == jugador || tablero[i][j] == maquina);

        tablero[i][j] = ficha;
        pinta(tablero);
    }

}
