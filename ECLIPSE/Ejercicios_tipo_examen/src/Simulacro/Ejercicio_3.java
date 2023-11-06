package Simulacro;

import java.util.*;


public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Menu> menuSemanal = new HashMap<>();

        int opcion;
        do {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Añadir menu");
            System.out.println("2. Consultar menu");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

			
            switch (opcion) {
            case 1:
                añadirMenu(menuSemanal);
                break;
            case 2:
                consultarMenu(menuSemanal);
                break;
            case 3:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción invalida. Por favor, selecciona una opcion valida.");
        }
    } while (opcion != 3);
}

public static void añadirMenu(Map<String, Menu> menuSemanal) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese el dia para el menu:");
    String dia = sc.nextLine();

    System.out.println("Ingrese el primer plato:");
    String primerPlato = sc.nextLine();

    System.out.println("Ingrese el segundo plato:");
    String segundoPlato = sc.nextLine();

    System.out.println("Ingrese el postre:");
    String postre = sc.nextLine();

    Menu menu = new Menu(primerPlato, segundoPlato, postre);
    menuSemanal.put(dia, menu);
    System.out.println("Menu agregado exitosamente para el dia " + dia);
}

public static void consultarMenu(Map<String, Menu> menuSemanal) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el día para consultar el menú:");
    String dia = sc.nextLine();

    Menu menu = menuSemanal.get(dia);
    if (menu != null) {
        System.out.println("Menu del " + dia + ":");
        System.out.println("Primer plato: " + menu.getPrimerPlato());
        System.out.println("Segundo plato: " + menu.getSegundoPlato());
        System.out.println("Postre: " + menu.getPostre());
    }
    else {
        System.out.println("No se encontro menu para el di " + dia);
        }
    }
}

class Menu {
    private String primerPlato;
    private String segundoPlato;
    private String postre;
    
    public Menu(String primerPlato, String segundoPlato, String postre) {
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.postre = postre;
        }
        
        public String getPrimerPlato() {
            return primerPlato;
        }
        
        public String getSegundoPlato() {
            return segundoPlato;
        }
        
        public String getPostre() {
            return postre;
        }
    }


/*    ENUNCIADO:
 * Crear un menú semanal (con el nombre del dia como identificador)
 * Cada menú está formado por 1º, 2º y postre.
 * Se podrán añadir menús y consultar menú para un dia concreto
 * Por ejmeplo: 
 *            Lunes – Primero: Sopa Castellana
 *            Segundo: Ragout de Ternera
 *            Postre: Melón
 *            
 *            Martes – Primero: Ensaladilla Rusa
 *            Segundo: Boquerones fritos
 *            Postre: Tarta de Santiago
 */


