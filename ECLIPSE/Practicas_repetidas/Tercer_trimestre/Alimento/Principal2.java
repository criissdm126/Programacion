package Alimento;

import java.util.*;


public class Principal2 {
    
    public static void main(String[] args) {
        
        List<Alimento2> listaAlimentos = new ArrayList<>();
        
        // Agregamos varios alimentos a la lista
        listaAlimentos.add(new Alimento2("Manzana", 52));
        listaAlimentos.add(new Alimento2("Leche desnatada", 34));
        listaAlimentos.add(new Alimento2("Pollo a la plancha", 120));
        listaAlimentos.add(new Alimento2("Queso cheddar", 402));
        listaAlimentos.add(new Alimento2("Platano", 89));
        
        Comparator<Alimento2> comparador = Alimento2.comparadorCalorias;
        
        // Ordenamos la lista con el comparador personalizado
        Collections.sort(listaAlimentos, comparador);
        
        // Creamos un Map para almacenar la cantidad de calorías y la cantidad de alimentos por tipo
        Map<String, List<Integer>> mapa = new HashMap<>();
        
        // Recorremos la lista de alimentos para agregar los valores al mapa
        for (Alimento2 alimento : listaAlimentos) {
            String tipo = alimento.getTipo();
            int calorias = alimento.getCalorias();
            
            if (mapa.containsKey(tipo)) {
                List<Integer> valores = mapa.get(tipo);
                valores.set(0, valores.get(0) + calorias);
                valores.set(1, valores.get(1) + 1);
            }
            else {
                List<Integer> valores = new ArrayList<>();
                valores.add(calorias);
                valores.add(1);
                mapa.put(tipo, valores);
            }
        }
        
        // Imprimimos el listado de tipos y medias de calorías
        System.out.println("Listado de tipos de alimentos y medias de calorias:");
        for (Map.Entry<String, List<Integer>> comida : mapa.entrySet()) {
            String tipo = comida.getKey();
            int caloriasTotales = comida.getValue().get(0);
            int cantidad = comida.getValue().get(1);
            double media = (double) caloriasTotales / cantidad;
            
            System.out.println("- " + tipo + ": " + media + " calorias");
        }
    }
}