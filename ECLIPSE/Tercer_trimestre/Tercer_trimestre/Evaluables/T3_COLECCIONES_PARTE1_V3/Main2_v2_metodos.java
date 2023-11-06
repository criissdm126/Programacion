package T3_COLECCIONES_PARTE1_V3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2_v2_metodos {

    public static void main(String[] args) {
        
        ArrayList<Alimento> alimentos = new ArrayList<>();
        
        Alimento jamon = new Alimento("Proteina",120);
        alimentos.add(jamon);
        alimentos.add(new Alimento("Fruta", 30));
        alimentos.add(new Alimento("Fruta", 80));

        alimentos.add(new Alimento("Verdura",3));
        alimentos.add(new Alimento("Verdura",90));
        alimentos.add(new Alimento("Verdura",100));

        alimentos.add(new Alimento("Grano", 100));
        
        alimentos.add(new Alimento("Proteina",121));
        alimentos.add(new Alimento("Proteina",81));
        alimentos.add(new Alimento("Proteina",75));
        alimentos.add(new Alimento("Proteina",200));
        alimentos.add(new Alimento("Proteina",150));
        
        
        listarAlimentosPorTipo(alimentos);
    }

    public static void listarAlimentosPorTipo(ArrayList<Alimento> alimentos) {
        HashSet<String> tipos = new HashSet<>();
        //Declaramos el for each para volcar el contenido de la lista a la coleccion, pero añadimos el tipo(getTipo)
        for (Alimento alimento : alimentos) {
            tipos.add(alimento.getTipo());
        }
        //Declaramos el for each para mostrar el tipo de alimento y creamos una lista en la que volcaremos el alimento si los tipos son iguales
        for (String tipoAlimento : tipos) {
            System.out.println("Tipo: " + tipoAlimento);
            ArrayList<Alimento> alimentos_De_Tipo = new ArrayList<>();
            for (Alimento alimento : alimentos) {
                if (alimento.getTipo().equals(tipoAlimento)) {
                    alimentos_De_Tipo.add(alimento);
                }
            }
            //Ordenamos la lista
            Collections.sort(alimentos_De_Tipo, new ComparaAlimento2());
            //Declaramos una variable para recoger todas las calorias
            double totalCalorias = 0;
            //Declaramos el for each para que la variable totalCalorias recoja todas las calorias por tipo y mostrarlo por pantalla
            for (Alimento alimento : alimentos_De_Tipo) {
                totalCalorias += alimento.getCalorias();
                System.out.println("\tCalorias: " + alimento.getCalorias());
            }
            //Declaramos la variable mediaCalorias para hacer la media con el total de las calorias y el total de los alimentos que hay por su tipo y lo mostramos por pantalla
            double mediaCalorias = totalCalorias / alimentos_De_Tipo.size();
            System.out.println("Media: " + mediaCalorias);
        }
    }
}








