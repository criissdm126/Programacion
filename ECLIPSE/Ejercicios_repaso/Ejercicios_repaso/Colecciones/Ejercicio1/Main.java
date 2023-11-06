package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	
        // Crear un objeto Cliente
        Cliente cliente = new Cliente("John Doe", "johndoe@example.com");

        // Agregar teléfonos al cliente
        cliente.addTelefono("669669669");
        cliente.addTelefono("634634634");
        cliente.addTelefono("669789967");

        // Obtener el nombre y email del cliente
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Email: " + cliente.getEmail());

        // Obtener los teléfonos del cliente
        ArrayList<String> telefonos = cliente.getTelefonos();
        System.out.println("Telefonos:");
        for (String telefono : telefonos) {
            System.out.println(telefono);
        }

        // Obtener el teléfono en un índice específico
        int indice = 1;
        String telefono = cliente.getTelefono(indice);
        System.out.println("Telefono en el indice " + indice + ": " + telefono);

        // Buscar teléfonos que contengan una cadena
        String cadenaBusqueda = "669";
        ArrayList<String> telefonosEncontrados = cliente.buscarTelefono(cadenaBusqueda);
        System.out.println("Telefonos encontrados para la cadena '" + cadenaBusqueda + "':");
        for (String telefonoEncontrado : telefonosEncontrados) {
            System.out.println(telefonoEncontrado);
        }
    }
}
