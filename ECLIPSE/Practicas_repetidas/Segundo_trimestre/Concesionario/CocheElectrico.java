package Concesionario;

import java.util.Arrays;

public class CocheElectrico extends Coche {
	
	private Bateria bateria;

	CocheElectrico(String marca, String modelo, Accesorio[] accesorios, Bateria bateria) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.bateria = bateria;
	}
	
	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	
    @Override
    public String toString() {
        return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Accesorios: " +
               Arrays.toString(getAccesorios()) + ", Potencia: " + bateria.getPotencia() +
               ", Consumo: " + bateria.getConsumo() + ", Precio: " + precioElectrico();
    }
}
