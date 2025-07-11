import java.util.Scanner;

public class qdtcEqn {
    public static void main(String[] args) {
        int a,b,c,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ,b ,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    
        if(b*b - 4*a*c > 0)
        {
          System.out.println("All Solutions are Real");
        }
        else if(b*b- 4*a*c < 0)
        {
           System.out.println("All Solutions are imaginary");   
        }
        else
        {
             System.out.println("Roots are real and equal");
        }

        

    }
    
}
