package Examen_enero_1;

import java.util.Arrays;

public class Aula {

	public static void main(String[] args) {
		
		//Array
		
			Ordenador ram1 = new Ordenador ("ram1", 10, 0);
			Ordenador ram2 = new Ordenador ("ram2", 20, 0);
			Ordenador ram3 = new Ordenador ("ram3", 30, 0);
			
			Ordenador misOrdenadores[] = {ram1, ram2, ram3};
			int lonArrays = misOrdenadores.length-1;
			for(int i=0; i==lonArrays; i++) {
				misOrdenadores[i].getConsumo(10*1);
			}
			
			recorreArray(misOrdenadores);
			
			ram1.equals(ram2);

			System.out.println();

		}
		
		public static void recorreArray(Ordenador[] ordenador) {
			for(int i=0; i<=ordenador.length-1; i++) {
				System.out.println(ordenador[i].toString());		
				}
		}
		
		public static void maxConsumo(Ordenador ordenador[]) {
			Ordenador max=ordenador[0];
			for(int i=0; i<ordenador.length; i++) {
				if (ordenador[i].setConsumo()>max.getconsumoTotal()) {
					max=ordenador[i];
				}
			}
			System.out.println(max.toString());
		}

}
