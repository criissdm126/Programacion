package ANIMAL;



public class Gato extends animal implements Mascota {
	
	//GATO EQUALS = MISMO NOMBRE
			//array de gatos (3 gatos)
			//¿Cuántos gatos se llaman igual en el array?
			//cuantas parejas de gatos se llaman igual en el array
		
	private int codigo;
	
	public Gato(String nombre, int c) {
		super(nombre);
		this.codigo = c;
	}
	
	@Override
	public int getCodigo() {
		return this.codigo;
	}
	
	public void hazRuido() {
		this.maulla();
		this.ronronea();
		}
	
	//el gato maulla
	public void maulla() {
	System.out.println("Miauuuu");
	}
	//el gato ronronea
	public void ronronea() {
	System.out.println("mrrrrrr");
	}
	//el gato come
	@Override
	public void come(String comida) {
	if (comida.equals("pescado")) {
	super.come();
	System.out.println("Que rico el pescado!, gracias");
	} else {
	System.out.println("Lo siento, solo como pescado");
	}
	}
	public String toString() {
	return "Gato mascota" + "- Nombre:"+super.getNombre()+
	"- Código:"+getCodigo();
	}

	

}
