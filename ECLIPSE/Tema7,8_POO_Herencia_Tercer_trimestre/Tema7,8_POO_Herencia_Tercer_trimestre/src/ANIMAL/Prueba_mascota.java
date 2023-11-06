package ANIMAL;

public class Prueba_mascota {

	public static void main(String[] args) {
		
		
		System.out.println();
		Gato miGato = new Gato("Isidoro",1);
		System.out.println(miGato);
		miGato.hazRuido();
		miGato.come("pescado");
		System.out.println();
		Perro miPerro = new Perro("Tobi",1);
		System.out.println(miPerro);
		miPerro.hazRuido();
		miPerro.come("pescado");
		miPerro.come("carne");
		System.out.println();
		Mascota garfield = new Gato("Gardfiel", 2);
		System.out.println(garfield);
		garfield.come("carne");

	}

}
