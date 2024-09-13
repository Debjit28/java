public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;  // Number of rows in Floyd's triangle
        int num = 1;

        for (int i = 1; i <= n; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for numbers in each row
                System.out.print(num + " ");
                num++;  // Increment the number for the next position
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
