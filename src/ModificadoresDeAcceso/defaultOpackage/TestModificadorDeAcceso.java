package src.ModificadoresDeAcceso.defaultOpackage;

public class TestModificadorDeAcceso {
    public static void main(String[] args) {
        ClaseDefault claseDefault = new ClaseDefault();

        claseDefault.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseDefault atributo default: " + claseDefault.atributoDefault);
        claseDefault.metodoPackage();
    }
}
