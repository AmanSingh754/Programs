import java.util.Scanner;
import java.io.*;


public class function3 { 
    int calcPow(int a , int b )
    {  int i , pow =1;
        for(i=1 ; i<=b ; i++)
        {
            pow = a * pow ;
        }
        return pow;
    }

    public static void main(String args[])
    {
        int a,b,pow ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        pow = calcPow(a,b);
        System.out.println("The power of a is b");
       System.out.println("The Value " +a+" "+b+" "+pow);
       
    }
    
}
