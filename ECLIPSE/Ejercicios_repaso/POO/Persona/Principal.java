package Persona;
import java.util.Scanner;

public class Principal{
   
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.println("Ingrese los datos de la primera persona:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Sexo (H/M): ");
        char sexo1 = scanner.nextLine().charAt(0);
        System.out.print("Peso (en kg): ");
        double peso1 = scanner.nextDouble();
        System.out.print("Altura (en metros): ");
        double altura1 = scanner.nextDouble();

        System.out.println();
        
        // SEGUNDA PERSONA

        System.out.println("Ingrese los datos de la segunda persona:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Sexo (H/M): ");
        char sexo2 = scanner.nextLine().charAt(0);


        System.out.println();

        // Crear objetos de la clase Persona
        Persona persona1 = new Persona(nombre1, edad1, sexo1);
        persona1.setPeso(peso1);
        persona1.setAltura(altura1);

        Persona persona2 = new Persona(nombre2, edad2, sexo2);

        Persona persona3 = new Persona();

        // Comprobar peso ideal
        int pesoIdealPersona1 = persona1.calcularIMC();
        int pesoIdealPersona2 = persona2.calcularIMC();
        int pesoIdealPersona3 = persona3.calcularIMC();

        System.out.println("Persona 1 - " + persona1.getNombre() + ":");
        mostrarEstadoPeso(pesoIdealPersona1);
        mostrarMayorDeEdad(persona1);
        System.out.println(persona1);

        System.out.println();

        System.out.println("Persona 2 - " + persona2.getNombre() + ":");
        mostrarEstadoPeso(pesoIdealPersona2);
        mostrarMayorDeEdad(persona2);
        System.out.println(persona2);

        System.out.println();

        System.out.println("Persona 3:");
        mostrarEstadoPeso(pesoIdealPersona3);
        mostrarMayorDeEdad(persona3);
        System.out.println(persona3);
    }

    // Método para mostrar el estado del peso
    private static void mostrarEstadoPeso(int pesoIdeal) {
        if (pesoIdeal == -1) {
            System.out.println("Está por debajo de su peso ideal.");
        } else if (pesoIdeal == 0) {
            System.out.println("Está en su peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }
    }

    // Método para mostrar si es mayor de edad
    private static void mostrarMayorDeEdad(Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}


/* Pide por teclado el nombre, la edad, sexo, peso y altura.
 * Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
 *    el segundo objeto obtendrá todos los anteriores menos el peso y la altura
 *    y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
 * Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
 * Indicar para cada objeto si es mayor de edad.
 * Por último, mostrar la información de cada objeto.
 */


