package Ficheros;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Socio implements Serializable {

	//ATRIBUTOS: nº socio, nombre, fecha nacimiento, fecha alta, telefono, direccion de correo electrónico
	private static int ultimoNumeroSocio = 0; // Contador para asignar el número de socio consecutivamente
	private int numeroSocio; //se adjudica consecutivamente según el orden de alta en el club
	private String nombre;
	private int fechaNacimiento;
	private LocalDate fechaAlta;
	private String telefono;
	private String email;
	private Familiar[] familia;
	private static final long serialVersionUID = 1L;
    
    // Lista estática de socios
	private static final String ARCHIVO = "Socio.bin";
	private static Socio[] socios = new Socio[0];

	

    
	// Constructor con parámetros
    public Socio(String nombre, String fnacimiento, String telefono, String correoElectronico, int FechaNac) {
		this.numeroSocio = Socio.ultimoNumeroSocio++;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = correoElectronico;
		this.fechaNacimiento = FechaNac;
		//DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//this.fechaNacimiento = LocalDate.parse(fnacimiento, f);
		this.fechaAlta = LocalDate.now();
    }
    
    // Getters y setters
    public int getNumeroSocio() {
		return numeroSocio;
	}
    
    public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
    
    public String getNombre() {
		return nombre;
	}
    
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    public int getFechaNacimiento() {
		return fechaNacimiento;
	}
    
    public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
    
    public LocalDate getFechaAlta() {
		return fechaAlta;
	}
    
    public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
    
    public String getTelefono() {
		return telefono;
	}
    
    public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    
    public String getEmail() {
		return email;
	}
    
    public void setEmail(String email) {
		this.email = email;
	}

	public static int getUltimoNumeroSocio() {
		return ultimoNumeroSocio;
	}

	public static void setUltimoNumeroSocio(int ultimoNumeroSocio) {
		Socio.ultimoNumeroSocio = ultimoNumeroSocio;
	}

	public Familiar[] getFamilia() {
		return familia;
	}

	public void setFamilia(Familiar[] familia) {
		this.familia = familia;
	}
 
    // Sobreescribimos el método toString para la información de un socio
	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Si un socio no tiene familiares
		if (this.familia == null) {
			return "Socio NºSocio: " + numeroSocio + " , Nombre: " + nombre + " , F.nacimiento: " + fechaNacimiento + " , F.Alta="
					+ f.format(fechaAlta) + " , Tlf: " + telefono + " , Correo Electronico:" + email + " \nFamiliar: Sin familiares";
		}
		// Si un socio tiene familiares
		else {
			return "Socio NºSocio: " + numeroSocio + "   Nombre: " + nombre + "   F.nacimiento: " + fechaNacimiento + "   F.Alta: "
					+ f.format(fechaAlta) + "   Tlf: " + telefono + "   Correo Electronico:" + email + " \nFamiliar: "
					+ Arrays.toString(familia) + "\n";
		}
	}
}
/*programa que gestione:
 *    altas
 *    bajas
 *    modificaciones de datos
 *    salvo el numero de socio, que es inalterable una vez asignado
 * Entre las funcionalidades de la aplicación, deberán incluirse un listado por orden alfabético de nombres y otro por antigüedad en el club.
 * Toda esta información se mantendrá en un archivo binario llamado Socio.bin
 */
