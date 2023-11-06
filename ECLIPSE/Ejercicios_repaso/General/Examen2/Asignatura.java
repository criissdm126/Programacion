package Examen2;

import java.util.*;

abstract class Asignatura {
	
    protected String nombre;
    protected List<Double> evaluaciones;
    protected double notaFinal;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.evaluaciones = new ArrayList<>();
        this.notaFinal = 0.0;
    }

    public void agregarEvaluacion(double nota) {
        evaluaciones.add(nota);
    }

    public void calcularNotaFinal() {
        double suma = 0.0;
        for (Double evaluacion : evaluaciones) {
            suma += evaluacion;
        }
        notaFinal = suma / evaluaciones.size();
    }

    public abstract void mostrarNotaFinal();

    public void mostrarEvaluaciones() {
        System.out.println("Asignatura: " + nombre);
        System.out.println("Evaluaciones: " + evaluaciones);
    }
}