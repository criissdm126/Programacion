package Ficheros;

import java.util.Comparator;


public class ComparaPorNombre implements Comparator<Socio> {

	
	@Override
	public int compare(Socio primero, Socio segundo) {

		if (primero == null && segundo == null) {
			return 0;
		} else if (primero == null) {
			return 1;
		} else if (segundo == null) {
			return -1;
		} else {
			return primero.getNombre().compareToIgnoreCase(segundo.getNombre());
		}
	}
}