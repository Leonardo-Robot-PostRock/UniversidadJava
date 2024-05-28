package src.ModificadoresDeAcceso.modificadorPrivate;

public class ClaseHija extends Clase1{
    public ClaseHija(){
        super("Publico");
        //No se puede acceder al constructor privado, atributos y metodos.
        //super();
        //this.atributoPrivado = "Modificación de método privado";
        //System.out.println("atributoDefault = " + this.atributoDefault);
        //this.metodoDefault();
    }

}
