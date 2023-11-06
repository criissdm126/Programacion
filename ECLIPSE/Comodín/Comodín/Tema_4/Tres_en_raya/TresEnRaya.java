package Tres_en_raya;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
private static final int TAMANIO_TABLERO = 3;
private static final char SIMBOLO_USUARIO = 'X';
private static final char SIMBOLO_MAQUINA = 'O';
private static final char VACIO = 0;
private static final char MAQUINA = 0;
private static char[][] tablero = new char[TAMANIO_TABLERO][TAMANIO_TABLERO];
private static Scanner scanner = new Scanner(System.in);
private static Random random = new Random();


public static void main(String[] args) {
    inicializarTablero();
    mostrarTablero();
    while (!hayGanador1() && !hayEmpate()) {
        jugarUsuario();
        mostrarTablero();
        if (!hayGanador1() && !hayEmpate()) {
            jugarMaquina();
            mostrarTablero();
        }
    }
    if (hayGanador1()) {
        System.out.println("¡Has ganado!");
    } else {
        System.out.println("¡Empate!");
    }
}

private static void inicializarTablero() {
    for (int i = 0; i < TAMANIO_TABLERO; i++) {
        for (int j = 0; j < TAMANIO_TABLERO; j++) {
            tablero[i][j] = (char) ('1' + i * TAMANIO_TABLERO + j);
        }
    }
}

    private static void mostrarTablero() {
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void jugarUsuario() {
        int fila, columna;
        do {
            System.out.print("Ingrese la casilla deseada (1-9): ");
            int casilla = scanner.nextInt();
            fila = (casilla - 1) / TAMANIO_TABLERO;
            columna = (casilla - 1) % TAMANIO_TABLERO;
        } while (!esCasillaValida(fila, columna));
        tablero[fila][columna] = SIMBOLO_USUARIO;
    }

    private static void jugarMaquina() {
        int fila, columna;
        do {
            fila = random.nextInt(TAMANIO_TABLERO);
            columna = random.nextInt(TAMANIO_TABLERO);
        } while (!esCasillaValida(fila, columna));
        tablero[fila][columna] = SIMBOLO_MAQUINA;
    }

    private static boolean esCasillaValida(int fila, int columna) {
        return fila >= 0 && fila < TAMANIO_TABLERO && columna >= 0 && columna < TAMANIO_TABLERO
                && tablero[fila][columna] != SIMBOLO_USUARIO && tablero[fila][columna] != SIMBOLO_MAQUINA;
    }

    private static boolean hayGanador1() {
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true;
            }
        }
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true;
        }
        return false;
    }
    
    private static boolean hayEmpate() {
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void imprimirTablero() {
        System.out.println("-------------");
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            System.out.print("| ");
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    private static void jugarTurnoUsuario() {
        int fila, columna;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce la fila (1-" + TAMANIO_TABLERO + "): ");
            fila = scanner.nextInt() - 1;
            System.out.print("Introduce la columna (1-" + TAMANIO_TABLERO + "): ");
            columna = scanner.nextInt() - 1;
        } while (fila < 0 || fila >= TAMANIO_TABLERO || columna < 0 || columna >= TAMANIO_TABLERO || tablero[fila][columna] != ' ');

        tablero[fila][columna] = 'X';
    }

    private static boolean jugarTurnoMaquina() {
        int fila = -1, columna = -1;

        int ultimaJugadaColumna = 0;
		// Primero intenta colocar la ficha en la misma columna que la última jugada del usuario
        if (ultimaJugadaColumna != -1) {
            for (int i = 0; i < TAMANIO_TABLERO; i++) {
                if (tablero[i][ultimaJugadaColumna] == VACIO) {
                    fila = i;
                    columna = ultimaJugadaColumna;
                    break;
                }
            }
        }

        int ultimaJugadaFila = 0;
		// Luego intenta colocar la ficha en la misma fila que la última jugada del usuario
        if (fila == -1 && ultimaJugadaFila != -1) {
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                if (tablero[ultimaJugadaFila][j] == VACIO) {
                    fila = ultimaJugadaFila;
                    columna = j;
                    break;
                }
            }
        }
        
        // Finalmente intenta colocar la ficha en la misma diagonal que la última jugada del usuario
        if (fila == -1 && columna == -1 && ultimaJugadaFila != -1 && ultimaJugadaColumna != -1) {
            // Comprueba si la última jugada del usuario está en la diagonal principal
            if (ultimaJugadaFila == ultimaJugadaColumna) {
                for (int i = 0; i < TAMANIO_TABLERO; i++) {
                    if (tablero[i][i] == VACIO) {
                        fila = i;
                        columna = i;
                        break;
                    }
                }
            }
            // Comprueba si la última jugada del usuario está en la diagonal secundaria
            else if (ultimaJugadaFila + ultimaJugadaColumna == TAMANIO_TABLERO - 1) {
                for (int i = 0; i < TAMANIO_TABLERO; i++) {
                    if (tablero[i][TAMANIO_TABLERO - 1 - i] == VACIO) {
                        fila = i;
                        columna = TAMANIO_TABLERO - 1 - i;
                        break;
                    }
                }
            }
        }
        
        if (fila == -1 || columna == -1) {
            return false; // No se ha podido colocar la ficha
        }
        else {
            tablero[fila][columna] = MAQUINA;
            ultimaJugadaFila = fila;
            ultimaJugadaColumna = columna;
            return true;
        }
    }

    
    private static boolean hayGanador() {
    	for (int i = 0; i < TAMANIO_TABLERO; i++) {
    	if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
    	return true;
    	}
    	if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
    	return true;
    	}
    	}
    	if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
    	return true;
    	}
    	if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
    	return true;
    	}
    	return false; // No hay ganador
    	}
    
    private static void mostrarTablero1() {
    	System.out.println("Tablero:");
    	for (int i = 0; i < TAMANIO_TABLERO; i++) {
    	for (int j = 0; j < TAMANIO_TABLERO; j++) {
    	System.out.print(tablero[i][j] + " ");
    	}
    	System.out.println();
    	}
    	System.out.println();
    	}


	}


