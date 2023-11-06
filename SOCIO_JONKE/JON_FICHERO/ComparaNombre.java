package JON_FICHERO;
//PARA VER LOS COMENTARIOS BAJE ABAJO DE TODO EL CODIGO, GRACIAS.
//1.
import java.util.Comparator;
//2.
public class ComparaNombre implements Comparator<Socio> {

	public static void main(String[] args) {
	}
	@Override
//3.
	public int compare(Socio o1, Socio o2) {
		
		if (o1==null) {return 1;}
		else if (o2==null) {return -1;}
		else if (o1==null&&o2==null) {return 0;}
		else {return o1.getNombre().compareToIgnoreCase(o2.getNombre());}
	}
}
/*1. Iniciamos el comparator importando el java.util.Comparator para que no nos devuelva una excepción.
 *
 *2. Creamos la clase ComparaFamilia que implementa el Comparator de la clase Socio.
 *
 *3. Creamos la funcion compare para comparar dos objetos y en este caso será el atributo de nombre
 *  de la clase Socio y añadimos else if por si alguna posicion sea null.Todo esto servirá para comparar
 *  y ordenar todos los clientes según su atributo(nombre).
 */