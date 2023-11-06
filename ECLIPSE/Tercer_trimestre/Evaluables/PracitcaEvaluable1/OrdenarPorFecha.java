package PracitcaEvaluable1;

import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<Socio> {

	@Override
	public int compare(Socio primero, Socio segundo) {
		// Añado varios if y else if en caso de que haya algun null en el array (Cosa que va a pasar por que se dara de baja a varios socios seguro)
		if (primero == null && segundo == null) {
			return 0;
		} else if (primero == null) {
			return 1;
		} else if (segundo == null) {
			return -1;
		} else {
			return primero.getFechaAlta().compareTo(segundo.getFechaAlta());
		}
	}
}