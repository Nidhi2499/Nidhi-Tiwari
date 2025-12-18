import java.util.Scanner;

class Calculator {

    // Method to perform calculation
    public double calculate(double a, double b, String operation) {

        switch (operation) {
            case "add": // addition operation
                return a + b;

            case "sub": // subtraction operation
                return a - b;

            case "mul": // multiplication operation
                return a * b;

            case "div": // division operation
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");// divide by zero error check
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation type.");
                return 0;
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        sc.nextLine(); // clear buffer

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a, b, operation); // performing and storing result in double

        System.out.println("Result = " + result); // Display result
        sc.close();
    }
}