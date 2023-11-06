package evaluables;

public class Persona {
	
	public String nombre;
	public  String codigo;
	private int numPrestamos;

	public Persona(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.numPrestamos = 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumPrestamos() {
		return numPrestamos;
	}
	
	public void setNumPrestamos(int numPrestamos) {
		this.numPrestamos = numPrestamos;
	}
}