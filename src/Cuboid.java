public class Cuboid {
    public static void main(String[] args) {

        //Volume
        int volume = cuboidVol(3, 4, 5);
        System.out.println("Volumen: " + volume);

        //Surface
        int resultSurface = surface (2,4,6);
        System.out.println("Surface: " + resultSurface);

        //Length of room diagonal
        double diagonalLength = cuboidDiagonalLength(2,4,6);
        System.out.println("Length of room diagonal: " + diagonalLength);
    }
    public static int cuboidVol(int a, int b, int c) {
        //volume calculation
        return a * b * c;
    }

    public static int surface (int a, int b, int c) {
        //surface
        return 2 * (a * b + b * c + c * a);
    }

    public static double cuboidDiagonalLength (int a, int b, int c) {
        //Länge der Raumdiagonale /length of room diagonal
        return Math.sqrt(a*a + b*b + c*c);
    }
}
