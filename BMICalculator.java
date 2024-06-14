import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to determine BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        // Prompt user for weight and height
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for weight and height
            System.out.println("Enter your weight in kilograms:");
            double weight = scanner.nextDouble();
            
            System.out.println("Enter your height in meters:");
            double height = scanner.nextDouble();
            
            // Calculate BMI
            double bmi = calculateBMI(weight, height);
            
            // Determine BMI category
            String category = getBMICategory(bmi);
            
            // Display results
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are classified as: " + category);
        }
    }
}
