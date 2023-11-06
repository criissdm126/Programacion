package Composición_clases;

import HUEVOS_COMPOSICION_DE_CLASES.Clara;
import HUEVOS_COMPOSICION_DE_CLASES.HUEVO;
import HUEVOS_COMPOSICION_DE_CLASES.Yema;

public class Principal {

	public static void main(String[] args) {
		
		//YEMA
				Yema y1 = new Yema("naranja");
				Yema y2 = new Yema("amarillo");
				System.out.println(y2.getcolor());
				
				
				//CLARA
				Clara c1 = new Clara(3.4);
				Clara c2 = new Clara(3.4);
				
				
				//HUEVO
				Huevo h1 = new Huevo(y2,c2);
				Huevo h2 = new Huevo(y1, c1);
				System.out.println(h1);
				
				if(h2.equals(h1)) {
					System.out.println("Los huevos son iguales");
				}
				else {
					System.out.println("Son distintos");
				}
				

				//ARRAY
				Yema[]arraysYemas = new Yema[2];
				arraysYemas[1]=y1;
				
				System.out.println(y1.getcolor());
				
				//MATRIZ YEMA
				
				Yema matrizYemas[] = {y1,y2};
				Clara miClara = new Clara (7);
				Huevo h = new Huevo (matrizYema, miClara);
				
				//OTRA MATRIZ
				Yema otraMatriz[] = h.getYema();
				
			

			}



	}

}
