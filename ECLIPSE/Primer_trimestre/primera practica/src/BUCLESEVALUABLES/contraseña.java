package BUCLESEVALUABLES;

import java.util.*;

public class contraseña {

	public static void main(String[] args) {
		
		System.out.println("La contraseña contiene, una mayuscula (es la primera letra), y tres numeros.");
		System.out.println("Tiene 3 intentos.");
		System.out.println("Introduzca la contraseña: ");
		Scanner sc = new Scanner(System.in);
		int contraseña = 0;
		int usuario = sc.nextInt();;
		int intentos = 3;
		int acierto;
		
		
		while ((contraseña != usuario) && (intentos < 3)) {
			intentos --;
			
			if (contraseña>usuario){
				System.out.println("Vuelvelo a intentar, te quedan dos intentos.");
			
			}
			else if (contraseña<usuario) {
				System.out.println("Vuelvelo a intentar. ");
			}
			
				System.out.println("Te quedan: " + intentos);
			
				
			
			
            if (intentos == 0){
            	System.out.println("Ya no te quedan intentos, la contraseña es: " + contraseña);
				
            	
            }
            acierto = sc.nextInt();
            if (acierto == usuario){
            	System.out.println("Contraseña correcta.");
            	
            }
    }
    
    
     
    
    
    
    sc.close();
	}

}
