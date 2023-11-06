package HashSet;

import java.util.*;

public class Ejercicio_1 {

    public static void main(String[] args) {
        HashSet<String> ingles = new HashSet<>();
        ingles.add("Juan");
        ingles.add("Maria");
        ingles.add("Pedro");

        HashSet<String> frances = new HashSet<>();
        frances.add("Juan");
        frances.add("Luisa");
        frances.add("Ana");

        HashSet<String> aleman = new HashSet<>();
        aleman.add("Maria");
        aleman.add("Pedro");
        aleman.add("Sofia");

        // Llamamos al método conjuntos y le pasamos los tres conjuntos de idiomas como parámetros
        ArrayList<HashSet<String>> resultado = conjuntos(ingles, frances, aleman);
        
        //  resultados de cada conjunto
        System.out.println("Personas que hablan al menos ingles: " + resultado.get(0));
        System.out.println("Personas que al menos dos idiomas: " + resultado.get(1));
        System.out.println("Personas que solo dominan un idioma: " + resultado.get(2));
        System.out.println("Personas que dominan todos los idiomas: " + resultado.get(3));
    }

    public static ArrayList<HashSet<String>> conjuntos(HashSet<String> ingles, HashSet<String> frances, HashSet<String> aleman) {

        ArrayList<HashSet<String>> resultado = new ArrayList<>();

        // Personas que hablan al menos inglés
        HashSet<String> personasIngles = new HashSet<>(ingles);
        personasIngles.addAll(frances);
        personasIngles.addAll(aleman);
        resultado.add(personasIngles);

        // Personas que al menos dos idiomas
        HashSet<String> personasDosIdiomas = new HashSet<>(ingles);
        personasDosIdiomas.retainAll(frances);
        personasDosIdiomas.addAll(ingles);
        personasDosIdiomas.retainAll(aleman);
        personasDosIdiomas.addAll(frances);
        personasDosIdiomas.retainAll(aleman);
        resultado.add(personasDosIdiomas);

        // Personas que solo dominan un idioma
        HashSet<String> personasUnIdioma = new HashSet<>();
        HashSet<String> todasLasPersonas = new HashSet<>(ingles);
        todasLasPersonas.addAll(frances);
        todasLasPersonas.addAll(aleman);
        for (String persona : todasLasPersonas) {
            int idiomas = 0;
            if (ingles.contains(persona))
                idiomas++;
            if (frances.contains(persona))
                idiomas++;
            if (aleman.contains(persona))
                idiomas++;
            if (idiomas == 1) {
                personasUnIdioma.add(persona);
            }
        }
        resultado.add(personasUnIdioma);

        // Personas que dominan todos los idiomas
        HashSet<String> personasTodosIdiomas = new HashSet<>(ingles);
        personasTodosIdiomas.retainAll(frances);
        personasTodosIdiomas.retainAll(aleman);
        resultado.add(personasTodosIdiomas);

        return resultado;
    }
}


/*
 * Tenemos 3 conjuntos de personas que hablan cada idioma (ingles, frances, aleman)
 * Implementar un método estático que dados los tres conjuntos, devuelva un array con los siguientes conjuntos:
 *     a. Personas que hablan al menos inglés
 *     b. Personas que al menos dos idiomas 
 *     c. Personas que solo dominan un idioma
 *     d. Personas que dominan todos los idiomas
 */ 