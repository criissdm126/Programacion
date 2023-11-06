package Ejercicio1;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
    	
        List<Cliente> clientes = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();
        List<Proveedor> proveedores = new ArrayList<>();

        // Creación de objetos y adición a las colecciones
        clientes.add(new Cliente("Cliente 1", 30));
        clientes.add(new Cliente("Cliente 2", 25));
        clientes.add(new Cliente("Cliente 3", 40));
        clientes.add(new Cliente("Cliente 4", 35));
        clientes.add(new Cliente("Cliente 5", 28));

        productos.add(new Producto("Producto 1", 10.99));
        productos.add(new Producto("Producto 2", 15.99));
        productos.add(new Producto("Producto 3", 7.99));
        productos.add(new Producto("Producto 4", 12.99));
        productos.add(new Producto("Producto 5", 9.99));

        proveedores.add(new Proveedor("Proveedor 1", 45));
        proveedores.add(new Proveedor("Proveedor 2", 50));
        proveedores.add(new Proveedor("Proveedor 3", 55));
        proveedores.add(new Proveedor("Proveedor 4", 48));
        proveedores.add(new Proveedor("Proveedor 5", 52));

        // Escritura de la primera colección en un archivo de texto
        try {
        	FileWriter b = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(b);
            for (int i = 0; i < clientes.size(); i++) {
            	 bw.write("Cliente: " + clientes.get(i).toString() + ", Producto: " +
                        productos.get(i).toString() + ", Proveedor: " + proveedores.get(i).toString());
            	 bw.newLine();
            }
            bw.close();
            System.out.println("Se ha guardado la primera coleccion");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}