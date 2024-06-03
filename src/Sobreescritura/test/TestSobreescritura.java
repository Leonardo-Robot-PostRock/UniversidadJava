package src.Sobreescritura.test;

import src.Sobreescritura.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("gerente 1:\n" + gerente1.obtenerDetalles());
    }
}
