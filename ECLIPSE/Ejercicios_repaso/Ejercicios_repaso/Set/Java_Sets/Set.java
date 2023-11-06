package Java_Sets;

import java.util.HashSet;

public class Set {
	
	public static void main(String[] args) {
		
        // Crear un conjunto llamado "jugadores"
        HashSet<String> jugadores = new HashSet<>();

        // Insertar en el conjunto los jugadores del FC Barcelona
        jugadores.add("Messi");
        jugadores.add("Suárez");
        jugadores.add("Piqué");
        jugadores.add("Busquets");

        // Realizar un bucle sobre los jugadores del conjunto y mostrar sus nombres
        for (String nombre : jugadores) {
            System.out.println(nombre);
        }

        // Consultar si en el conjunto existe el jugador "Neymar JR" y avisar si existe o no
        if (jugadores.contains("Neymar JR")) {
            System.out.println("El jugador Neymar JR existe");
        } else {
            System.out.println("El jugador Neymar JR no existe");
        }

        // Crear un segundo conjunto llamado "jugadores2" con los jugadores "Piqué" y "Busquets"
        HashSet<String> jugadores2 = new HashSet<>();
        jugadores2.add("Piqué");
        jugadores2.add("Busquets");

        // Consultar si todos los elementos de jugadores2 existen en jugadores
        boolean todosExisten = jugadores.containsAll(jugadores2);
        System.out.println("¿Todos los jugadores de jugadores2 existen en jugadores? " + todosExisten);

        // Realizar una unión de los conjuntos jugadores y jugadores2
        HashSet<String> union = new HashSet<>(jugadores);
        union.addAll(jugadores2);

        // Eliminar todos los jugadores del conjunto jugadores2 y mostrar el número de jugadores restantes
        jugadores2.clear();
        System.out.println("Número de jugadores en jugadores2: " + jugadores2.size());
    }
}