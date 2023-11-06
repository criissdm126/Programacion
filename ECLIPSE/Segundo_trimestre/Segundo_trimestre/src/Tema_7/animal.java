package Tema_7;

public class animal {
	
	//TEMA 7

		// -Tipo
		// -nombre
		//metodos: duerme (), come()
		//gettery y soltery
		
		private String tipo;
		public String nombre;
		
		public animal(String ti, String no) {
			this.tipo = ti;
			this.nombre= no;
		}
		
		public String getTipo() {
			return tipo;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public 	String setNombre() {
			return nombre;
		}
		
		public void  come() {
			System.out.println("ñam ñam");
		}
		
		public void duerme() {
			System.out.println("Zzzzzz");
		}
		
		public String toString() {
			return "Animal de tipo " + tipo + " y con nombre " + nombre;
		}
	}


