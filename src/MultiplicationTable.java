//TASK2
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%2d * %2d = %3d   ", i, j, result);
            }
            System.out.println();
        }
    }
}
