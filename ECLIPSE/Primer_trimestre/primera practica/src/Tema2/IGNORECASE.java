package Tema2;

public class IGNORECASE {

	public static void main(String[] args) {
		
		
			String a ="hola";
			String b="Hola";
			if (a.equalsIgnoreCase(b))
				System.out.println("Son iguales independientemente de mayusculas o no");
			if (a.equals(b))
				System.out.println("Son iguales");

	}

}
