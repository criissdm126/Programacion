package REPASOPRIMERTRIMESTRE;

public class Arrays_6 {

	public static void main(String[] args) {
		//Generar una tabla a la inversa, que se genera y rellena sola
		
		
		int tabla [][] = {{5,2,4,0},{8,3,7,1}};  //tabla 4x2
		
		pintarMatriz(tabla);
		System.out.println();
		transponer(tabla);
	
	}
	
	static void pintarMatriz (int a[][]) {
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}
	static int [] [] transponer (int b[][]){
		
		int x [][] = new int[2][4];
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				x[j][i] = b[i][j];
			}
		}
		return x;
	}
}
