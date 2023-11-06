package estructuras_de_control;

public class Switch_case {

	public static void main(String[] args) {
       
		String estacion = "Verano";
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación válida");
                break;
        }
    }
}