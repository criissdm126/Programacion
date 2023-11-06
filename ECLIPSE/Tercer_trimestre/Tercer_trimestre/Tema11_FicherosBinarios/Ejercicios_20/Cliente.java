package Ejercicios_20;

public class Cliente {
	
	//ATRIBUTOS
	int id;
	String nombre;
	int telefono;
	
	//CONSTRUCTOR
	public Cliente(int id, String nombre, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

     //GETTER Y SETTER
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
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}

/*Implementa una aplicación que permita guardar y recuperar los datos de los clientes de una empresa.
 * Para ello, define la clase Cliente, que tendrá los siguientes atributos:
 * id (identificador cliente)
 * nombre 
 * telefono.
 * 
 * Los objetos Cliente se insertarán en una tabala.
 * Para realizar las distintas operaciones, la aplicación tendrá el siguiente menú:
 * 1. Añadir nuevo cliente.
 * 2. Modificar datos.
 * 3. Dar de baja cliente.
 * 4. Listar los clientes.
 * La información se guardará en un fichero binario, que se cargará en la memoria al iniciar la aplicación y se grabará en disco, actualizada, al terminar.
 */