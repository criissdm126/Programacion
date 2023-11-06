package Ejercicio_1;

public class Principal1 {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setEdad(44);
		persona.setNombre("Paco");
		persona.setTelefono(672437108);
		
		System.out.println("El nombre es " + persona.getNombre() + ", tiene " + persona.getEdad() + " años, y su telefono es " + persona.getTelefono());
		

	}

}
/*Crear un objeto persona en el main.
 * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */






