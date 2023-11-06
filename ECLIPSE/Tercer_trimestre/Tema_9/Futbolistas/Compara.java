package Futbolistas;

import java.util.*;

public class Compara implements Comparator {
	
	@Override
public int compare(Object o1, Object o2) {
		
		return ((Futbolista) o1).nombre.compareTo(((Futbolista)o2).nombre);
		
	}


}
//comparable = compare to
//comparator = compara