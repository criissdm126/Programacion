package Examen2;

import java.util.ArrayList;
import java.util.List;

class Alumno {
    private String nombre;
    private List<Asignatura> asignaturas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void mostrarInformacion() {
        System.out.println("Alumno: " + nombre);
        for (Asignatura asignatura : asignaturas) {
            asignatura.mostrarEvaluaciones();
            asignatura.mostrarNotaFinal();
            System.out.println();
        }
    }
}