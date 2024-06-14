import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Prompt the user to enter the count of numbers
        try ( // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the count of numbers
            System.out.println("Enter the count of numbers:");
            int count = scanner.nextInt();
            // Prompt the user to enter each number
            System.out.println("Enter " + count + " numbers:");
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += scanner.nextInt();
            }   // Calculate the average
            double average = (double) sum / count;
            // Display the average
            System.out.println("Average of the entered numbers: " + average);
            // Close the scanner
        }
    }
}
