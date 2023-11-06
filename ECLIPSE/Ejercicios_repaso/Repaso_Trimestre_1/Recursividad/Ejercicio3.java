package Recursividad;

public class Ejercicio3 {

    public static void main(String[] args) {
       
    	int numero = 12345; // Número para contar las cifras
        
    	int cifras = contarCifras(numero);
        
        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
    }

    public static int contarCifras(int numero) {
        
    	if (numero < 10) {
           
    		return 1;
        }
    	
    	else {
            
    		return 1 + contarCifras(numero / 10);
        }
    }
}


//Cifras, método que dice cuantas cifras tienen un nº