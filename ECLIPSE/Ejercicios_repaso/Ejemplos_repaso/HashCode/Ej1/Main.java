package Ej1;

public class Main {

	  public static void main(String[] args) {
		  
	        Person person1 = new Person("Alice", 25);
	        Person person2 = new Person("Bob", 30);

	        // Obtener el valor hash de los objetos
	        int hash1 = person1.hashCode();
	        int hash2 = person2.hashCode();

	        System.out.println("Hash code of person1: " + hash1);
	        System.out.println("Hash code of person2: " + hash2);
	    }
	}
