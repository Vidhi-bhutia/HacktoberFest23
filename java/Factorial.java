import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n >= 0) {
                long factorial = 1;

                for (int i = 1; i <= n; ++i) {
                    factorial *= i;
                }

                System.out.println("Factorial of " + n + " = " + factorial);
            } else {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
