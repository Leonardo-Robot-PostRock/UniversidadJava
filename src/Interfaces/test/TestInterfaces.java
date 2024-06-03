package src.Interfaces.test;

import src.Interfaces.accesoDatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        //IAccesoDatos datos = new IAccesoDatos(); Es abstacta, ya que es una interface. No puede ser instanciada.

        IAccesoDatos datos = new ImplementationMySql();
        IAccesoDatos datos2 = new ImplementationOracle();
        //datos.listar();
        //datos = new ImplementationOracle();

        //datos.listar();
        imprimir(datos);
        imprimir(datos2);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
