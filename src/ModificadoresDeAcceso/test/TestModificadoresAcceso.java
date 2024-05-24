package src.ModificadoresDeAcceso.test;

import src.ModificadoresDeAcceso.ClaseHija.ClaseHija;
import src.ModificadoresDeAcceso.paquete1.Clase1;
import src.ModificadoresDeAcceso.paquete2.Clase2;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
//        No se puede utilizar constructor protected en otra clase
//        Clase2 clase2 = new Clase2();
        Clase2 clase2 = new Clase2("Público");


        System.out.println("clase1: " + clase1.atributoPublico);
        //tampoco se puede acceder a atributo protegido
        //System.out.println("clase1: " + clase2.atributoProtected);

        clase1.metodoPublico();

        ClaseHija claseHija = new ClaseHija();

        System.out.println("claseHija = " + claseHija);

    }
}
