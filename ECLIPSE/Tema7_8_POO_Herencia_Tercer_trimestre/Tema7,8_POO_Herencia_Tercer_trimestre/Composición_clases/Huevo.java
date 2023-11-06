package Composición_clases;


public class Huevo {

	//array yema
	//equals de huevo comparando objetos directamente

	public class HUEVO {
		
		private Yema yema;
		private Clara clara;
		
		//constructor
		HUEVO(Yema y, Clara c){
			this.yema=y;
			this.clara=c;
		}
		
		//get yema
		public Yema getYema() {
			return this.yema;
		}
		
		//get clara
		public Clara getClara() {
			return this.clara;
		}
		
		//setter yema
		public void setYema(Yema y) {
			this.yema = y;
		}
		
		//setter clara
		public void setClara(Clara c) {
			this.clara=c;
		}
		
		//toString
		public String toString() {
			return "huevo con yema " + yema.getcolor() + " y clara con volumen " + clara.getvolumen();
			}
		
		//equals
		@Override
		public boolean equals(Object o) {
			Huevo otro = (Huevo) o;
			
			if (this.clara.getvolumen() == otro.clara.getvolumen() && this.yema.getcolor().equals(otro.yema.getcolor())) {
				return true;
			}
			else {
				return false;
			}
		}

	}

}
