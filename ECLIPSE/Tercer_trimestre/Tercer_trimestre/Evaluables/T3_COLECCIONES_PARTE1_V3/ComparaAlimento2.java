package T3_COLECCIONES_PARTE1_V3;

import java.util.Comparator;

public class ComparaAlimento2 implements Comparator <Alimento> {

	@Override
	public int compare(Alimento o1, Alimento o2) {
		if (o1.getCalorias() != o2.getCalorias()) {
			return o1.getCalorias() - o2.getCalorias();
		}
		else {
			return o2.getTipo().compareTo(o1.getTipo());
		}
	}
}
