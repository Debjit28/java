public class pascal {
    public static void main(String[] args) {
        int n = 5;  // Number of rows in Pascal's Triangle

        for (int i = 0; i < n; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Calculate the next number in the row
                number = number * (i - j) / (j + 1);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
