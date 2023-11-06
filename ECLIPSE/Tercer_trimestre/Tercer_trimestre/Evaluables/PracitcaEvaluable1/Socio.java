package PracitcaEvaluable1;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Socio implements Serializable {
	/**
	 * Version para el serializable que necesito para poder castear
	 */
	private static final long serialVersionUID = 1L;
	private static int ultimoNumeroSocio = 1;
	private int numeroSocio;
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaAlta;
	private String telefono;
	private String correoElectronico;
	private Familiar[] familia;

	// Constructor
	public Socio(String nombre, String fnacimiento, String telefono, String correoElectronico) {
		// Al añadir ultimoNumeroSocio++ puedo ir creando los socios y autoincrementando el numero de socio
		this.numeroSocio = Socio.ultimoNumeroSocio++;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		// Creo formato para poder pasar la fecha pasada por parametro de String en Localdate y asi visualizarla asi dd/MM/yyyy
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fnacimiento, f);
		this.fechaAlta = LocalDate.now();

	}

	// getters y setters

	public Familiar[] getFamilia() {
		return familia;
	}

	public void setFamilia(Familiar[] familia) {
		this.familia = familia;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public static int getUltimoNumeroSocio() {
		return ultimoNumeroSocio;
	}

	public static void setUltimoNumeroSocio(int ultimoNumeroSocio) {
		Socio.ultimoNumeroSocio = ultimoNumeroSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fnacimiento) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fnacimiento, f);
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String falta) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAlta = LocalDate.parse(falta, f);
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Si un socio no tiene familiares
		if (this.familia == null) {
			return "Socio NºSocio: " + numeroSocio + " , Nombre: " + nombre + " , F.nacimiento: " + f.format(fechaNacimiento) + " , F.Alta="
					+ f.format(fechaAlta) + " , Tlf: " + telefono + " , Correo Electronico:" + correoElectronico + " \nFamiliar: Sin familiares";
		}
		// Si un socio tiene familiares
		else {
			return "Socio NºSocio: " + numeroSocio + "   Nombre: " + nombre + "   F.nacimiento: " + f.format(fechaNacimiento) + "   F.Alta: "
					+ f.format(fechaAlta) + "   Tlf: " + telefono + "   Correo Electronico:" + correoElectronico + " \nFamiliar: "
					+ Arrays.toString(familia) + "\n";
		}

	}

	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
}