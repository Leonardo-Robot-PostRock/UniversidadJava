package src.matrices.test;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];

        edades[0][0] = 5;
        edades[0][1] = 7;

        edades[1][0] = 8;
        edades[1][1] = 4;

        edades[2][0] = 20;
        edades[2][1] = 25;

        System.out.println("edades " + edades[0][0]);
        System.out.println("edades " + edades[0][1]);

        for (int row = 0; row < edades.length; row++) {
            for (int column = 0; column < edades[row].length; column++) {
                System.out.println("edades " + row + "-" + column + ": " + edades[row][column]);
            }
        }
    }
}
