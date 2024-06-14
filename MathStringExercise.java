import java.util.Scanner;

public class MathStringExercise {
    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of a triangle
    public static double calculateTrianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1: Mathematical Functions
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double circleArea = calculateCircleArea(radius);
        System.out.println("Area of the circle: " + circleArea);

        System.out.println("Enter the lengths of the sides of the triangle:");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        double trianglePerimeter = calculateTrianglePerimeter(sideA, sideB, sideC);
        System.out.println("Perimeter of the triangle: " + trianglePerimeter);

        // Part 2: String Manipulation
        System.out.println("Enter a string:");
        scanner.nextLine(); // Consume newline
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}
