package JON;
//PARA VER LOS COMENTARIOS BAJE ABAJO DE TODO EL CODIGO, GRACIAS.
//1.
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Socio implements Serializable {

	private int num_Socio;
	private String nombre;
	private LocalDate fecha_Nac; 				//Atributo LocalDate para poder coger el dia, mes y año agrupado en entero
	private LocalDate fecha_Alta;            	//Atributo LocalDate para poder coger el dia, mes y año agrupado en entero
	private int telefono;
	private String direccion;

	private Familia[] familiar;

	public Socio(int num_socio, String nombre, LocalDate fecha_Nac, LocalDate fecha_Alta, int telefono, String direccion) {
		this.num_Socio = num_socio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fecha_Nac = fecha_Nac;
		this.fecha_Alta= fecha_Alta;
	}
	public Socio(int num_socio, String nombre, LocalDate fecha_Nac, LocalDate fecha_Alta, int telefono, String direccion,Familia[] familiar) {
		super();
		this.num_Socio = num_socio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fecha_Nac = fecha_Nac;
		this.fecha_Alta= fecha_Alta;
		this.familiar=familiar;
	}



	public int getNum_Socio() {
		return num_Socio;
	}
	public void setNum_Socio(int num_Socio) {
		this.num_Socio = num_Socio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_Nac() {
		return fecha_Nac;
	}
	public void setFecha_Nac(LocalDate fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
	}
	public LocalDate getFecha_Alta() {
		return fecha_Alta;
	}
	public void setFecha_Alta(LocalDate fecha_Alta) {
		this.fecha_Alta = fecha_Alta;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Familia[] getFamiliar() {
		return familiar;
	}
	public void setFamiliar(Familia[] familiar) {
		this.familiar = familiar;
	}
	@Override
	public String toString() {
		
			return "El cliente tiene como numero de socio: " + num_Socio + " \tNombre: " + nombre 
					+ " \tFecha de nacimiento: " + fecha_Nac + " \tFecha de alta"+ 
					fecha_Alta + " \tTelefono: " + telefono + " \tDireccion:" + direccion
					+ " \nFamiliar: "+ Arrays.toString(familiar) + "\n";}
	}

