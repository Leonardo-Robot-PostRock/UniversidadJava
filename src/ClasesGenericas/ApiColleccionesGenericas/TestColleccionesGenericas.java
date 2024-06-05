package src.ClasesGenericas.ApiColleccionesGenericas;

import java.util.*;

public class TestColleccionesGenericas {
    public static void main(String[] args) {

        //La API Collections soporta tipos genéricos, para que
        //en tiempo de compilación se pueda indicar el tipo y tener validación de los elementos que se agregan.
        //Usar genéricos, da la posibilidad de acceder a los métodos del tipo especificado.
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elementoString = miLista.get(0); //Ya no es necesario hacer una conversión.
//        System.out.println("elemento = " + elementoString);
//
//        System.out.println("\n");
//
//        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");

        imprimir(miSet);

        System.out.println("\n");

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Leo");
        miMapa.put("valor2", "Luci");
        miMapa.put("valor3", "Batman");

//        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> collection) { //Si se desea ser genérico -> Collection<Object> ...
//        collection.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//            // Usar genéricos, permite acceder a métodos de la clase String, en este caso particular.
//            //System.out.println("elemento = " + elemento.toLowerCase());
//        });

        //Gracias a la sintaxis de genéricos se tiene acceso al tipo String.
        for (String elemento : collection) {
            System.out.println("elemento = " + elemento);
        }
    }
}
