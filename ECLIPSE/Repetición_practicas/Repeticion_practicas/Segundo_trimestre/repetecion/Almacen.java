
package repetecion;
public class Almacen {

    public static final int NUM_ESTANTES = 5;
    public static final int NUM_BEBIDAS_POR_ESTANTE = 5;

    private Bebida[][] estantes;

    public Almacen() {
        this.estantes = new Bebida[NUM_ESTANTES][NUM_BEBIDAS_POR_ESTANTE];
    }

    // Agregar producto
    public boolean agregarProducto(Bebida bebida) {
        // Buscar primera posición libre
        for (int i = 0; i < NUM_ESTANTES; i++) {
            for (int j = 0; j < NUM_BEBIDAS_POR_ESTANTE; j++) {
                if (estantes[i][j] == null) {
                    estantes[i][j] = bebida;
                    return true;
                }
            }
        }
        // Si no hay posiciones libres, no se puede agregar la bebida
        return false;
    }

    // Eliminar producto
    public boolean eliminarProducto(String identificador) {
        for (int i = 0; i < NUM_ESTANTES; i++) {
            for (int j = 0; j < NUM_BEBIDAS_POR_ESTANTE; j++) {
                if (estantes[i][j] != null && estantes[i][j].getIdentificador().equals(identificador)) {
                    estantes[i][j] = null;
                    return true;
                }
            }
        }
        // Si no se encuentra la bebida con el identificador dado, no se puede eliminar
        return false;
    }

    // Mostrar información
    public void mostrarInformacion() {
        for (int i = 0; i < NUM_ESTANTES; i++) {
            System.out.println("Estante " + (i+1) + ":");
            for (int j = 0; j < NUM_BEBIDAS_POR_ESTANTE; j++) {
                if (estantes[i][j] != null) {
                    System.out.println(estantes[i][j].toString());
                } else {
                    System.out.println("Posición vacía");
                }
            }
            System.out.println();
        }
    }

    // Calcular precio de todas las bebidas
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < NUM_ESTANTES; i++) {
            for (int j = 0; j < NUM_BEBIDAS_POR_ESTANTE; j++) {
                if (estantes[i][j] != null) {
                    precioTotal += estantes[i][j].getPrecioFinal();
                }
            }
        }
        return precioTotal;
    }

}
