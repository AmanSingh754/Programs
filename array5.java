import java.util.Scanner;
import java.io.*;

public class array5 {
    public static void main(String args[])
    {   
        int sum=0;
        int arr[] = {0,1,2,3,4};
        int newarr[] = new int[5];
        for(int i=0 ; i<arr.length ; i++)
        {
              sum = arr[i] + sum;
              newarr[i] = sum;
        }
         System.out.println(" First array is ");
        for(int i=0 ; i<arr.length ; i++)
        {
              System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println(" The updated array is ");
        for(int i=0 ; i<arr.length ; i++)
        {
              System.out.print(newarr[i] + " ");
        }
    }
    
}
