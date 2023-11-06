package Tema_7;

public class CuentaCorriente {

    String dni;
    String nombre;
    double saldo = 0;

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true; // Operación realizada con éxito
        } else {
            return false; // No hay saldo suficiente
        }
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}
/* diseñar la clase CuentCorriente, almacena el DNI y nombre del titula, así como el saldo.
 * Las operaciones típicas con una cuenta corriente son:
 *     Crear una cuenta: se necesita DNI y nombre del titular, el saldo inicial será 0.
 *     Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operaciones, si existe saldo suficiente.
 *     Ingresar dinero: se incrementa el saldo
 *     Mostrar unformación: muestra la información disponible de la cuenta corriente
 */
