package segunda_practica_evaluable;

public class CocheElectrico extends Coche {
	
	public CocheElectrico(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
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
    }
}