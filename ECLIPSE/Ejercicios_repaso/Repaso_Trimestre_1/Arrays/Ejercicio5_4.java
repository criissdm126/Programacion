package Arrays;

public class Ejercicio5_4 {

    public static void main(String[] args) {
        
    	int[] array = {5, 2, 9, 4, 7, 1, 6};
        
    	int clave = 7;
       
    	int posicion = buscar(array, clave);
        
    	if (posicion != -1) {
            
    		System.out.println("La clave se encontro en la posicion: " + posicion);
        }
    	
    	else {
            
    		System.out.println("La clave no se encontro en el array.");
        }
    }

    public static int buscar(int[] array, int clave) {
        
    	for (int i = 0; i < array.length; i++) {
            
    		if (array[i] == clave) {
                
    			return i;
            }
        }
        
    	return -1;
    }
}


/*  implentar método buscar(int t[], int clave) que busca de  forma secuencial el campo clave.
 * Si lo encuentra devuelve la posición, si no lo encuentra devuelve -1"
 */