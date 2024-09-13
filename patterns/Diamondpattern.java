public class Diamondpattern {
    public static void main(String[] args) {
        int n = 5;  // Number of rows in the upper half

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond (excluding the middle row)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
