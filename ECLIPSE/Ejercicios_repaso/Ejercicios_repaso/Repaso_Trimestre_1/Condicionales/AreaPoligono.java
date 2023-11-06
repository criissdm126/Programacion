package Condicionales;

import java.util.Scanner;

public class AreaPoligono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Triángulo");
        System.out.print("Ingrese el número correspondiente al polígono: ");
        int opcion = scanner.nextInt();

        double area = 0;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = calcularAreaCirculo(radio);
                break;
            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();
                area = calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                break;
            case 3:
                System.out.print("Ingrese el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                area = calcularAreaCuadrado(ladoCuadrado);
                break;
            case 4:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                area = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("El área del polígono seleccionado es: " + area);
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



/*
 * Calcular área polígonos. Se muestra un menú 1 Circulo, 2 Rectángulo, 3
 * Cuadrado, 4 Triángulo. Según el nº introducido se piden los datos al usuario y
 * se calcula el área
 */
