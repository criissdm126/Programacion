package Ficheros;


import java.util.*;

public class Familiar {
    
	//ATRIBUTOS: DNI, NOMBRE, FECHA NACIMIENTO
    private String dni;
    private String nombre;
    private int fechaNacimiento;
    
    
    //CONSTRUCTOR
    public Familiar(String dni, String nombre, int fechaNacimiento) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //GETTER Y SETTER
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
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
    
    // Método para listar los datos de socio incluyendo la lista de sus familiares ordenada por edad
    public static void ordenarPorEdad(Socio socio) {
    }
    
    @Override
    public String toString() {
        return "Familiar [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
}
