import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Prompt the user to enter a positive integer
        try ( // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a positive integer
            System.out.println("Enter a positive integer:");
            int n = scanner.nextInt();
            // Initialize the sum variable
            int sum = 0;
            // Use a for loop to calculate the sum of numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                sum += i; // Add the current value of i to the sum
            }   // Display the result
            System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
            // Close the scanner
        }
    }
}
