package EXAMEN_2;


public class Empleado {
	
	private double sueldo;
	private String nombre;
	private int [] telefonos = new int [2];
	
	private static int numEmpleados;
	
	//constructores

	public Empleado(double sueldo, String nombre, int[] telefonos) {
		super();
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.telefonos = telefonos;
		numEmpleados ++;
	}
	
	//getter y setter

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
		numEmpleados ++;
	}
	public Empleado() {
		numEmpleados ++;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(int[] telefonos) {
		this.telefonos = telefonos;
	}

	public static int getNumEmpleados() {
		return numEmpleados;
	}

	public static void setNumEmpleados(int numEmpleados) {
		Empleado.numEmpleados = numEmpleados;
	}
	
	//TOSTRING

	@Override
	public String toString() {
		return "_____________________________________\n Nombre"
	+ nombre + "\tSueldo" + sueldo + "\n "+ 
	"telefono 1" + telefonos[0] + "\ttelefono 2: " + telefonos [1] + "\n" +
	"_______________________";
				
	}
	
	
	

}
