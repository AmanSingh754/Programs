import java.util.*;
class recursion3
{

  void recursion(int n)
    {
         if(n==0)
        {
            return ;
        }
        System.out.println(n);
        
        recursion(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        recursion3 obj = new recursion3(); 
        System.out.println("ALL the numbers are");
        obj.recursion(n);                  
        sc.close();

    }
}