package composicion_de_otras_clases;

public class Clara {
	
	//atributo
		private double volumen;
		//constructor
		public Clara(double volumen) {
			this.volumen=volumen;
		}
		
		public Clara() {
			this.volumen=0.0;
		}
		
		//getter
		public double getvolumen() {
			return volumen;
		}
		
		//setter
		public void setcvolumen(double volumen) {
			this.volumen=volumen;
		}
		
		//equals
		@Override
		public boolean equals(Object a) {
			Clara otro = (Clara) a;
			
			if (this.equals(a) == otro.volumen) {
				return true;
			}
			else {
				return false;
			}
		}

	}



