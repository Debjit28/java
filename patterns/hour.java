import java.util.Scanner;

public class hour{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hourglass pattern: ");
        int rows = scanner.nextInt();
        scanner.close();
        
        // Top half of the hourglass
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Bottom half of the hourglass
        for (int i = 1; i < rows; i++) {
            // Print leading spaces
            for (int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
