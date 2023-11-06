package Examen2;

public class Programa {
	
    public static void main(String[] args) {
    	
    
        Alumno alumno = new Alumno("Juan");

        Matematicas matematicas = new Matematicas();
        matematicas.agregarEvaluacion(7.5);
        matematicas.agregarEvaluacion(8.2);
        matematicas.agregarEvaluacion(6.9);
        matematicas.calcularNotaFinal();

        Lengua lengua = new Lengua();
        lengua.agregarEvaluacion(6.8);
        lengua.agregarEvaluacion(7.2);
        lengua.agregarEvaluacion(4.5);
        lengua.calcularNotaFinal();

        Sociales sociales = new Sociales();
        sociales.agregarEvaluacion(9.1);
        sociales.agregarEvaluacion(8.5);
        sociales.agregarEvaluacion(7.7);
        sociales.calcularNotaFinal();

        Filosofia filosofia = new Filosofia();
        filosofia.agregarEvaluacion(7.9);
        filosofia.agregarEvaluacion(8.6);
        filosofia.agregarEvaluacion(8.1);
        filosofia.calcularNotaFinal();

        Musica musica = new Musica();
        musica.agregarEvaluacion(8.4);
        musica.agregarEvaluacion(7.7);
        musica.agregarEvaluacion(8.9);
        musica.calcularNotaFinal();

        alumno.agregarAsignatura(matematicas);
        alumno.agregarAsignatura(lengua);
        alumno.agregarAsignatura(sociales);
        alumno.agregarAsignatura(filosofia);
        alumno.agregarAsignatura(musica);

        alumno.mostrarInformacion();

    }
}



       