public class RhombusPattern {
    public static void main(String[] args) {
        int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
