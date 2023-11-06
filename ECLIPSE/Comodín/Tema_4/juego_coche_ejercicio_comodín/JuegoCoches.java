package juego_coche_ejercicio_comodín;

import java.util.Scanner;
import java.util.Random;

public class JuegoCoches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int tamanoTablero, numBombas, numMuros;
        char[][] tablero;
        int[] coche = new int[2];
        int[] meta = {9, 9};
        boolean terminado = false;
        
        // Pedimos al usuario los parámetros del juego
        System.out.print("Introduzca el tamaño del tablero: ");
        tamanoTablero = input.nextInt();
        System.out.print("Introduzca el número de bombas: ");
        numBombas = input.nextInt();
        System.out.print("Introduzca el número de muros: ");
        numMuros = input.nextInt();
        
        // Creamos el tablero y lo inicializamos con celdas libres
        tablero = new char[tamanoTablero][tamanoTablero];
        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                tablero[i][j] = 'L';
            }
        }
        
        // Colocamos el coche de forma aleatoria en el tablero
        coche[0] = rand.nextInt(tamanoTablero);
        coche[1] = rand.nextInt(tamanoTablero);
        tablero[coche[0]][coche[1]] = 'C';
        
        // Colocamos las bombas de forma aleatoria en el tablero
        for (int i = 0; i < numBombas; i++) {
            int x = rand.nextInt(tamanoTablero);
            int y = rand.nextInt(tamanoTablero);
            if (tablero[x][y] == 'L' && (x != coche[0] || y != coche[1]) && (x != meta[0] || y != meta[1])) {
                tablero[x][y] = 'B';
            } else {
                i--;
            }
        }
        
     // Colocamos los muros de forma aleatoria en el tablero
        for (int i = 0; i < numMuros; i++) {
            int x = rand.nextInt(tamanoTablero);
            int y = rand.nextInt(tamanoTablero);
            if (tablero[x][y] == 'L' && (x != coche[0] || y != coche[1]) && (x != meta[0] || y != meta[1])) {
                tablero[x][y] = 'M';
            } else {
                i--;
            }
        }
        
        // Mostramos el tablero inicial
        mostrarTablero(tablero);
        
        // Bucle principal del juego
        while (!terminado) {
            // Pedimos al jugador que introduzca una dirección
            System.out.print("Introduzca una dirección (D=der, A=izq, W=arr, S=aba): ");
            char direccion = input.next().charAt(0);
            
         // Movemos el coche en la dirección indicada
            int[] nuevaPosicion = moverCoche(tablero, coche, direccion);
            if (nuevaPosicion == null) {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.\")";
                		+ }""
                				+ "else {\r\n"
                		+ "int fila = nuevaPosicion[0];\r\n"
                		+ "int columna = nuevaPosicion[1];\r\n"
                		+ "char casilla = tablero[fila][columna];"
                		+ "if (casilla == 'B') {\r\n"
                		+ "                System.out.println(\"¡Has perdido! Caíste en una bomba.\");\r\n"
                		+ "                juegoEnCurso = false;\r\n"
                		+ "            } else if (casilla == 'M') {\r\n"
                		+ "                System.out.println(\"Movimiento no válido. Hay un muro.\");\r\n"
                		+ "            } else if (casilla == 'L') {\r\n"
                		+ "                tablero[fila][columna] = 'C';\r\n"
                		+ "                tablero[coche[0]][coche[1]] = 'L';\r\n"
                		+ "                coche[0] = fila;\r\n"
                		+ "                coche[1] = columna;\r\n"
                		+ "                imprimirTablero(tablero);\r\n"
                		+ "                if (fila == 9 && columna == 9) {\r\n"
                		+ "                    System.out.println(\"¡Felicidades! Has llegado a la meta.\");\r\n"
                		+ "                    juegoEnCurso = false;\r\n"
                		+ "                }\r\n"
                		+ "            }\r\n"
                		+ "        }\r\n"
                		+ "    }\r\n"
                		+ "    entrada.close();\r\n"
                		+ "}\r\n"
                		+ "\r\n"
                		+ "public static void imprimirTablero(char[][] tablero) {\r\n"
                		+ "    System.out.println();\r\n"
                		+ "    for (int i = 0; i < tablero.length; i++) {\r\n"
                		+ "        for (int j = 0; j < tablero[i].length; j++) {\r\n"
                		+ "            System.out.print(tablero[i][j] + \" \");\r\n"
                		+ "        }\r\n"
                		+ "        System.out.println();\r\n"
                		+ "    }\r\n"
                		+ "}\r\n"
                		+ "\r\n"
                		+ "public static int[] moverCoche(char[][] tablero, int[] coche, char direccion) {\r\n"
                		+ "    int fila = coche[0];\r\n"
                		+ "    int columna = coche[1];\r\n"
                		+ "    \r\n"
                		+ "    if (direccion == 'W') {\r\n"
                		+ "        fila--;\r\n"
                		+ "    } else if (direccion == 'S') {\r\n"
                		+ "        fila++;\r\n"
                		+ "    } else if (direccion == 'A') {\r\n"
                		+ "        columna--;\r\n"
                		+ "    } else if (direccion == 'D') {\r\n"
                		+ "        columna++;\r\n"
                		+ "    }\r\n"
                		+ "    \r\n"
                		+ "    if (fila < 0 || fila >= tablero.length || columna < 0 || columna >= tablero[0].length) {\r\n"
                		+ "        return null;\r\n"
                		+ "    } else {\r\n"
                		+ "        int[] nuevaPosicion = {fila, columna};\r\n"
                		+ "        return nuevaPosicion;\r\n"
                		+ "    }

	}

}
