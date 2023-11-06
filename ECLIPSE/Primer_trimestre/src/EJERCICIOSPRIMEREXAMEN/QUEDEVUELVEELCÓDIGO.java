package EJERCICIOSPRIMEREXAMEN;

public class QUEDEVUELVEELCÓDIGO {
	public static void main(String[] args) {
		
		String frase = "isa toco lana";
		frase = frase.replace(" ", "");
		
		
		boolean palindromo = false;
		for (int i =0; i<(frase.length()-1)/2; i++) {
			if (frase.charAt(i) == frase.charAt(frase.length()-1-i))
				palindromo = true;
		}
		
		if (palindromo == true)
			System.out.println("Es un palindromo.");
		else  System.out.println("Es un palindromo.");

	

	}

}
