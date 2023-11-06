
public class Socio {
	private static int contadorCodigos = 1;
	private int numSocio,telefono, antigüedad;
	private String nombre, nacimiento, alta, correo;
	
	Socio (String nombre, String correo, String nacimiento, int telefono){
		this.nombre = nombre;
		this.correo = correo;
		this.nacimiento = nacimiento;
		this.telefono = telefono;
		this.numSocio = contadorCodigos;
		this.alta = null;
		this.antigüedad = 0;
		contadorCodigos += 1;
	}

	@Override
	public String toString() {
		return "Socio [numSocio=" + numSocio + ", telefono=" + telefono + ", antigüedad=" + antigüedad + ", nombre="
				+ nombre + ", nacimiento=" + nacimiento + ", alta=" + alta + ", correo=" + correo + "]";
	}

	public int getNumSocio() {
		return numSocio;
	}
	
	public int getAntigüedad() {
		return antigüedad;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public String getAlta() {
		return alta;
	}

	public String getCorreo() {
		return correo;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void setAlta(String alta) {
		this.alta = alta;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}
}
