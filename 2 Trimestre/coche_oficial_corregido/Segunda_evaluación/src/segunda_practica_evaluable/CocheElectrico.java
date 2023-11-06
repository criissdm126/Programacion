package segunda_practica_evaluable;

//import segunda_practica_evaluable.Coche.Accesorio;

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



   /* @Override
    public void arrancar() {
        System.out.println("El coche electrico " + getMarca() + " " + getModelo() + " ha arrancado silenciosamente.");
    }

    @Override
    public void detenerse() {
        System.out.println("El coche electrico " + getMarca() + " " + getModelo() + " se ha detenido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche electrico " + getMarca() + " " + getModelo() + " ha acelerado de forma instantanea.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche electrico " + getMarca() + " " + getModelo() + " ha frenado.");
    }

    @Override
    public String toString() {
        return "Coche electrico " + super.toString();
    }*/
}