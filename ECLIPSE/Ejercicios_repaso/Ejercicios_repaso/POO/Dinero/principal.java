package Dinero;

public class principal {

    public static void main(String[] args) {
       
    	// Crear una cuenta con titular obligatorio
        Cuenta cuenta1 = new Cuenta("Juan Perez");
        System.out.println(cuenta1); // Imprime: Cuenta [titular=Juan Pérez, cantidad=0.0]

        // Crear una cuenta con titular y cantidad
        Cuenta cuenta2 = new Cuenta("Maria Lopez", 100.0);
        System.out.println(cuenta2); // Imprime: Cuenta [titular=María López, cantidad=100.0]

        // Acceder y modificar atributos
        cuenta1.setTitular("Pedro Gomez");
        cuenta1.setCantidad(50.0);
        System.out.println(cuenta1.getTitular()); // Imprime: Pedro Gómez
        System.out.println(cuenta1.getCantidad()); // Imprime: 50.0

        // Realizar operaciones de ingreso y retiro
        cuenta1.ingresar(20.0);
        cuenta1.retirar(10.0);
        System.out.println(cuenta1.getCantidad()); // Imprime: 60.0
    }
}




