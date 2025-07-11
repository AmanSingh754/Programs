import java.util.*;
class watermelon
{
    public static String main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :  ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++)
      {
            for(int j=1 ; j<=n ; j++)         
           {
                 if(i%2==0 && j%2==0)
                 {
                 
                     if(i+j==0)
                     {
                        return "YES";
                     }
                 }
           } 
       }
      
       return "No";
    }
}