package Métodos;

public class Ejercicio3 {

    public static void main(String[] args) {
        
    	String email = "example@example.com";
        boolean esCorrecto = check_email(email);
        
        System.out.println("El email es correcto: " + esCorrecto);
    }

    public static boolean check_email(String email) {
        
    	boolean contieneArroba = false;
        boolean contienePunto = false;

        for (int i = 0; i < email.length(); i++) {
            
        	char caracter = email.charAt(i);
            
        	if (caracter == '@') {
                
        		contieneArroba = true;
            }
        	
        	else if (caracter == '.') {
                
        		contienePunto = true;
            }
        }

        return contieneArroba && contienePunto;
    }
}


/* Método check_email que compruebe si un email pasado como parámetro es  correcto o no.
 * Devolverá true cuando contenga una @ y un .
 */