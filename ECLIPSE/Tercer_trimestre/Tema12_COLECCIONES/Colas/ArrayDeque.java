package Colas;

import java.util.Scanner;
import java.util.ArrayDeque;

public class ArrayDeque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> pedidos = new ArrayDeque<String>();
        int menu;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Nuevo pedido, se introduce en la cola");
            System.out.println("2. ¿Pedidos en cola?");
            System.out.println("3. ¿Primer pedido en cola?");
            System.out.println("4. Servir un pedido");
            System.out.println("5. Pedido Vip");
            System.out.println("0. Salir del programa");

            menu = sc.nextInt();

            switch (menu) {
                case 1: //INTRODUCIR UN PEDIDO
                    System.out.println("Nuevo pedido, se introduce en la cola");
                    break;

                case 2: //VER LOS PEDIDOS QUE HAY EN COLA
                    if (pedidos.isEmpty()) {
                        System.out.println("No hay pedidos en cola.");
                    } else {
                        System.out.println("Hay " + pedidos.size() + " pedidos en cola.");
                    }
                    break;

                case 3: //CUAL ES EL PRIMER PEDIDO Y ELIMINAR = .POLL
                    if (pedidos.isEmpty()) {
                        System.out.println("No hay pedidos en cola.");
                    } else {
                        String primerPedido = pedidos.poll();
                        System.out.println("El primer pedido en cola es: " + primerPedido);
                    }
                    break;

                case 4: //SERVIR UN PEDIDO
                    if (pedidos.isEmpty()) {
                        System.out.println("No hay pedidos en cola.");
                    } else {
                        String pedidoServido = pedidos.poll();
                        System.out.println("El pedido " + pedidoServido + " ha sido servido.");
                    }
                    break;

                case 5: //EL PEDIDO VIP
                    System.out.println("Ingrese el nombre del cliente VIP:");
                    String pedidoVip = sc.next();
                    pedidos.offerFirst(pedidoVip);
                    System.out.println("El pedido VIP ha sido agregado al frente de la cola.");
                    break;

                case 0: //FIN PROGRAMA
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (menu != 0);
        // SE MUESTRAS LAS OPCIONES DEL MENÚ, CUANDO DE CERO SALE
        // NO VUELVE A PREGUNTAR
    }
}

/*Implementa un ArrayDeque que sirva para organizar los pedidos a domicilio de un restaurante (un FIFO)
 * Crea una menú con las siguientes opciones:
 *      a. Nuevo pedido, se introduce en la cola
 *      b. ¿Pedidos en cola?
 *      c. ¿Primer pedido en cola?
 *      d. Servir un pedido (mostrar numero de pedido, desaparecerá de la cola)
 *      e. Pedido Vip
 *      f. Salir del programa
 */
