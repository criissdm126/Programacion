package Examen2;

public class Musica extends Asignatura {
	
    public Musica() {
        super("Musica");
    }

    @Override
    public void mostrarNotaFinal() {
        System.out.println("Nota final de Musica: " + notaFinal);
    }
}