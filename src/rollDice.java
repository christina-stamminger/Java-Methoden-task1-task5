import java.util.Scanner;

//TASK 5
public class rollDice {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of dice roll: ");
            int numberOfRolls = scanner.nextInt();
            //validation for a positive number
            if (numberOfRolls <= 0) {
                System.out.println("Please enter a positive number of rolls!");
                return;
            }
            // Simulate rolling the die the specified number of times
            System.out.println("Results of dice rolls:");
            for (int i = 0; i < numberOfRolls; i++) {
                int result = rollDie();
                System.out.println("Roll " + (i + 1) + ": " + result);
            }
            //Close the scanner()
            scanner.close();
        }
        // Simulate rolling a six-sided die
        public static int rollDie() {
            return (int) (Math.random() * 6) + 1;
        }
}
