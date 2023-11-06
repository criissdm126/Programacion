package Ejercicio_5;

public class SmartPhone extends SmartDevice {
	
    private int capacidadAlmacenamiento;
    private String modelo;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String sistemaOperativo, int capacidadAlmacenamiento) {
        super(marca, modelo, sistemaOperativo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    // Getter y setter

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
    
}
