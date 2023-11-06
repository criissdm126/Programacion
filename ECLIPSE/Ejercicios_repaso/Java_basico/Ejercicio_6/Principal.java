package Ejercicio_6;

public class Principal {

    public static void main(String[] args) {
    	
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
