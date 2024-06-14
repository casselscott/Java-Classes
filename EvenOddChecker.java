import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Prompt the user to enter an integer
        try ( // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter an integer
            System.out.println("Enter an integer:");
            int number = scanner.nextInt();
            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
            // Close the scanner
        }
    }
}
