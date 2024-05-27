package src.ModificadoresDeAcceso.defaultOpackage;

public class ClaseHija extends ClaseDefault {

    public ClaseHija(){
        super();
        this.atributoDefault = "Modificación atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoPackage();
    }
}
