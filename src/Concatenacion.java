package src;

public class Concatenacion {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);
        System.out.println(i + j + usuario);
        //Contexto cadena
        System.out.println(usuario + i + j); //Si primero encuentra una cadena lo demás lo tomará como una cadena
        //Para realizar la suma
        System.out.println(usuario +(i + j));//uso de parentesis modifican la prioridad
    }
}
