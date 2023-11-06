package Ficheros;
//PARA VER LOS COMENTARIOS BAJE ABAJO DE TODO EL CODIGO, GRACIAS.

//1.
import java.util.Comparator;
//2.
public class ComparaAntiguedad implements Comparator<Socio>{

	public static void main(String[] args) {
	}

	@Override
//3.	
	public int compare(Socio o1, Socio o2) {
		if (o1== null &&o2==null) {return 0;}
		else if (o1==null) {return 1;}
		else if (o2==null) {return -1;}
		else {return o1.getFecha_Alta().compareTo(o2.getFecha_Alta());}
	}



}
/*1. Iniciamos el comparator importando el java.util.Comparator para que no nos devuelva una excepción.
 *
 *2. Creamos la clase ComparaAntiguedad que implementa el Comparator de la clase Socio.
 *
 *3. Creamos la funcion compare para comparar dos objetos y en este caso será el atributo de Fecha_Alta
 *  de la clase Socio  y añadimos else if por si alguna posicion sea null-->que ocurrirá cuando utilicemos el  
 *  metodo de dar de baja a los clientes.Todo esto servirá para comparar y ordenar todos los clientes según
 *  su atributo(antiguedad o fecha_alta).
 */