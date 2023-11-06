package Ejercicio4;

public class Principal {
    
    public static void main(String[] args) {
    	
        Pajaro pajaro1 = new Pajaro("Rojo", "Canario");
        Pajaro pajaro2 = new Pajaro("Azul", "Perico");
        Pajaro pajaro3 = new Pajaro("Verde", "Loro");
        
        // Comparar los pájaros por color utilizando el método compareTo
        int comparacion1 = pajaro1.compareTo(pajaro2);
        int comparacion2 = pajaro2.compareTo(pajaro3);
        
        if (comparacion1 < 0) {
            System.out.println(pajaro1.getColor() + " es menor que " + pajaro2.getColor());
        }
        else if (comparacion1 > 0) {
            System.out.println(pajaro1.getColor() + " es mayor que " + pajaro2.getColor());
        }
        else {
            System.out.println(pajaro1.getColor() + " es igual a " + pajaro2.getColor());
        }
        
        if (comparacion2 < 0) {
            System.out.println(pajaro2.getColor() + " es menor que " + pajaro3.getColor());
        }
        else if (comparacion2 > 0) {
            System.out.println(pajaro2.getColor() + " es mayor que " + pajaro3.getColor());
        }
        else {
            System.out.println(pajaro2.getColor() + " es igual a " + pajaro3.getColor());
        }
    }
}

