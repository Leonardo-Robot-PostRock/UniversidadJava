package src.ModificadoresDeAcceso.ClaseHija;

import src.ModificadoresDeAcceso.paquete2.Clase2;

public class ClaseHija extends Clase2 {
    public ClaseHija() {
        super(); //Uso del constructor protected de la clase padre
        this.atributoProtected = "Modificación atributo protected";
        System.out.println("atributoProtegido = " + this.atributoProtected);
        this.metodoProtected();
    }
}
