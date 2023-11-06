package Tema_7;

public class tigre extends animal {
	
	//super hace referencia a animal, a la super clase, llama al superconstructor de la clase padre = animal
	
		private String raza;
		public tigre (String ti, String n, String raza) {
			super(ti, n);
		
		}
		
		public void come() {
			System.out.println("Estoy hambriento, soy un tigre");
		}
		
		public void come(String comida) {
			System.out.println(comida);
		}
		
		public String toString() {
			return "Tigre " + super.toString() + " con raza " + this.raza;
		}
		
		public tigre () {
			super("no se sabe", "no se sabe");
			raza = "sin especificar";
		}


}
