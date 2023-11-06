package Colecciones_Instrumento;

import java.util.*;

public class Instrumento {

    /*
     * Desarrollar la clase Instrumento. Un instrumento se caracteriza por id, nombre, y clase.
     * Id es numérico y clase puede tener los valores viento, cuerda o percusión.
     * Cada instrumento tendrá un id distinto
     */

    int id;
    String nombre;
    String clase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    /*
     * Habrá dos constructores, uno con todos los parámetros, y otro sin parámetros que
     * asigne al instrumento el valor “sin clase” por defecto.
     */
    // CON PARÁMETROS
    public Instrumento(int id, String nombre, String clase) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.clase = clase;
    }

    // SIN PARÁMETROS
    public Instrumento() {
        super();
        this.clase = "sin clase";
    }

    /*
     * Utilizar el método compareTo para comparar los instrumentos por su clase y, en caso de ser la
     * misma clase, por su nombre
     */

    public int compareTo(Instrumento otro) {
        if (this.clase.compareTo(otro.clase) != 0) {
            return this.clase.compareTo(otro.clase);
        } else {
            return this.nombre.compareTo(otro.nombre);
        }
    }

    /*
     * Se deberá poder imprimir objetos de tipo instrumento, con el siguiente formato
     * nombre_instrumento (clase)
     */

    @Override
    public String toString() {
        return this.nombre + " (" + this.clase + ")";
    }
}


/*2) Clase Instrumento
 
 * • Crear un ArrayList de instrumentos, y ordenarlos por clase, y lo que tengan la misma
 * clase ordénalos por nombre
 * 
 * • Crear un HashSet de instrumentos que no inserte duplicados teniendo en cuenta el
 * nombre.
 * 
 * • Crear un TreeMap de instrumentos, que esté formado por parejas <codigo
 * alfanumérico, instrumento> y que se muestren ordenados por su código.
 * 
 * • Se deberá poder imprimir objetos de tipo instrumento, con el siguiente formato
 * nombre_instrumento (clase)
 * 
 * • Voluntario: mostrar el treemap de instrumentos ordenados por nombre
 */


