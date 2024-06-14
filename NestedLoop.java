public class NestedLoop {
    public static void main(String[] args) {
        // Using nested for loops to generate multiplication table
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
