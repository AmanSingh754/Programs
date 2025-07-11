import java.util.*;

class armstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = sc.nextInt();
        int num1=num;
        int rem=0,arm=0;
        while(num!=0)
        {
            rem = num%10;
            arm = rem*rem*rem + arm;
            num /=10;
        }
        if(arm==num1)
        {
         System.out.println("It is an armstrong number");   
        }
        else{
           System.out.println("It is not an armstrong number");
        }

        sc.close();
       
    }
}