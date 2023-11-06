package Tema_7;

public class ave extends animal  {
	
	//herencia 
		public ave() {
			super();
		}
		
		public ave (String color) {
			this.color = color;
		}
		
		private String color;
		
		public String toString()
		{
			return "este es el toString de ave " + this.color;
		}
		
		public String getColor() {
			return color;
		}
		public void setcolor(String color) {
			this.color = color;
		}
		
	}


