package Futbolistas;

import java.util.*;

class Futbolista implements Comparable<Futbolista> {
    private String dni;
    String nombre;
    private int edad;
    private int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumGoles() {
        return numGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numGoles=" + numGoles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int compareTo(Futbolista o) {
        return dni.compareTo(o.getDni());
    }

    public static Comparator<Futbolista> nombreComparator = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista o1, Futbolista o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

    public static Comparator<Futbolista> edadComparator = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista o1, Futbolista o2) {
            int result = Integer.compare(o1.getEdad(), o2.getEdad());
            if (result != 0) {
                return result;
            }
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}

/* La clase futbolista tiene los atributos: dni, nombre, edad, número goles
 * Un constructor y los métodos toString() y equals() (este último basado en el DNI)
 * La interfaz Comparable con un criterio de ordenación basado también en el DNI.
 * Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad
 * Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
 * 
 * Añadir un comparador que ordene los futbolistas por edades y,
 * para aquellos que tienen la misma edad, por nombres.*/