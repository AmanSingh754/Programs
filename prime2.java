import java.util.*;
public class prime2
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
         int count=0;
        for(int i=2 ; i<n1 ; i++)
        {
            if(n1%i!=0)
            {
                count++;
            }
        }
        int count2=0;
         for(int j=2 ; j<n2 ; j++)
        {
            if(n2%j!=0)
            {
                count2++;
            }
        }
        int final1 = count2 - count;
        System.out.println(final1);
        sc.close();


    }
}