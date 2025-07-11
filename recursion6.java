import java.util.*;
public class recursion6
{
    void prime(int n)
    {
        int i = n-1;
        int count =0;
        if(i==n) return;
        if(n%i!=0)
          {
            count++;
          }
          i++;
          prime(n);
 }
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        recursion6 obj = new recursion6();
        obj.prime(num1);
       
        int final1 = count;
        count=0;
         obj.prime(num2);
         int final2= count;
         int total = final2 - final1;
         System.out.println(total);

        sc.close();
    }
}