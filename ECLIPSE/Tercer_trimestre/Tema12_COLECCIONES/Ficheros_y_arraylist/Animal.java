package Ficheros_y_arraylist;

import java.io.*;

public class Animal implements Serializable {

    // private static final long serialVersionUID = 1L;
    private String codigo;
    private String tipo;
    private String nombre;
    private int edad;

    public Animal(String codigo, String tipo, String nombre, int edad) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	} 
    
    
}

/* codigo, tipo animal, nombre, edad
 * fichero Animal.csv, pasárlo  a un arraylist que se llame animales
 * y del arraylist  aun fichero binario, serializable, writeobject
 */
