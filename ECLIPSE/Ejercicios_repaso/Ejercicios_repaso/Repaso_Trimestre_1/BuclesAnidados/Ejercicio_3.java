package BuclesAnidados;

public class Ejercicio_3 {

    public static void main(String[] args) {
       
    	for (int i = 0; i <= 99999; i++) {
            
    		String numero = String.format("%05d", i); // Formatear el número con 5 dígitos
            
    		String resultado = numero.replace("3", "E"); // Reemplazar el 3 por E
            
    		System.out.println(resultado);
        }
    }
}


/*
 *  Cuenta kilómetros: Hacer un cuenta kilómetros de 5 dígitos, donde si aparece  un 3 mostrará una E.
 */
