package HashMaps;

import java.util.HashMap;

public class Colegio {
	
    private HashMap<String, Integer> nacionalidades;

    public Colegio() {
        nacionalidades = new HashMap<>();
    }
    
	public void addAlumno(String nacionalidad) { // añade la nacionalidad d eun nuevo alumno
        
        nacionalidad = nacionalidad.toUpperCase();
        nacionalidades.put(nacionalidad, nacionalidades.getOrDefault(nacionalidad, 0) + 1);
	}
	
	public void showAll() { // Muestra las distintas nacionalidades y el número de alumnos que existen por nacionalidad.
        for (String key : nacionalidades.keySet()) {
            System.out.println(key + " - " + nacionalidades.get(key) + " alumno(s)");
        }
	}
	
	public void showNacionalidad(String nacionalidad) { // Muestra la nacionalidad y el número de alumnos de esa nacionalidad
        
        nacionalidad = nacionalidad.toUpperCase();
        int count = nacionalidades.getOrDefault(nacionalidad, 0);
        System.out.println(nacionalidad + " - " + count + " alumno(s)");
	}
	
	public void cuantos() { // Muestra cuántas nacionalidades diferentes existen en el colegio.
        int count = nacionalidades.size();
        System.out.println("Número de nacionalidades diferentes: " + count);
	}
	public void borra() { // Elimina los datos insertados.
        nacionalidades.clear();
        System.out.println("Datos eliminados");
	}
}
