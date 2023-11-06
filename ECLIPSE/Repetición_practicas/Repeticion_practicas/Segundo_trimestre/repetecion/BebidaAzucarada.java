package repetecion;

public class BebidaAzucarada extends Bebida {
   
	
	private double porcentajeAzucar;
	private boolean promocion;

	public BebidaAzucarada(int id, double litros, double precio, String marca, double porcentajeAzucar, boolean promocion) {
	    super(id, litros, precio, marca);
	    this.porcentajeAzucar = porcentajeAzucar;
	    this.promocion = promocion;
	    if (promocion) {
	        this.setPrecio(getPrecio() * 0.9);
	    }
	}

	public double getPorcentajeAzucar() {
	    return porcentajeAzucar;
	}

	public boolean tienePromocion() {
	    return promocion;
	}

	@Override
	public String getInformacion() {
	    String informacion = "Bebida azucarada - " + getMarca() + " - " + getLitros() + "L - $" + getPrecio() + " - Porcentaje de azúcar: " + porcentajeAzucar;
	    if (promocion) {
	        informacion += " - PROMOCIÓN";
	    }
	    return informacion;
	}
}
