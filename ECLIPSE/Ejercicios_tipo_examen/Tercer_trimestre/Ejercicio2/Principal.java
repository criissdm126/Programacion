package Ejercicio2;

import java.util.*;

public class Principal {
	
    public static void main(String[] args) {
		
        List<Articulo> articulos = new ArrayList<>();

        // Crear los tres artículos
        Articulo articulo1 = new Articulo("Ferreteria", "Tornillo");
        Articulo articulo2 = new Articulo("Papeleria", "Lapiz");
        Articulo articulo3 = new Articulo("Electrodomestico", "Lavadora");

        // Insertar los artículos en la colección
        articulos.add(articulo1);
        articulos.add(articulo2);
        articulos.add(articulo3);

        // Ordenar los artículos según las descripciones
        Collections.sort(articulos, new Comparator<Articulo>() {
            @Override
            public int compare(Articulo a1, Articulo a2) {
                return a1.getDescripcion().compareTo(a2.getDescripcion());
            }
        });

        // Mostrar los artículos ordenados
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }
}
