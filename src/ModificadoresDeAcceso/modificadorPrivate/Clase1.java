package src.ModificadoresDeAcceso.modificadorPrivate;

public class Clase1 {
    private String atributoPrivado = "Valor atributo privado";

    private Clase1() {
        System.out.println("Constructor privado");
    }

    public Clase1(String param){
        this();
        System.out.println("Constructor público");
    }

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
