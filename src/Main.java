import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;

//TASK1
/*
public class Main {

    public static void main(String[] args) {
        int sum;
        int product;
        int quotient;
        int maximum;
        double middleValue;
        int a = 10;
        int b = 5;

        // Calculate the sum, product, quotient, maximum,
        sum = a + b;
        product = a * b;
        quotient = a / b;
        maximum = Math.max(a,b);
        middleValue = (double) (a + b) / 2;

        // Printing results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Quotient: %d%n", quotient);
        System.out.printf("Maximum: %d%n", maximum);
        System.out.printf("Middle Value: %.2f%n", middleValue);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        // Calling the add method
        int resultSum = add(5, 3);
        int resultProduct = product(4,5);
        int resultQuotient = quotient(10,2);
        int resultMax = max(18, 23);
        int resultMiddleValue = middleValue(10, 6);

        // Printing the result
        System.out.println("Sum: " + resultSum);
        System.out.println("Product: " + resultProduct);
        System.out.println("Quotient: " + resultQuotient);
        System.out.println("Max: " + resultMax);
        System.out.println("Middle Value: " + resultMiddleValue);
    }
    // The add method
    public static int add(int a, int b) {
        return a + b;
    }
    public static int product(int a, int b) {
        return a * b;
    }
    public static int quotient(int a, int b) {
        return a / b;
    }
    public static int max(int a, int b) {
        return Math.max(a,b);
    }
    public static int middleValue(int a, int b) {
        return (a+b) /2;
    }

}
