import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt(); // asking to an input a number

        for (int i = 1; i <= a; i++) { // loop to print as many odd numbers as the input number
            System.out.print((2 * i - 1) + ", ");
        }
        sc.close();
    }
}
