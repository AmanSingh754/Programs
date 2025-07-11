//Enter 3 numbers from user and make a function to 
//find the average of three numbers
import java.io.*;
import java.util.Scanner;

public class function1{
    int CalcAverage(int a , int b, int c){
          int  avg = (a+b+c)/3 ;
          return avg;
    }
    public static void main(String args[])
    {
         int a,b,c, average ;
         function1 obj=new function1();
         Scanner sc = new Scanner(System.in);
          a = sc.nextInt();
          b = sc.nextInt();
          c = sc.nextInt();

         average = obj.CalcAverage(a,b,c);
         System.out.println("The average of these number is: "+average);

    }
}
