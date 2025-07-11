import java.util.*;
public class array2 {
   public static void main(String args[])
   {     int size;
       
       Scanner sc = new Scanner(System.in);
        size = sc.nextInt();  

        int[] marks = new int[size] ;  
        for(int i = 0; i<size  ; i++)
        {
            marks[i] = sc.nextInt();
        }

        for(int i = 0 ; i<size  ; i++)
        {
            System.out.println(marks[i]);
        }
        
   }   
}
