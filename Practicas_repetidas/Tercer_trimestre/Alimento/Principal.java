package Alimento;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Set<Alimento> setAlimentos = new HashSet<>();

        // Agregamos varios alimentos al conjunto
        setAlimentos.add(new Alimento("Manzana", 52));
        setAlimentos.add(new Alimento("Leche desnatada", 34));
        setAlimentos.add(new Alimento("Pollo a la plancha", 120));
        setAlimentos.add(new Alimento("Manzana", 402));
        setAlimentos.add(new Alimento("Platano", 89));

        List<Alimento> listaAlimentos = new ArrayList<>(setAlimentos);

        Comparator<Alimento> comparador = null;
        System.out.println(listaAlimentos);
        // Ordenación lista
        Collections.sort(listaAlimentos, comparador);

        // Creamos un Map para almacenar la cantidad de calorías y la cantidad de alimentos por tipo
        Map<String, List<Integer>> mapa = new HashMap<>();

        //  nombres no repetidos
        Map<String, List<Integer>> nombre = new HashMap<>();

        // Recorremos la lista de alimentos para agregar los valores al mapa
        for (Alimento alimento : listaAlimentos) {
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




