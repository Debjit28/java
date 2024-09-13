public class gcd {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + a);
    }
}
