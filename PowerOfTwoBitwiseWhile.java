import java.util.Scanner;

public class PowerOfTwoBitwiseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("NOT a power of 2");
        } else {
            while ((n & 1) == 0) {  
                n = n >> 1;         
            }

            if (n == 1) {
                System.out.println("Power of 2");
            } else {
                System.out.println("NOT a power of 2");
            }
        }

        sc.close();
    }
}
