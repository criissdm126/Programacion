package Ficheros;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Socio> {
	
	
	// Añado lo distintos posibles casos de nulo para que no me pete
	
    @Override
    public int compare(Socio primero, Socio segundo) {
        
        if (primero == null && segundo == null) {
            return 0;
        } else if (primero == null) {
            return -1;
        } else if (segundo == null) {
            return 1;
        } else {
            return primero.getNombre().compareToIgnoreCase(segundo.getNombre()); // Compara en orden ascendente
        }
    }
}

















/*
package Ficheros;

public class OrdenarPorNombre implements Comparable<Socio> {
	
	// Añado los distintos casos posibles de nulo para evitar errores
	
	@Override
	public int compareTo(Socio otro) {
		if (this == null && otro == null) {
			return 0;
		}
		else if (this == null) {
			return 1;
		}
		else if (otro == null) { // Cambiado a -1 para manejar el caso de un objeto nulo
			return -1; 
		}
		else {
			return this.getNombre().compareToIgnoreCase(otro.getNombre());
		}
	}
}
*/