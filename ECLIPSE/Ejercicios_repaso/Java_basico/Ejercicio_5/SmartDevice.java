package Ejercicio_5;

public class SmartDevice {
	
    private String marca;
    private String sistemaOperativo;
    private String procesador;
    
    // CONSTRUCTOR CON PARÁMETROS
	public SmartDevice(String marca, String sistemaOperativo, String procesador) {
		this.marca = marca;
		this.sistemaOperativo = sistemaOperativo;
		this.procesador = procesador;
	}
    
	// CONSTRUCTO SIN PARÁMETROS
    public SmartDevice() {
    }
    
    // GETTER Y SETTER
    public String getmarca() {
    	return marca;
    }
    
    public void setmarca(String marca) {
    	this.marca = marca;
    }

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
    

}

// Agregaréis atributos tal cual tendrían esos objetos en la realidad.

// Crear constructor vacío y con todos los parámetros para cada clase.