package Simulacro;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	
public class Ejercicio_2 {

	    public static void main(String[] args) {
	        List<Cliente> listaClientes = generarListadoClientes();
	        
	        // Ordenar la lista de clientes según el dni
	        Collections.sort(listaClientes, new Comparator<Cliente>() {
	            @Override
	            public int compare(Cliente cliente1, Cliente cliente2) {
	                return cliente1.getDni().compareTo(cliente2.getDni());
	            }
	        });
	        
	        // Mostrar el listado de clientes ordenado por dni
	        for (Cliente cliente : listaClientes) {
	            System.out.println("Código: " + cliente.getCodigo());
	            System.out.println("Nombre: " + cliente.getNombre());
	            System.out.println("DNI: " + cliente.getDni());
	            System.out.println("------------------------");
	        }
	    }

	    public static List<Cliente> generarListadoClientes() {
	        List<Cliente> listaClientes = new ArrayList<>();

	        // Aquí se agregan los clientes a la lista
	        // Puedes obtener los clientes de la base de datos o agregarlos manualmente
	        
	        // Ejemplo de agregado manual de clientes
	        Cliente cliente1 = new Cliente(1, "Juan", "12345678");
	        Cliente cliente2 = new Cliente(2, "María", "98765432");
	        Cliente cliente3 = new Cliente(3, "Pedro", "45678912");
	        
	        listaClientes.add(cliente1);
	        listaClientes.add(cliente2);
	        listaClientes.add(cliente3);
	        
	        return listaClientes;
	    }
	}


/* Tenemos que crear un listado de clientes que tengan los siguientes atributos:
 *             código, nombre y dni.
 * Suponiendo que tenemos una clase Cliente ya desarrollada, ¿qué sentencias habría que escribir en el main para generar ese listado?
 * Nos piden además poder ordenar el listado de clientes según el dni ¿cómo lo harías?
 */
