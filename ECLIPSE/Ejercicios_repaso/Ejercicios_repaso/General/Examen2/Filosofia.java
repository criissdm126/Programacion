package Examen2;

public class Filosofia extends Asignatura {
	
    public Filosofia() {
        super("Filosofia");
    }

    @Override
    public void mostrarNotaFinal() {
        System.out.println("Nota final de Filosofia: " + notaFinal);
    }
}

