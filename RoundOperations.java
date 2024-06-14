public class RoundOperations {
    public static void main(String[] args) {
        // Initialize the number
        double num = 5.6;

        // Calculate the ceiling value
        double ceil = Math.ceil(num);
        System.out.println("Ceiling of " + num + " is: " + ceil);

        // Calculate the floor value
        double floor = Math.floor(num);
        System.out.println("Floor of " + num + " is: " + floor);

        // Calculate the rounded value
        long round = Math.round(num);
        System.out.println("Rounded value of " + num + " is: " + round);
    }
}
