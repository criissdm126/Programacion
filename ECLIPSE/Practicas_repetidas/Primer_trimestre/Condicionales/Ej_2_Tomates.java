package Condicionales;

import java.util.Scanner;

public class Ej_2_Tomates {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double precioTomate = 2.50; // Precio por kilo de tomates
        int cantidadKilos = 0; // Cantidad de kilos de tomates
        int cantidadTomates = 0; // Cantidad de tomates
        double totalCompra = 0; // Total de la compra
        double descuento = 0; // Descuento
        double precioFinal = 0; // Precio final
        int tomatesRegalados = 0; // Tomates regalados
        
        System.out.print("Introduce la cantidad de kilos de tomates que quieres comprar: ");
        cantidadKilos = sc.nextInt();
        cantidadTomates = (int) (cantidadKilos * 5); // 1 kilo son 5 tomates
        
        if (cantidadKilos > 3 || cantidadTomates > 15) { // Se aplica descuento del 20%
            descuento = (precioTomate * cantidadKilos * 0.2); // Se calcula el descuento
            totalCompra = (precioTomate * cantidadKilos) - descuento; // Se calcula el total de la compra con descuento
            tomatesRegalados = (cantidadKilos - 3) * 2; // Se calcula el número de tomates regalados
        }
        else { // Se aplica descuento del 10%
            descuento = (precioTomate * cantidadKilos * 0.1); // Se calcula el descuento
            totalCompra = (precioTomate * cantidadKilos) - descuento; // Se calcula el total de la compra con descuento
        }
        
        precioFinal = totalCompra + (precioTomate * tomatesRegalados / 5); // Se calcula el precio final con los tomates regalados
        
        System.out.println("Cantidad de tomates comprados: " + cantidadTomates);
        System.out.println("Total de la compra: " + totalCompra + " euros");
        System.out.println("Descuento aplicado: " + descuento + " euros");
        System.out.println("Precio final con tomates regalados: " + precioFinal + " euros");
        System.out.println("Tomates regalados: " + tomatesRegalados);
        
        sc.close();
    }
}

/*Una frutería ofrece un descuento en los tomates, del 20% por la compra de más de 3 kilos o 15 unidades (1 kilo son aproximadamente 5 tomates) y 10% en caso contrario.
* Además, por la compra de más de 3 kilos se regalan 2 tomates por cada kilo de más.
* Pon un precio a los tomates y calcula el total de la compra, el descuento, lo que pagas finalmente y el número de tomates que se regalan en cada compra.
*/