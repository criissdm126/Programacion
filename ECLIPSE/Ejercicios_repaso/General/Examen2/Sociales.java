package Examen2;

public class Sociales extends Asignatura {
	
    public Sociales() {
        super("Sociales");
    }

    @Override
    public void mostrarNotaFinal() {
        System.out.println("Nota final de Sociales: " + notaFinal);
    }
}