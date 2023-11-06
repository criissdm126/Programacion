package Simulacro;

	import java.util.HashMap;
	import java.util.Map;


public class Ejercicio_4 {

	    public static void main(String[] args) {
	        Map<String, Double> alturas = new HashMap<>();
	        alturas.put("Marta", 1.6);
	        alturas.put("Ana", 1.65);
	        alturas.put("Luis", 1.73);
	        alturas.put("Pedro", 1.71);
	        
	        // Imprimir la colección de alturas
	        for (Map.Entry<String, Double> entry : alturas.entrySet()) {
	            String nombre = entry.getKey();
	            double altura = entry.getValue();
	            System.out.println(nombre + " = " + altura);
	        }
	    }
}



// Escribe las sentencias correspondientes para generar una colección con los siguientes valores.
// {Marta = 1.6, Ana = 1.65, Luis=1.73, Pedro = 1.71}