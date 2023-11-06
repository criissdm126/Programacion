package Ejercicio3;

public class Principal {
    public static void main(String[] args) {
       
    	
    	Programador programador = new Programador("Juan", 30, 3000);
        Gerente gerente = new Gerente("María", 35, 5000);

        System.out.println("Salario actual del programador: $" + programador.getSalario());
        System.out.println("Salario con bono del programador: $" + programador.calcularBono());

        System.out.println("Salario actual del gerente: $" + gerente.getSalario());
        System.out.println("Salario con bono del gerente: $" + gerente.calcularBono());
    }
}
