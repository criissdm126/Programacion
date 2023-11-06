package casting;

public class Casting_objetos {
	 
    public static void main(String[] args) {
       
    	Comercial e1 = new Comercial("fer", "ure", 60, 1000, 150);
        Repartidor e2 = new Repartidor("fer", "ure", 50, 1000, "zona 3");
        Empleado e3 = new Empleado("fer", "ure", 42, 1000);
 
        Empleado[] empleados = {e1, e2, e3};
 
        Comercial c1;
        Repartidor r1;
         
        for (Empleado e : empleados) {
         
        	//Nos aseguramos de que sea del tipo Comercial
        	if(e instanceof Comercial){
        	      c1 = (Comercial)e; //Casting a comercial
        	      c1.metodoComercial(); //Ahora puedo llamar al metodo
        	}
            if(e instanceof Repartidor){
                r1 = (Repartidor)e;
                r1.metodoRepartidor();
            }
        }
    }
     
}
