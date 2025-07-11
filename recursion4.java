import java.util.*;
class recursion4
{
   void recursion(int n)
    {
         if(n==1)  return ;
    
        System.out.print(n+" ");
         recursion(n-1);
 }
     int k=0;
    void goback(int k,int n) 
    {
         if(k==n+1)
        {
            return ;
        }
        System.out.print(k+" ");
        goback(k+1,n);
}  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        recursion4 obj = new recursion4(); 
        System.out.println("ALL the numbers are: ");
        obj.recursion(n);
        obj.goback(1 ,n);
        sc.close();

    }
}