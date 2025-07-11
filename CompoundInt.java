import java.util.*;
import java.io.*;

    class CI_Calculator
    {   private double Rate;
        private double Principal;
        private int Year;

    
     public CI_Calculator(double Rate,double Principal , int Year)
     { 
         this.Rate = Rate;
         this.Principal = Principal;
         this.Year = Year;
    }
    public double cal_amount()
    {
  
    double  CI=1;
    for(int i =1 ; i<=Year ; i++)
   {
     CI =(1 + Rate/100)*CI;
   }
     return CI*Principal;
 }
  }

    class CompoundInt
    {
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double  Rate=2;
        System.out.println("Enter the time period in year and Principal :  ");
        int Year = sc.nextInt();
        double Principal = sc.nextInt();

        CI_Calculator calculator = new CI_Calculator(Rate , Principal , Year);

        double total_amount = calculator.cal_amount();
         System.out.println("The total amount will be "+total_amount); 
         sc.close();
    }

}
