package Tabla_alumnos;

import java.util.Date;

public class Alumno {
	
	//Constante para fijar tamaño máximo en el nombre de alumnos TAM_NOMBRE = 30;
	//atributos de alumno id de tipo numérico, nombre, fecha Nacimiento, notaMedia y curso que es String.
	
	
	// ATRIBUTOS
    public static final int TAM_NOMBRE = 30;
    private int id;
    private String nombre;
    private String fNacimiento;
    private double notaMedia;
    private String curso;
    
    
    // CONSTRUCTORES
    public Alumno(int id) {
        this.id = id;
    }

    public Alumno(int id, String nombre, String fNacimiento, double notaMedia, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }
    
    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // MÉTODO TO STRING
    public String toString() {
        return curso + "-" + nombre + "(" + notaMedia + ")";
    }
}
