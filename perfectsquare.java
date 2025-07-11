import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :  ");
        int n = sc.nextInt();

      for(int i=1 ; i<=n/2 ; i++)
      {
        if(i*i == n)
        {
            System.out.println("Is a Square");
        }
      }
       
             System.out.println("Not a square");
        

      sc.close();
    }
}