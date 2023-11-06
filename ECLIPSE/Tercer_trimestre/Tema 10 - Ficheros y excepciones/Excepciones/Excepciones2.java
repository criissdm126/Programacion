package Excepciones;
public class Excepciones2 {
public static void main(String[] args) {
		
		Animal a = new Animal ();
		Perro b = new Perro ();
		// No se puede crear perro a partir de un Animal porque NO TODOS los animales son perros 
		//Perro  c = (Perro) a;
		
		Animal otro = new Perro();
		Perro c = (Perro) otro;
		//si s epuede crear un perro desde animal Perro c = (Perro) otro;
		
		c.raza = "Callejero";
		
		System.out.println(c.raza);
		
		
		Perro e = new Perro();
		Animal d =(Animal) e; //funciona porque todos los perros son animales (heredan de animal)
		
		d.tipo = "Carnivoro";
		System.out.println(d.tipo);

	}
}
	
	class Animal{
		
		public String tipo;
		private String nombre;
		
		public void dormir() {
			System.out.println("Duermo como un animal.");
		}
	}
	
	class Perro extends Animal {
		public String raza;
		
		public void comer() {
			System.out.println("Como lo que me eches.");
		}
	}

