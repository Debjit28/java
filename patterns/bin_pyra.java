public class bin_pyra{
    public static void main(String[] args) {
        int n = 5;  // Number of rows in the binary pyramid

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num = 1 - num;  // Toggle between 1 and 0
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
