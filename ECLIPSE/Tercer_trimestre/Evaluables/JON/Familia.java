package JON;
//PARA VER LOS COMENTARIOS BAJE ABAJO DE TODO EL CODIGO, GRACIAS.
//1.
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Familia implements Serializable {


	
	private String nombre;
	private LocalDate nac;

	public Familia( String nombre, LocalDate nac) {
		this.nombre = nombre;
		this.nac =nac;
	}

	//NOMBRE
	public String getNombre() {
		return nombre;
	}
	//NAC
	public LocalDate getnac() {
		return nac;
	}

	@Override
	public String toString() {
		
		return " Nombre: " + nombre + " \tFecha de Nacimiento: " + nac+ "-";
	}

}
