import java.util.Scanner;
public class array4 {
    
    public static void main(String args[])
    {
        int  size ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
         size = sc.nextInt();
         int[] arr = new int[size];
         System.err.println("Take input from User : ");
         for( int i=0 ; i<size ; i++)
         {
            arr[i] = sc.nextInt();
         }
         System.out.println(" Displaying the values");

         for( int i=0 ; i<size ; i++)
         {
           System.out.print(arr[i] + "  ");
         }
         System.out.println();
         int sum=0;
         for( int i=0 ; i<size ; i++)
         {
           sum = sum + arr[i] ;
         }

         System.out.println(sum);
    }
}
