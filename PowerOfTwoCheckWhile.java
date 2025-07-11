import java.util.Scanner;

public class PowerOfTwoCheckWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is NOT a power of 2");
        } else {
            boolean isPowerOfTwo = true;
            while (n > 1) {
                if (n % 2 != 0) {
                    isPowerOfTwo = false;
                    break;
                }
                n = n / 2;
            }
            if (isPowerOfTwo) {
                System.out.println("Power of 2");
            } else {
                System.out.println("NOT a power of 2");
            }
        }

        sc.close();
    }
}
