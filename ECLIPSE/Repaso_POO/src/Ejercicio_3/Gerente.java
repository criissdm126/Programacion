package Ejercicio_3;


public class Gerente extends Empleado {
    public Gerente(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    public void calcularBono() {
        double bono = getSalario() * 0.3;
        setSalario(getSalario() + bono);
    }

}
