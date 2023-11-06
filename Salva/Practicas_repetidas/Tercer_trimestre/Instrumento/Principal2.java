package Instrumento;

import java.util.*;

public class Principal2 {

    public static void main(String[] args) {
       
        List<Instrumento> listaInstrumentos = new ArrayList<>();
        
        listaInstrumentos.add(new Instrumento(1, "Trompeta", "viento"));
        listaInstrumentos.add(new Instrumento(2, "Violin", "cuerda"));
        listaInstrumentos.add(new Instrumento(3, "Piano", "percusion"));
        listaInstrumentos.add(new Instrumento(4, "Clarinete", "viento"));
        listaInstrumentos.add(new Instrumento(5, "Viola", "cuerda"));
        listaInstrumentos.add(new Instrumento(6, "Bateria", "percusion"));
        listaInstrumentos.add(new Instrumento(7, "Guitarra", "cuerda"));
        listaInstrumentos.add(new Instrumento(8, "Flauta", "viento"));

        // Ordenar por clase y luego por nombre
        listaInstrumentos.sort(Comparator.comparing(Instrumento::getClase).thenComparing(Instrumento::getNombre));
        System.out.println("Lista de instrumentos ordenados por clase y luego por nombre: ");
        for (Instrumento instrumento : listaInstrumentos) {
            System.out.println(instrumento.getNombre() + " (" + instrumento.getClase() + ")");
        }
        
        // Crear TreeMap de instrumentos ordenados por código alfanumérico
        Map<String, Instrumento> mapInstrumentos = new TreeMap<>();
        for (Instrumento instrumento : listaInstrumentos) {
            String codigo = "COD" + String.format("%03d", instrumento.getId());
            mapInstrumentos.put(codigo, instrumento);
        }
        
        System.out.println("\nInstrumentos ordenados por codigo: ");
        for (Map.Entry<String, Instrumento> entry : mapInstrumentos.entrySet()) {
            String codigo = entry.getKey();
            Instrumento instrumento = entry.getValue();
            System.out.println(instrumento.getNombre() + " (" + instrumento.getClase() + ") - Código: " + codigo);
        }
        
        // Imprimir objeto Instrumento con el formato "nombre_instrumento (clase)"
        System.out.println("\nInstrumentos con el formato nombre_instrumento: ");
        for (Instrumento instrumento : listaInstrumentos) {
            String formato = instrumento.getNombre() + "_" + instrumento.getClase();
            System.out.println(formato);
        }
        
    }
}
