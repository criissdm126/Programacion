package Equipo;

import java.util.Comparator;

public class ComparadorPuntosYGoles implements Comparator<IEquipo> {
    
    @Override
    public int compare(IEquipo equipo1, IEquipo equipo2) {
        // Primero comparamos los puntos
        int puntosEquipo1 = equipo1.getPuntos();
        int puntosEquipo2 = equipo2.getPuntos();
        if (puntosEquipo1 != puntosEquipo2) {
            return puntosEquipo2 - puntosEquipo1; // Ordenamos por puntos descendente
        } 
        else {
            // Si tienen los mismos puntos, comparamos la diferencia de goles
            int difGolesEquipo1 = equipo1.getGolesFavor() - equipo1.getGolesContra();
            int difGolesEquipo2 = equipo2.getGolesFavor() - equipo2.getGolesContra();
            return difGolesEquipo2 - difGolesEquipo1; // Ordenamos por diferencia de goles descendente
        }
    }
}