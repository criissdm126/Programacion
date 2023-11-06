package Ejercicio3;

public class Programador extends Empleado {
    
	public Programador(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public double calcularBono() {
        double bono = getSalario() * 0.2;
        return getSalario() + bono;
    }
}