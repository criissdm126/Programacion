package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
    private String nombre;
    private String email;
    private ArrayList<String> telefonos;
    private HashMap<String, Integer> compras;

    // CONSTRUCTOR
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.telefonos = new ArrayList<>();
        this.compras = new HashMap<>();
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    // AÑADE EL TELEFONO AL ARRAYLIST EN CASO DE QUE NO ESTÉ INTRODUCIDO
    public void addTelefono(String telefono) {
        if (!telefonos.contains(telefono)) {
            telefonos.add(telefono);
        }
    }

    // SI PASAMOS UN NUMERO QUE YA ESTA NOS LO DEVUELVE
    // EN CASO DE QUE NO EXISTA, DEVUELVE ""
    public String getTelefono(int indice) {
        if (indice >= 0 && indice < telefonos.size()) {
            return telefonos.get(indice);
        } else {
            return "";
        }
    }

    // BUSCA EN EL ARRAY
    public ArrayList<String> buscarTelefono(String cadena) {
        ArrayList<String> telefonosEncontrados = new ArrayList<>();
        for (String telefono : telefonos) {
            if (telefono.contains(cadena)) {
                telefonosEncontrados.add(telefono);
            }
        }
        return telefonosEncontrados;
    }

    // AÑADE UNA COMPRA
    public void addCompra(String producto, int cantidad) {
        if (compras.containsKey(producto)) {
            int cantidadActual = compras.get(producto);
            compras.put(producto, cantidadActual + cantidad);
        } else {
            compras.put(producto, cantidad);
        }
    }

    // ELIMINA UN PRODUCTO DE LAS COMPRAS
    public void eliminarProducto(String producto) {
        compras.remove(producto);
    }

    // DEVUELVE UN ARRAYLIST DE LOS NOMBRES DE LOS PRODUCTOS
    public ArrayList<String> verProductos() {
        return new ArrayList<>(compras.keySet());
    }

    // DEVUELVE EL TOTAL DE UNIDADES COMPRADAS
    public int totalUnidades() {
        int total = 0;
        for (int cantidad : compras.values()) {
            total += cantidad;
        }
        return total;
    }
}
