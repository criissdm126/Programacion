package Ejercicio3;

public class Gerente extends Empleado {
   
	public Gerente(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public double calcularBono() {
        double bono = getSalario() * 0.3;
        return getSalario() + bono;
    }
}