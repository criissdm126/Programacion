package Examen2;

public class Lengua extends Asignatura {
	
	
    public Lengua() {
        super("Lengua");
    }

    @Override
    public void mostrarNotaFinal() {
        if (notaFinal >= 5.0) {
            System.out.println("Nota final de Lengua: " + notaFinal);
        } else {
            System.out.println("No apto en Lengua");
        }
    }
}
