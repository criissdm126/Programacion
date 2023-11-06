package segunda_practica_evaluable;

public class CocheElectrico extends Coche {
	
	public CocheElectrico(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche eléctrico " + getMarca() + " " + getModelo() + " ha arrancado silenciosamente.");
    }

    @Override
    public void detenerse() {
        System.out.println("El coche eléctrico " + getMarca() + " " + getModelo() + " se ha detenido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche eléctrico " + getMarca() + " " + getModelo() + " ha acelerado de forma instantánea.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche eléctrico " + getMarca() + " " + getModelo() + " ha frenado suavemente gracias al freno regenerativo.");
    }

    @Override
    public String toString() {
        return "Coche eléctrico " + super.toString();
    }
}