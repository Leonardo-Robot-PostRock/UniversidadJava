package src.Interfaces.accesoDatos;

//Se puede extender de otras interfaces. También existe la herencia.
public interface IAccesoDatos {
    //Las variables son una constante, deben tener un valor asignado obligatoriamente.
    //Características: public, static y final.
    int MAX_REGISTRO = 10;

    void insertar();
    void listar();
    void actualizar();
    void eliminar();

}
