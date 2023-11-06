package Ficheros_2;

import java.util.Comparator;

public  class FamiliaresPorEdad implements Comparator<Familiar> {
	// Añado los distintos casos que se pueden generar en caso de que tenga algun null para que no pete
	@Override
	public int compare(Familiar primero, Familiar segundo) {
		if (primero == null && segundo == null) {
			return 0;
		} else if (primero == null) {
			return 1;
		} else if (segundo == null) {
			return -1;
		} else {
			return primero.getFfnacimiento().compareTo(segundo.getFfnacimiento());
		}
	}

}