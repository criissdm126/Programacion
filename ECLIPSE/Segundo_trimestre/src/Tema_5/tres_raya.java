package Tema_5;

import java.util.Arrays;
import java.util.Scanner;

public class tres_raya {

	public static void main(String[] args) {
		
		// i = filas, j = columnas
		
				Scanner sc=new Scanner (System.in);
				
				int tablero [] [] = {{1,2,3}, {4,5,6},{7,8,9}};
				System.out.println (Arrays.deepToString (tablero));
				System.out.println();
				
				sc.close();
				
				tabla(tablero);
				System.out.println();

			}
			
			static void tabla (int a[][]) {
				
				for(int fila=0; fila<=3; fila++) {
					for (int columna=0; columna<=3; columna++) {
						System.out.println(a[fila][columna]);
					}
					System.out.println();
					
				}
			}
		}


