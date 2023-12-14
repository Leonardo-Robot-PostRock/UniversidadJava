package src.Herencia.Test;

import src.Herencia.domain.Cliente;
import src.Herencia.domain.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Leonardo", 3000);
        System.out.println("empleado1 = " + empleado1);

        Date currentDate = new Date();

        Cliente cliente = new Cliente("Yamila", currentDate, true);
        System.out.println("cliente = " + cliente);
    }
}
