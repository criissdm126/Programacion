package Colecciones_Instrumento;

import java.util.*;

public class Principal {

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

        Scanner scanner = new Scanner(System.in);

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
        } else {
            System.out.println("El instrumento ya existe y no se añadió.");
        }

        // Ordenar por clase y luego por nombre
        listaInstrumentos.sort(Comparator.comparing(Instrumento::getClase).thenComparing(Instrumento::getNombre));
        System.out.println("Lista de instrumentos ordenados por clase y luego por nombre: ");
        for (Instrumento instrumento : listaInstrumentos) {
            System.out.println(instrumento.getNombre() + " (" + instrumento.getClase() + ")");
        }
        
        // Crear TreeMap de instrumentos ordenados por código alfanumérico
        Map<String, Instrumento> mapInstrumentos = new TreeMap<>();
        for (Instrumento instrumento : listaInstrumentos) {
            mapInstrumentos.put("COD" + String.format("%03d", instrumento.getId()), instrumento);
        }
        
        System.out.println("\nInstrumentos ordenados por codigo: ");
        for (Map.Entry<String, Instrumento> entry : mapInstrumentos.entrySet()) {
            System.out.println(entry.getValue().getNombre() + " (" + entry.getValue().getClase() + ") - Codigo: " + entry.getKey());
        }
        
        // Imprimir objeto Instrumento con el formato nombre_instrumento (clase)
        for (Instrumento instrumento : listaInstrumentos) {
            System.out.println(instrumento.getNombre() + "_" + instrumento.getClase());
        }
        
        /* TreeMap de instrumentos ordenados por nombre (voluntario)
        Map<String, Instrumento> mapInstrumentosNombre = new TreeMap<>();
        for (Instrumento instrumento : listaInstrumentos) {
            mapInstrumentosNombre.put(instrumento.getNombre(), instrumento);
        }
        
        System.out.println("\nInstrumentos ordenados por nombre: ");
        for (Map.Entry<String, Instrumento> entry : mapInstrumentosNombre.entrySet()) {
            System.out.println(entry.getValue().getNombre() + " (" + entry.getValue().getClase() + ")");
        }*/
    }
}
/* Si el usuario introduce un nuevo instrumento:
 * import java.util.*;

public class Principal {
    
    public static void main(String[] args) {
        
        // Crear un ArrayList de instrumentos, y ordenarlos por clase 
	    //Los que tengan la misma clase ordénalos por nombre
        
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
        
        // Crear HashSet de instrumentos SIN DUPLICADOS por nombre
        Set<Instrumento> setInstrumentos = new HashSet<>(listaInstrumentos);
        System.out.println("\nInstrumentos sin duplicados por nombre: ");
        for (Instrumento instrumento : setInstrumentos) {
            System.out.println(instrumento.getNombre() + " (" + instrumento.getClase() + ")");
        }

        // Resto del código...
    }
}

 * */
