package Alimento;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        List<Alimento> listaAlimentos = new ArrayList<>();

     // Agregamos varios alimentos a la lista
        listaAlimentos.add(new Alimento("Manzana", 52));
        listaAlimentos.add(new Alimento("Leche desnatada", 34));
        listaAlimentos.add(new Alimento("Pollo a la plancha", 120));
        listaAlimentos.add(new Alimento("Manzana", 402));
        listaAlimentos.add(new Alimento("Platano", 89));

        Comparator<Alimento> comparador = null;

        // Ordenamos la lista con el comparador personalizado
        Collections.sort(listaAlimentos, comparador);

        // Creamos un Map para almacenar la cantidad de calorías y la cantidad de alimentos por tipo
        Map<String, List<Integer>> mapa = new HashMap<>();

        // Mapa para almacenar los nombres de alimentos no repetidos
        Map<String, List<Integer>> nombre = new HashMap<>();

        // Recorremos la lista de alimentos para agregar los valores al mapa
        for (Alimento alimento : listaAlimentos) {
            String tipo = alimento.getTipo();
            int calorias = alimento.getCalorias();

            // Actualizar el mapa "mapa"
            if (mapa.containsKey(tipo)) {
                List<Integer> valores = mapa.get(tipo);
                valores.set(0, valores.get(0) + calorias);
                valores.set(1, valores.get(1) + 1);
            } else {
                List<Integer> valores = new ArrayList<>();
                valores.add(calorias);
                valores.add(1);
                mapa.put(tipo, valores);
            }

            // Agregar el nombre al mapa "nombre" si no existe
            String nombreAlimento = alimento.getTipo();
            if (!nombre.containsKey(nombreAlimento)) {
                List<Integer> valoresNombre = new ArrayList<>();
                valoresNombre.add(calorias);
                valoresNombre.add(1);
                nombre.put(nombreAlimento, valoresNombre);
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



