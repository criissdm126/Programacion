package Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(325, "Paco","A", "zamora@gmail.com", 26 );
		Cliente c2 = new Cliente(355, "Pepe","A", "pepe@gmail.com", 26 );
		Cliente c3 = new Cliente(39, "Maria","A", "pepe@gmail.com", 15 );
		Cliente c4 = new Cliente(388, "Ana","A", "ana@gmail.com", 45 );
		Cliente c5 = new Cliente(388, "Carmen","A", "carmen@gmail.com", 35 );
		
		
		ArrayList<Cliente> listaClientes = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));
		

		//ComparaEdad criterioEdad = new ComparaEdad();
		

		HashSet <Cliente> setCliente = new HashSet <>();
		setCliente.add(c1);
		setCliente.add(c2);
		setCliente.add(c3);
		setCliente.add(c4);
		setCliente.add(c5);
		System.out.println("imprimo el set de cliente");
		
		for(Cliente var : setCliente) 
		System.out.println(var);
		System.out.println("FIN");
		
		
		Collections.sort(listaClientes, new ComparaEmailyEdad());
		
		



	}

}

/*if (c1.equals(c2)) {
System.out.println("Misma edad");
}
else {
System.out.println("Edad distinta");
}*/