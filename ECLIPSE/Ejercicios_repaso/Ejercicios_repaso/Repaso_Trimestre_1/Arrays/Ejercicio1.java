package Arrays;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        
    	// Crear un array de String con tamaño 4
        String[] colores = new String[4];

        // Pedir al usuario que ingrese los colores utilizando JOptionPane
        for (int i = 0; i < colores.length; i++) {
            
        	String color = JOptionPane.showInputDialog("Ingrese el color #" + (i + 1));
            
        	colores[i] = color;
        }

        // Mostrar el contenido del array por pantalla
        System.out.println("Contenido del array de colores:");
        
        for (String color : colores) {
            
        	System.out.println(color);
        }
    }
}

/* Crear un array de String, con 4 colores que introduzca el usuario por teclado
 * y  mostrar el contenido del array después por pantalla
 * (utilizar JOptionPane par  introducir los valores)
 */