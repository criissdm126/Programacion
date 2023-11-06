package Mapas;

import java.util.*;

public class Inventario {

	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    Map<String, Producto> stock = new HashMap<>();
    
    int opcion;
    
    do {
      System.out.println("Seleccione una opcion:");
      System.out.println("1. Insertar producto.");
      System.out.println("2. Aumentar stock.");
      System.out.println("3. Reducir stock.");
      System.out.println("4. Eliminar productos.");
      System.out.println("5. Mostrar inventario.");
      System.out.println("6. Salir");
      
      opcion = sc.nextInt();
      //sc.next();
      
      switch (opcion) {

   // INSERTAR OPCION
      case 1:
          System.out.println("1. Insertar producto.");
          System.out.println("Ingrese el código del producto:");
          String codigo = sc.next();

          System.out.println("Ingrese el nombre del producto:");
          String nombre = sc.next();

          System.out.println("Ingrese la cantidad disponible:");
          int cantidad = sc.nextInt();
          sc.nextLine();

          Producto producto = new Producto(nombre, cantidad);
          stock.put(codigo, producto);

          System.out.println("Producto insertado con éxito.");
          break;
        
        // AUMENTAR STOCK
        case 2:
        System.out.println("2. Aumentar stock.");
        System.out.println("Ingrese el código del producto:");
        String codigo1 = sc.next();
        
        System.out.println("Ingrese el nuevo stock:");
        int nuevoStock = sc.nextInt();
        
        Producto productoAumentarStock = stock.get(codigo1);
        
        if (productoAumentarStock != null) {
          productoAumentarStock.aumentarStock(nuevoStock);
          System.out.println("Se aumentó el stock de " + codigo1 + ". El nuevo stock es: " + productoAumentarStock.getStock());
        }
        else {
          System.out.println("El producto con código " + codigo1 + " no existe en el inventario.");
        }
        
        break;
        
        // REDUCIR STOCK
        case 3:
        System.out.println("3. Reducir stock.");
        System.out.println("Ingrese el código del producto:");
        String codigo2 = sc.next();
        
        System.out.println("Ingrese la cantidad a reducir:");
        int cantidadReducir = sc.nextInt();
        Producto productoReducirStock = stock.get(codigo2);
        
        if (productoReducirStock != null) {
          int stockActual = productoReducirStock.getStock();
          
          if (stockActual >= cantidadReducir) {
            productoReducirStock.reducirStock(cantidadReducir);
            System.out.println("Se redujo el stock de " + codigo2 + ". El nuevo stock es: " + productoReducirStock.getStock());
          }
          else {
            System.out.println("No se puede reducir el stock de " + codigo2 + " a una cantidad menor que cero.");
          }
        }
        else {
          System.out.println("El producto con código " + codigo2 + " no existe en el inventario.");
        }
        
        break;
        
     // ELIMINAR PRODUCTOS
        case 4:
            System.out.println("4. Eliminar productos.");
            System.out.println("Ingrese el código del producto:");
            String codigo3 = sc.next();
            Producto productoEliminar = stock.remove(codigo3);
            if (productoEliminar != null) {
                System.out.println("El producto con código " + codigo3 + " ha sido eliminado del inventario.");
            } else {
                System.out.println("El producto con código " + codigo3 + " no existe en el inventario.");
            }
            break;

        
        // MOSTRAR EL INVENTARIO
        case 5:
            System.out.println("5. Mostrar inventario.");
            if (stock.isEmpty()) {
                System.out.println("El inventario está vacío.");
            } else {
                for (Map.Entry<String, Producto> entry : stock.entrySet()) {
                    String codigoProducto = entry.getKey();
                    Producto producto1 = entry.getValue();
                    System.out.println("Código: " + codigoProducto + ", Producto: " + producto1.getTipo() + ", Stock: " + producto1.getStock());
                }
            }
            break;
        // SALIR DEL MENÚ
        case 6:
        System.out.println(	"Has salido del sistema.");
        break;
      }
    } while(opcion != 6);
  }
}

// ENUNCIADO
/* INVENTARIO DE PRODUCTOS (STOCK), CRUD (CON MAPAS):
 *      Insertar productos
 *      Aumentar stock
 *      Reducir stock (no se puede quedar en negativo)
 *      Eliminar productos
 *      Mostrar inventario
 */

/* OPCIONAL:
 *    Meter tipo de producto
 *    Mostrar media de stock por tipo de producto
 */
