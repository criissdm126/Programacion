package Persona;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente primero, Cliente segundo) {
		
		return primero.getEdad() - segundo.getEdad();
		
		//0 = iguales
		//negativo si primero es menor
		//positivo cuando primero sea mayor
	}

}
