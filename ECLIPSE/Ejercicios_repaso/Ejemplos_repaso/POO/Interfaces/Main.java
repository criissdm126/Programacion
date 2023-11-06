package Interfaces;

public class Main {
	
    public static void main(String[] args) {
    	
        Circle circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area del circulo: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.draw();
        System.out.println("Area del rectangulo: " + rectangle.calculateArea());
    }
}