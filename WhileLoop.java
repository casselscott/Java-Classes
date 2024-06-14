import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = scanner.nextInt();
            int sum = 0;
            int i = 1;
            
            // Using while loop to find the sum of numbers from 1 to N
            while (i <= n) {
                sum += i;
                i++;
            }
            
            System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        }
    }
}
