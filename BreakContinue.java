public class BreakContinue {
    public static void main(String[] args) {
        // Using break to exit the loop when i equals 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i is: " + i);
        }

        System.out.println("----");

        // Using continue to skip the current iteration when i equals 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i is: " + i);
        }
    }
}
