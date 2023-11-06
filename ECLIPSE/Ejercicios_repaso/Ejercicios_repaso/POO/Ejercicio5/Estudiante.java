package Ejercicio5;

class Estudiante {
    
    int a;
    static int b;
    
    Estudiante() {
        b++;
    }

    public void mostrarInfo() {
        
    	System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
    }
}