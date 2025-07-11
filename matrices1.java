import java.util.Scanner;
import java.io.*;
public class matrices1 {
    
    public static void main(String args[])
    {
         int z[][] = new int[2][2];
        int a[][] ={{2,1},
                      {4,3}} ;

        int b[][] = {{7,9},
                        {4,6}} ;
        
         for(int i=0 ; i<2 ; i++)
         {
            for(int j=0 ; j<2 ; j++)
            {
                    z[i][j]=a[i][j] + b[i][j];
            }
         }         
         
         for(int i=0; i<2 ; i++)
         {
            for(int j=0 ; j<2 ; j++)
            {
                System.out.print(z[i][j] + "  ");
            }
         }       



    }
    
}
