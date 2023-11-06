package BUCLESEVALUABLES;

import java.util.*;

public class CONTRASEÑA {

	public static void main(String[] args) {
		
		System.out.println("La contraseña contiene, una mayuscula (es la primera letra), y tres numeros.");
				Scanner sc = new Scanner(System.in);
				String contraseña;
				String usuario;
				contraseña = "Contraseña123";
				
				boolean correcto = false;
				
				for(int i=0; i<3 && !correcto;i++) {
					if (i==0){
						System.out.println("Tiene 3 intentos.");
						System.out.println("Introduzca la contraseña: ");
				}
					else if(i==1){
						System.out.println("Te quedan dos intentos. ");
					}
					else if(i==2){
						System.out.println("Te queda un intento. ");
				}
					usuario = sc.nextLine();
				 
					if (usuario.equals(contraseña)){
						correcto=true;
				 }
				 }
				 
				
				if (correcto){
					System.out.println("La contraseña introducida es correcta.");
				 }else{
					 System.out.println("Ya no te quedan mas intentos.");
					 System.out.println("La contraseña era: " + contraseña);
				 }
				 
				 
				 
				 sc.close();


	}

}
