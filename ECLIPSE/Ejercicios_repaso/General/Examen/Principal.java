package Examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
    	
        List<String> listaOriginal = new ArrayList<>(); // Crear la lista original con objetos repetidos
        listaOriginal.add("objeto1");
        listaOriginal.add("objeto2");
        listaOriginal.add("objeto3");
        listaOriginal.add("objeto1");
        listaOriginal.add("objeto4");
        listaOriginal.add("objeto2");
        listaOriginal.add("objeto5");
        listaOriginal.add("objeto1");
        listaOriginal.add("objeto4");
        listaOriginal.add("objeto6");

        // Crear una nueva lista sin duplicados usando un conjunto (HashSet)
        Set<String> conjuntoNoRepetidos = new HashSet<>(listaOriginal);
        List<String> listaNoRepetidos = new ArrayList<>(conjuntoNoRepetidos);

        // Crear el mapa que contiene la lista de objetos no repetidos
        Map<String, List<String>> mapa = new HashMap<>();
        mapa.put("listaNoRepetidos", listaNoRepetidos);

        // Mostrar el mapa sin usar System.out.println
        for (Map.Entry<String, List<String>> entry : mapa.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
