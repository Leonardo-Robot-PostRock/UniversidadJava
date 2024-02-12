package src.Enumeracion;

public class TesEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Days.MONDAY);
        indicarDiaDeLaSemana(Days.THURSDAY);

        //Enumeración de continentes
        System.out.println("Continente no. 4 " + Continentes.AMERICA);
        System.out.println("Países en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println("Continente no. 1 " + Continentes.AFRICA);
        System.out.println("Países en el 1er continente: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiaDeLaSemana(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("Primer día de la semana");
                break;
            case TUESDAY:
                System.out.println("Segundo día de la semana");
                break;
            case WEDNESDAY:
                System.out.println("Tercer día de la semana");
                break;
            case THURSDAY:
                System.out.println("Cuarto día de la semana");
                break;
            case FRIDAY:
                System.out.println("Quinto día de la semana");
                break;
            case SATURDAY:
                System.out.println("Sexto día de la semana");
                break;
            case SUNDAY:
                System.out.println("Séptimo día de la semana");
                break;
        }
    }
}
