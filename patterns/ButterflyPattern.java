import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n ;  // You can change this value to increase or decrease the size of the butterfly.
        System.out.println("enter the value of n (limit)");
        n=sc.nextInt();
        sc.close();

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
