import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            
            // Using do-while loop to repeatedly ask for a number until 0 is entered
            do {
                System.out.println("Enter a number (0 to exit):");
                number = scanner.nextInt();
                if (number != 0) {
                    System.out.println("You entered: " + number);
                }
            } while (number != 0);
            
            System.out.println("Program terminated.");
        }
    }
}
