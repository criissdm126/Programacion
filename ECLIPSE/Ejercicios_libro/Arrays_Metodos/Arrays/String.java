package Arrays;

import javax.swing.JOptionPane;

public class String {

	   public static void main(String[] args) {
	        
		   String[] colores = new String[4];

	        for (int i = 0; i < colores.length; i++) {
	            colores[i] = JOptionPane.showInputDialog("Introduce un color:");
	        }

	        System.out.println("Los colores introducidos son:");
	        for (String color : colores) {
	            System.out.println(color);
	        }
	    }
	}

/* Crear un array de String, con 4 colores que introduzca el usuario por teclado
 * y mostrar el contenido del array después por pantalla
 * (utilizar JOptionPane para introducir los valores)
 */
