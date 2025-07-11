import java.util.Scanner;

public class switchcase {
    public static void main(String args[])
    {
        int select,rad,side;
        double pi=3.14 ,area;
        System.out.println("Select the correct Option");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select) {
            case 1:
                     rad = sc.nextInt();
                      area = pi*rad *rad;
                     System.out.println("Area of Circle :" + area);
                 break;

            case 2: System.out.println("Paralellogran"); 
                 break; 

            case 3: side = sc.nextInt();
                    area = side * side;
                    System.out.println("Area of Square :"+ area);
                    break;

            case 4: System.out.println("Nothing"); 
             break;
            default :
                  System.out.println("Wrong Option"); 
        }

    }
    
}
