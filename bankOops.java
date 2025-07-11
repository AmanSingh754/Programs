import java.util.*;

class bankOops
{
   int withdrawal(int withdrawal_amount)
    {
       if (withdrawal_amount> bank_balance)
       {
        System.out.println("Insufficient funds");
        return 0;
       }
       
       else
       {
         bank_balance -= withdrawal_amount;
         System.out.println("The amount after withdrawal is %d",bank_balance);

       }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bank_balance = sc.nextInt();
        System.out.println("The fund available in the bank_account is %d ",bank_balance);

        System.out.println("Enter 1 for withdrawal and 0 for deposit");
        int choice = sc.nextInt();



        sc.close();
    }
}







