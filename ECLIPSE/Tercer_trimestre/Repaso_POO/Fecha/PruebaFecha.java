package Fecha;

public class PruebaFecha {


		public static void main(String[] args) {
			
			Fecha fecha1 = new Fecha();
	        Fecha fecha2 = new Fecha(21, 3, 2023);

	        System.out.println("Fecha 1: " + fecha1.toString());
	        System.out.println("Fecha 2: " + fecha2.toString());

	        fecha1.setDia(30);
	        fecha1.setMes(2);
	        fecha1.setAño(2022);

	        if (fecha1.fechaCorrecta()) {
	            System.out.println("La fecha 1 es correcta");
	        } else {
	            System.out.println("La fecha 1 es incorrecta");
	        }

	        fecha1.diaSiguiente();
	        System.out.println("Dia siguiente de fecha 1: " + fecha1.toString());
	    }



}
