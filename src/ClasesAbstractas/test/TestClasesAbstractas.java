package src.ClasesAbstractas.test;

import src.ClasesAbstractas.domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); No se pueden instanciar clases abstractas.

        //El compilador sabe que rectangulo es un tipo hijo de FiguraGeometrica
        //por ello no es necesario un casteo.
        FiguraGeometrica figura = new Rectangulo("Rectángulo");
        //Concepto de polimorfismo, se decide si se ejecuta el método de la clase Padre o Hija.
        figura.dibujar();

    }
}
