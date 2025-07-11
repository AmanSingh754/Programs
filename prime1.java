import java.util.*;
    class prime1
    {
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i=2 ; i<Math.sqrt(num) ; i++)
        {
            if(num%i==0)
            {
                System.out.println("It is not a prime number");
                return;
            }
        }
       sc.close();
       System.out.println("Prime");
       


    }
}