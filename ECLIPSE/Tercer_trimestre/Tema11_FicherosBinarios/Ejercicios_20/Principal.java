package Ejercicios_20;

import java.io.*;
import java.util.*;

public class Principal {
	private ArrayList<Cliente> clientes;

    public Principal() {
        clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void removeCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }

    public void updateCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == cliente.getId()) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre() + ", Teléfono: " + cliente.getTelefono());
        }
    }

}

