public class Exponential {
    public static void main(String[] args) {
        
        // Exponential and logarithmic functions
        double expValue = 1;
        System.out.println("e to the power of " + expValue + " is: " + Math.exp(expValue));
        double logValue = 10;
        System.out.println("Natural logarithm of " + logValue + " is: " + Math.log(logValue));
        System.out.println("Base 10 logarithm of " + logValue + " is: " + Math.log10(logValue));

        // Random number
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());
    }
}
