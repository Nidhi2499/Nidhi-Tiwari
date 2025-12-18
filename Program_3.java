import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a; // Ensure count is odd in order to print odd numbers

        int number = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(number + ", ");
            number += 2;
        }

        sc.close();
    }
}
