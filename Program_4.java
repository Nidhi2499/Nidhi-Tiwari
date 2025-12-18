public class Program_4 {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

        System.out.print("{ ");

        for (int i = 1; i <= 9; i++) { // loop for incrementing i from 1 to 9
            int count = 0;

            for (int num : numbers) { // loop to check numbers in the list that are divisible by i
                if (num % i == 0) {
                    count++;
                }
            }
            System.out.print(i + ":" + count); // print i and its multiples in the given list
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }
}
