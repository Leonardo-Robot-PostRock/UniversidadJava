package src;

public class tipoBoolean {
    public static void main(String[] args) {
        boolean varBoolean = true; //false
        System.out.println("varBoolean = " + varBoolean);

        if(varBoolean){
            System.out.println("La bandera es verdera");
        }else {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;
        var esAdulto = edad >=18;// o edad >= 18 en condición.
        if (esAdulto){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

    }
}
