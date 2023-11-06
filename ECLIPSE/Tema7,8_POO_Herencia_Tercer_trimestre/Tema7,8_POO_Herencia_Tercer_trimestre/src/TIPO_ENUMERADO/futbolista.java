package TIPO_ENUMERADO;

public class futbolista {
	
	private int dorsal;
	private String Nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;
	
	public futbolista() {
	}

	public futbolista(int dorsal, String nombre, Demarcacion demarcacion, Equipo equipo) {
		super();
		this.dorsal = dorsal;
		Nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}
	
	//getter y setter

	/**
	 * @return el dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal el dorsal a establecer
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return el demarcacion
	 */
	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	/**
	 * @param demarcacion el demarcacion a establecer
	 */
	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	/**
	 * @return el equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo el equipo a establecer
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	
	
	
	
	

}
