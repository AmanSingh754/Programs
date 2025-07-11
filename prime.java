import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  count=0;
        int n = sc.nextInt();
        for(int i=2 ; i<n/2 ; i++)
        {
                 if(n%i==0)
                 {
                    count++;
                 }
        }
        System.out.println();
       if(count>=1)
       {
            System.out.println("is not prime");
       }
    
           else{
             System.out.println("Is prime");
           }

      sc.close();
    }
}