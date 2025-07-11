import java.util.*;
class bearCodeforces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :  ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count=0;

     while(a<=b)
     {
        b = b*2;
        a = a*3;
        count++;
     }
       System.out.println(count);
        sc.close();
    }
}
