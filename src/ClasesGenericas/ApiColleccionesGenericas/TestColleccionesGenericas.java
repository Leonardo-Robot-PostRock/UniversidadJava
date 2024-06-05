package src.ApiCollecciones.test;

import java.util.*;

public class TestCollecciones {
    public static void main(String[] args) {
        //El método add() esta definido en la interface padre, es decir en Collection.


        List miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");

        imprimir(miLista);
        System.out.println("\n");
//        for (Object list : miLista) {
//            System.out.println("elemento = " + list);
//        }

        //funciones lambda o funciones flecha
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

        //No se respeta el orden para agregar objetos. Aunque es más rápido para agregarlos.
        //No se puede duplicar elementos.
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");

        imprimir(miSet);

        System.out.println("\n");

        //No se hereda de la interface collection, se hereda de la interface Map.
        //Llave - valor
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Leo");
        miMapa.put("valor2", "Luci");
        miMapa.put("valor3", "Batman");

        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection collection) {
//        for (Object elemento : collection) {
//            System.out.println("elemento = " + elemento);
//        }
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
