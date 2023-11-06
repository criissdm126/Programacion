package Tema6;

public class CompareTo {

	public static void main(String[] args) {
		
		String a = "hola";
		String b = "aloha";
		
		if (a.compareTo(b)<0)
			System.out.println("Es menor");
		else if (a.compareTo(b)>0)
			System.out.println("Es mayor");
		else
			System.out.println("Son iguales");

	}

}
