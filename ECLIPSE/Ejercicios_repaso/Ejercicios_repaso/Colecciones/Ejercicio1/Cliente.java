package Ejercicio1;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private String email;
	private ArrayList<String> telefonos;

	
	// CONSTRUCTOR
	public Cliente(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.telefonos = new ArrayList<>();
	}
	
	
	// GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<String> getTelefonos() {
        return telefonos;
    }
    
	// AÑADE EL TELEFONO AL ARRAYLIST EN CASO DE QUE NO ESTÉ INTRODUCIDO
    public void addTelefono(String telefono) {
        if (!telefonos.contains(telefono)) {
            telefonos.add(telefono);
        }
    }
    
    // SI PASAMOS UN NUMERO QUE YA ESTA NOS LO DEVUELVE
    // EN CASO DE QUE NO EXISTA, DEVUELVE NULL
    public String getTelefono(int indice) {
        if (indice >= 0 && indice < telefonos.size()) {
            return telefonos.get(indice);
        } else {
            return "";
        }
    }
    
    
    // BUSCA EN EL ARRAY 
    public ArrayList<String> buscarTelefono(String cadena) {
        ArrayList<String> telefonosEncontrados = new ArrayList<>();
        for (String telefono : telefonos) {
            if (telefono.contains(cadena)) {
                telefonosEncontrados.add(telefono);
            }
        }
        return telefonosEncontrados;
    }
}

