package Ejercicio_3;

public class Funcion {

    public static void main(String[] args) {
        double precioSinIva = 100.0;
        double precioConIva = iva(precioSinIva);
        System.out.println("Precio con IVA: " + precioConIva);
    }

    public static double iva(double precio) {
        double iva = 0.21; // Porcentaje del IVA (21%)
        double precioConIva = precio + (precio * iva);
        return precioConIva;
    }

}


// Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.