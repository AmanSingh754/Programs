import java.util.*;

public class pattern5
    {
        public static void main(String args[])
        {

           int i,j,num=5;
           for(i=1 ; i<=num ; i++)
           {
            for ( j=5 ; j>i ; j--)
            {
                System.out.print("  ");
            }for (int k=1 ; k<=i ; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
           }
        }
    }
    

