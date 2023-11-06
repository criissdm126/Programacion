package repetecion;

public class AguaMineral extends Bebida {
   
	
	private String origen;

	public AguaMineral(int id, double litros, double precio, String marca, String origen) {
	    super(id, litros, precio, marca);
	    this.origen = origen;
	}

	public String getOrigen() {
	    return origen;
	}

	@Override
	public String getInformacion() {
	    return "Agua mineral - " + getMarca() + " - " + getLitros() + "L - $" + getPrecio() + " - Origen: " + origen;
	}
}
