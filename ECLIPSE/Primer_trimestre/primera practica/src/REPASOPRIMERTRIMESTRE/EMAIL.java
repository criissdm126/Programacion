package REPASOPRIMERTRIMESTRE;

public class EMAIL {

	public static void main(String[] args) {
		
		
		String email = "pepe@gmail.com";
		System.out.println(chek_email (email));
		
		
		}
		
		static boolean chek_email (String a) {
			int longitud = a.length() - 1;
			int puntos = 0, arrobas = 0;
			boolean resultado = false;
			
			for (int i=0; i<=longitud; i++) {
				if (a.charAt(i)== '@');
				arrobas ++;
				if (a.charAt(i)=='.');
				puntos++;
			}
			
			if((arrobas == 1) && (puntos == 1)) {
				resultado = true;
			}
			return resultado;
			
	}

}
