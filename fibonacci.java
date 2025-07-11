import java.util.Scanner;

public class fibonacci{
    public static void main(String args[])
    {
     //   int a=0,b=1,sum=0,num=0;
     //   System.out.print(a+ "  ");
     //   while(num<20)
     //   {
     //       sum = a+b;
     //       System.out.print(sum + "  ");
     //       a=b;
      //      b=sum ;
      //      num++;
      //  }

     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int c=0;
     int a=0;
     int b=1;
     System.out.println(a);
     System.out.println(b);
     for(int i=0 ; i<=n-2; i++)
     {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
     }
        
    }
}
/*Alapuzha
Ernakulam
Kannur
Kottayam
Kollam
Malapuram
Palakad
Thrissur
Thiuvananthpuram
Calicut
Pathanamthitta
kasargod
Wayanad
Idukki
*/
