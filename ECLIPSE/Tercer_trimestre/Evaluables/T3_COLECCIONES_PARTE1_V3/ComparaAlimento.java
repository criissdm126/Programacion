package T3_COLECCIONES_PARTE1_V3;

import java.util.Comparator;

public class ComparaAlimento implements Comparator <Alimento> {

	@Override
	 public int compare(Alimento o1, Alimento o2) {													//--
        if (o1.getCalorias() != o2.getCalorias()) {													//--
            return o2.getCalorias() - o1.getCalorias();												//--
        } else {																					//--
            return o1.getTipo().compareTo(o2.getTipo());											//--
        }																							//--
    }

}
