package Bucles_anidados;

public class CuentaKilometros {

    public static void main(String[] args) {
       
    	int kilometros = 0;
        
        while (kilometros < 100000) {
            kilometros++;
            
            String kilometrosStr = String.valueOf(kilometros); // Convertir el número de kilómetros a una cadena
            String nuevoKilometrosStr = kilometrosStr.replace("3", "E"); // Reemplazar el dígito 3 por "E"
            
            System.out.println(nuevoKilometrosStr);
            
            if (kilometrosStr.length() >= 5) {
                break; // Salir del bucle si alcanza o supera los 5 dígitos
            }
        }
    }
}







// Cuenta kilómetros: Hacer un cuenta kilómetros de 5 dígitos, donde si aparece  un 3 mostrará una E