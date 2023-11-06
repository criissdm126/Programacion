package Métodos;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Ejemplo de uso de los métodos
        double areaCirculo = calcularAreaCirculo(5);
        System.out.println("Área del círculo: " + areaCirculo);

        double areaRectangulo = calcularAreaRectangulo(4, 6);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        double areaCuadrado = calcularAreaCuadrado(3);
        System.out.println("Área del cuadrado: " + areaCuadrado);

        double areaTriangulo = calcularAreaTriangulo(2, 5);
        System.out.println("Área del triángulo: " + areaTriangulo);
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
// Modificar el ejercicio de los polígonos para que haya un método para calcular  el área de cada polígono, 4 métodos.
