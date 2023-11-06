package Examen2;

public class Matematicas extends Asignatura {
	
    public Matematicas() {
        super("Matematicas");
    }

    @Override
    public void mostrarNotaFinal() {
        if (notaFinal >= 5.0) {
            System.out.println("Nota final de Matematicas: " + notaFinal);
        } else {
            System.out.println("No apto en Matematicas");
        }
    }
}