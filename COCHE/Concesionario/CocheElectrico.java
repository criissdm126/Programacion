package Concesionario;

public class CocheElectrico extends Coche {
	
	//ATRIBUTO
	private Bateria bateria;
	
	
	//CONSTRUCTOR PARÁMETROS
	CocheElectrico(String marca, String modelo, Accesorio[] accesorios, Bateria bateria) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.bateria = bateria;
	}
	
	//GETTER Y SETTER
	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
}
