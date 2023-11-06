package Instrumento;

import java.util.*;

public class Principal {

    public static <T> void main(String[] args) {
       
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
      //  listaInstrumentos.sort(Comparator.comparing(Instrumento::getNombre));
        // Collections.sort((List<T>) listaInstrumentos);
        System.out.println("Lista de instrumentos ordenados por clase y luego por nombre: ");
        for (Instrumento instrumento : listaInstrumentos) {
            System.out.println(instrumento.getNombre()); // + " (" + instrumento.getClase() + ")"
        }

        
        // Crear HashSet de instrumentos sin duplicados basado en el nombre
       /* Set<Instrumento> setInstrumentos = new HashSet<>(listaInstrumentos);
        System.out.println("\nInstrumentos sin duplicados: ");
        for (Instrumento instrumento : setInstrumentos) {
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
            System.out.println(instrumento.getNombre() + " (" + instrumento.getClase() + ") - Codigo: " + codigo);
        }
        
        // Imprimir objeto Instrumento con el formato "nombre_instrumento (clase)"
        System.out.println("\nInstrumentos con el formato nombre_instrumento: ");
        for (Instrumento instrumento : listaInstrumentos) {
            String formato = instrumento.getNombre() + "_" + instrumento.getClase();
            System.out.println(formato);
        }*/
        
    }
}


/* Scanner scanner = new Scanner(System.in);

System.out.print("Introduce el ID del instrumento: ");
int id = scanner.nextInt();
scanner.nextLine(); // Consumir la nueva línea después de leer el entero

System.out.print("Introduce el nombre del instrumento: ");
String nombre = scanner.nextLine();

System.out.print("Introduce la clase del instrumento: ");
String clase = scanner.nextLine();

Instrumento nuevoInstrumento = new Instrumento(id, nombre, clase);

Set<Instrumento> setInstrumentos = new HashSet<>(listaInstrumentos);
if (!setInstrumentos.contains(nuevoInstrumento)) {
    setInstrumentos.add(nuevoInstrumento);
    listaInstrumentos = new ArrayList<>(setInstrumentos);
    System.out.println("Nuevo instrumento agregado.");
}
else {
    System.out.println("El instrumento ya existe y no se añadió.");
}*/


/*        listaInstrumentos.sort((i1, i2) -> {
            int resultado = i1.getClase().compareTo(i2.getClase());
            if (resultado == 0) {
                resultado = i1.getNombre().compareTo(i2.getNombre());
            }
            return resultado;
        });*/
