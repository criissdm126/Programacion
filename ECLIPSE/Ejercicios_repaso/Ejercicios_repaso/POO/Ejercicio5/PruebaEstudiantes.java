package Ejercicio5;

public class PruebaEstudiantes {
    
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante();
        e1.mostrarInfo();
        
        Estudiante e2 = new Estudiante();
        e2.mostrarInfo();
        
        e1.b++; 
        Estudiante.b++; 
        e2.mostrarInfo();
        }
}