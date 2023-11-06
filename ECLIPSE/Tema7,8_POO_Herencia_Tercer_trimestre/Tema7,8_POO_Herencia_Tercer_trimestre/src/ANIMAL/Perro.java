package ANIMAL;

public class Perro extends animal implements Mascota{
	
	private int codigo;
	public Perro (String nombre, int c) {
	super(nombre);
	this.codigo = c;
	}
	@Override
	public int getCodigo() { return this.codigo; }
	@Override//el perro emite sonido
	public void hazRuido() {
	this.ladra();
	}
	//el perro ladra
	public void ladra() {
	System.out.println("Guau guau!");
	}
	@Override //el perro come
	public void come(String comida) {
	if (comida.equals("pescado")) {
	System.out.println("Pescado noooooo!");
	} else {
	super.come();
	System.out.println("comida rica!");
	}
	}
	public String toString() {
	return "Perro mascota" + "- Nombre:"+super.getNombre()+
	"-Código:"+getCodigo();
	}

}
