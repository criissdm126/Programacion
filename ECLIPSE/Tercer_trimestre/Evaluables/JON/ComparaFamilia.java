package JON;
//PARA VER LOS COMENTARIOS BAJE ABAJO DE TODO EL CODIGO, GRACIAS.
//1.
import java.util.Comparator;


//2.
public class ComparaFamilia implements Comparator<Familia> {

	public static void main(String[] args) {
	}
	
	@Override
//3.
	public int compare(Familia o1, Familia o2) {
		if (o1==null&&o2==null) {return 0;}
		else if (o1==null) {return 1;}
		else if (o1==null) {return -1;}
		else {return o1.getnac().compareTo(o2.getnac());}
	}
}
/*1. Iniciamos el comparator importando el java.util.Comparator para que no nos devuelva una excepción.
 *
 *2. Creamos la clase ComparaFamilia que implementa el Comparator de la clase Socio.
 *
 *3. Creamos la funcion compare para comparar dos objetos y en este caso será el atributo de Ffnacimiento
 *  
 *  de la clase Familia y añadimos else if por si alguna posicion sea null.Todo esto servirá para comparar
 *  
 *  y ordenar todos los clientes según su atributo(ffnacimiento).
 */

