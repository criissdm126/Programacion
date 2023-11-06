package Interfaces;

public class Circle implements Drawable {
	
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}