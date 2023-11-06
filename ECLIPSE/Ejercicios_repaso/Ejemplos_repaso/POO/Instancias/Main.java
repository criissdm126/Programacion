package Instancias;

public class Main {
	
    public static void main(String[] args) {
    	
        // Crear instancias de la clase Person
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Acceder a los datos de las instancias
        System.out.println("Nombre de la persona 1: " + person1.getName());
        System.out.println("Edad de la persona 1: " + person1.getAge());

        System.out.println("Nombre de la persona 2: " + person2.getName());
        System.out.println("Edad de la persona 2: " + person2.getAge());
    }
}
