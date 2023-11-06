package HashMaps;

public class TestColegio {

    public static void main(String[] args) {
        Colegio colegio = new Colegio();

        try {
            colegio.addAlumno("Español");
            colegio.addAlumno("Español");
            colegio.addAlumno("Frances");
            colegio.addAlumno("Ingles");
            colegio.addAlumno("Ingles");
            colegio.addAlumno("Italiano");
            colegio.addAlumno(""); // Lanzará la excepción ExceptionVacio
        } catch (Exception e) { // Cambio aquí: ExceptionVacio -> Exception
            System.out.println("Error: " + e.getMessage());
        }

        colegio.showAll();
        System.out.println();
        colegio.showNacionalidad("Español");
        colegio.showNacionalidad("Frances");
        colegio.showNacionalidad("Ingles");
        colegio.showNacionalidad("Italiano");
        colegio.showNacionalidad("Aleman"); // Nacionalidad no existente
        System.out.println();
        colegio.cuantos();
        System.out.println();
        // colegio.borra();
        colegio.showAll();
    }
}
