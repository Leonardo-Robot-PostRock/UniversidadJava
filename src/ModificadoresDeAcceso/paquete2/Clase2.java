package src.ModificadoresDeAcceso.paquete2;

public class Clase2 {
    protected String atributoProtected= "Valor atributo protected";

    //Sólo puede usar este constructor las clases hijas o clases que esten en el mismo paquete
    protected Clase2(){
        System.out.println("Constructor protected");
    }
    public Clase2(String arg){
        System.out.println("Constructor público");
    }

    protected void metodoProtected() {
        System.out.println("Método protected");
    }
}
