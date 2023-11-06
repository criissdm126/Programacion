package Interfaces_2;

public class empleado implements Comparable {
	
	/*Ordenar el array de empleados de 3 formas
	 * id de empleado
	 * nombre
	 * por id y en segundo lugar por nombre, si dos coinciden alfabeticamente*/
	
	private int id_empleado;
	private String nombre;
	
	public empleado(int id_empleado, String nombre) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
	}

	//getter y setter
	public int getId_empleado() {
		return id_empleado;
	}
	
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
   //toString
	@Override
	public String toString() {
		return "empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + "]";
	}
	
	@Override
	public int compareTo(Object jueves) {
		
		empleado otro = (empleado) jueves;
		
		if(this.id_empleado == otro.id_empleado) {
			return nombre.compareTo(otro.nombre);
		}
		else if(this.id_empleado > otro.id_empleado) {
			return 1;
		}
		else {
			return -1;
		}
		//return this.id_empleado - otro.id_empleado;
		
			//return nombre.compareTo(otro.nombre);
	
	}

}
