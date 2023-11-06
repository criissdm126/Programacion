package Métodos;

public class Ejercicio4 {

    public static void main(String[] args) {
        
    	String texto = "Hola Mundo";
        char caracterBorde = '*';
       
        borde(texto, caracterBorde);
    }

    public static void borde(String texto, char caracterBorde) {
       
    	int longitud = texto.length() + 4; // Longitud del texto + 2 asteriscos a cada lado + 2 espacios de separación
        
    	String borde = generarLineaCaracter(caracterBorde, longitud);

        System.out.println(borde);
        System.out.println("* " + texto + " *");
        System.out.println(borde);
    }

    public static String generarLineaCaracter(char caracter, int longitud) {
        
    	StringBuilder linea = new StringBuilder();
        
    	for (int i = 0; i < longitud; i++) {
            
    		linea.append(caracter);
        }
        
    	return linea.toString();
    }
}


/*  Método borde que reciba como parámetro un String, y que muestre por  pantalla la pantalla bordeada con *, como si fuera un borde de un cuadro.
 * Modificar el método para que se pueda elegir también el carácter que se  pintará en el borde.
 */