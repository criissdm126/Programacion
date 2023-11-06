package Persona;

import java.util.Comparator;

public class ComparaEmailyEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente a, Cliente b) {
		
		//comparar por eedad y si son iguales por email
		
		int resultado = a.getEdad() - b.getEdad();
		
		if (resultado==0) {
			resultado = a.getEmail().compareTo(b.getEmail());
		}
		
			return resultado;
	}

}
