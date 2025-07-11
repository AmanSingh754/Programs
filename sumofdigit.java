// find the sum of digits in a number 
import java.io.*;
import java.util.*;

class sumofdigit 
{
    public static void main(String args[])
    {
        int num,rem,sum =0;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number");
        num = sc.nextInt() ;
        while(num>0)
        {
          rem =  num % 10;  
           sum = sum + rem ;
           num = num/10;
        };
       System.out.println("Sum of the digits =   "+sum ); 
    }

}
