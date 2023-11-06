package Ficheros;

import java.util.Comparator;

import PracitcaEvaluable1.Familiar;

public class FamiliaEdad implements Comparator<Familiar> {
	
	
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