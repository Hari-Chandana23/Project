package additional;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Number should be non-negative.");
        } else {
            BigInteger result = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }

        scanner.close();
    }

    private static BigInteger calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        }
    }
}
