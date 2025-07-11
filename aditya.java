import java.util.*;

public class aditya
{
    public static void main(String args[])
    {
       int arr[] = {3,2,3};
       int size = arr.length;
       
       int count=0;
       for(int i=0 ; i< size ; i++ )
       {
          count = 0;
         for(int j=0 ; j<size ; j++)
         {
              if (arr[i]==arr[j])
              {
                count++;
              }
         }
               if(count > size/2)
             {
               System.out.println("The Winner is "+arr[i]);
               return ;
             } 
       }
    }
}
