import java.util.Scanner;

class Account
{    
     static int balance;
    public static void deposition(int depositAmount)
    {   
        balance = balance + depositAmount;
        System.out.println("Balance after deposition : Rs "+balance);
    }
    public static void withdrawal(int withdrawalAmount)
    {   
         if(withdrawalAmount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
        balance = balance - withdrawalAmount;
        System.out.println("Balance after withdrawal : Rs "+balance);
        }
    } 

}
public class classobj1 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Current Bank Balance is :   ");
       Account.balance = sc.nextInt();

       Account acc1 = new Account();
        System.out.print("Enter the Deposition Amount:   ");
        int depositAmount = sc.nextInt();
        acc1.deposition(depositAmount);

        System.out.print("Enter the Withdrawal Amount:     ");
        int withdrawalAmount = sc.nextInt(); 
        acc1.withdrawal(withdrawalAmount); 

        sc.close();
    }    
}
