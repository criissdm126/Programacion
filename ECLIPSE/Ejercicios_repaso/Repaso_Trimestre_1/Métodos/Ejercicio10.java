package Métodos;

public class Ejercicio10 {

    public static void main(String[] args) {
        String fechaNacimiento = "16-08-1973";
        int numeroSuerte = calcularNumeroSuerte(fechaNacimiento);
        System.out.println("El número de la suerte es: " + numeroSuerte);
    }

    public static int calcularNumeroSuerte(String fechaNacimiento) {
        
    	String[] partesFecha = fechaNacimiento.split("-");
        int sumaDigitos = 0;

        for (String parte : partesFecha) {
            
        	int numero = Integer.parseInt(parte);
           
        	while (numero > 0) {
                
        		sumaDigitos += numero % 10;
                numero /= 10;
            }
        }

        while (sumaDigitos >= 10) {
           
        	int nuevoSumaDigitos = 0;
            
        	while (sumaDigitos > 0) {
                
        		nuevoSumaDigitos += sumaDigitos % 10;
                sumaDigitos /= 10;
            }
            
        	sumaDigitos = nuevoSumaDigitos;
        }

        return sumaDigitos;
    }
}


/* Realizar un programa que calcule el número de la suerte de cualquier persona
El número de la suerte se consigue reduciendo la fecha de nacimiento a un 
número de un solo dígito. 
Por ejemplo, si la fecha de nacimiento de una persona es 16-08-1973 -> 
16+8+1973=1997-> 1+9+9+7=26->2+6=8. El número de la suerte de esa persona 
sería el 8.
*/