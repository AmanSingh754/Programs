import java.util.*;

class XoR 
{
    public static void main(String[] args)
    {
        
        System.out.println("Enter the integer");
        int value=0;
      
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1 ; i<=num ; i++)
        {
           value = value^i;
           
           System.out.println(value);
        }
        sc.close();
       
    }
}