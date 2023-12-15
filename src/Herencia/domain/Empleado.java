package src.Herencia.domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        //Se llama el constructor vacío de arriba.
        this();
        //Se inicializa la variable nombre de la clase padre como si fuera de la clase hija.
        this.nombre = nombre;
        //this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
