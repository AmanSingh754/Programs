import java.util.*;

class leapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        if(year%4==0 )
        {
              System.out.println("It is a leap year");
        }
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("It is a leap year");
            }
        }
    }
}