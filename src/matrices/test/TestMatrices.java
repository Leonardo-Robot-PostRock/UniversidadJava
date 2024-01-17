package src.matrices.test;

import src.matrices.domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];

        edades[0][0] = 5;
        edades[0][1] = 7;

        edades[1][0] = 8;
        edades[1][1] = 4;

        edades[2][0] = 20;
        edades[2][1] = 25;

        System.out.println("edades " + edades[0][0]);
        System.out.println("edades " + edades[0][1]);

        for (int row = 0; row < edades.length; row++) {
            for (int column = 0; column < edades[row].length; column++) {
                System.out.println("edades " + row + "-" + column + ": " + edades[row][column]);
            }
        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora"}};

//        for (int i = 0; i < frutas.length; i++) {//renglones
//            for (int j = 0; j < frutas[i].length; j++) {//Columnas
//                System.out.println("Frutas " + i + "-" + j + ": " + frutas[i][j]);
//            }
//        }

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Benjamín");

        personas[1][0] = new Persona("Diego");
        personas[1][1] = new Persona("Leonardo");
        personas[1][2] = new Persona("Julieta");

        imprimir(frutas);
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {//renglones
            for (int j = 0; j < matriz[i].length; j++) {//Columnas
                System.out.println("Frutas " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}
