import java.util.*;
public class selectionsort {

    public static void printarr(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {23,71,12,88,67};
      //  System.out.println(arr.length);

        for(int i=0 ; i<arr.length ; i++)
        {
           int smallest = i;
           for(int j= i+1 ; j<arr.length ; j++ )
           {
               if(arr[j]<arr[smallest])
               {
                  smallest = j;
               }
           }
               int temp = arr[smallest];
               arr[smallest]= arr[i];
               arr[i]= temp;
        }

        printarr(arr);
    }
    
}
