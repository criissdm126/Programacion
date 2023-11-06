package Java_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
        // Crear una lista que contenga los días de la semana
        List<String> listDias = new ArrayList<>();
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miercoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sabado");
        listDias.add("Domingo");

        // Insertar en la posición 4 el elemento "Juernes"
        listDias.add(4, "Juernes");

        // Copiar la lista a otra llamada listaDos
        List<String> listaDos = new ArrayList<>(listDias);

        // Añadir a listDias el contenido de listaDos
        listDias.addAll(listaDos);

        // Mostrar el contenido de las posiciones 3 y 4 de la lista original
        System.out.println("Elemento en la posicion 3: " + listDias.get(3));
        System.out.println("Elemento en la posicion 4: " + listDias.get(4));

        // Mostrar el primer elemento y el último de la lista original
        System.out.println("Primer elemento: " + listDias.get(0));
        System.out.println("Ultimo elemento: " + listDias.get(listDias.size() - 1));

        // Eliminar el elemento que contenga "Juernes" de la lista
        if (listDias.remove("Juernes")) {
            System.out.println("Borrado");
        } else {
            System.out.println("No existe");
        }

        // Crear un iterador y mostrar uno a uno los valores de la lista original
        Iterator<String> iterator = listDias.iterator();
        while (iterator.hasNext()) {
            String dia = iterator.next();
            System.out.println(dia);
        }

        // Buscar si existe en la lista un elemento que se denomine "Lunes"
        boolean existeLunes = listDias.contains("Lunes");
        System.out.println("¿Existe Lunes? " + existeLunes);

        // Buscar si existe en la lista un elemento que se denomine "Lunes" (sin importar mayúsculas o minúsculas)
        boolean existeLunesIgnoreCase = false;
        for (String dia : listDias) {
            if (dia.equalsIgnoreCase("Lunes")) {
                existeLunesIgnoreCase = true;
                break;
            }
        }
        System.out.println("¿Existe Lunes (ignorando mayusculas/minusculas)? " + existeLunesIgnoreCase);

        // Ordenar la lista y mostrar su contenido
        listDias.sort(null);
        System.out.println("Lista ordenada:");
        for (String dia : listDias) {
            System.out.println(dia);
        }

        // Borrar todos los elementos de la lista
        listDias.clear();
    }
}