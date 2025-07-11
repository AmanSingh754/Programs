import java.util.*; 
public class array3 {
    public static void main(String args[])
    {
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Columns :    ");
        row = sc.nextInt();
        col = sc.nextInt();

        int[][]  marks = new int[row][col];
        System.out.println("Enter all the elements : ");
        for(int i=0 ; i<row; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                marks[i][j]= sc.nextInt();
            }
        }
       System.out.println("All the elements of the matrix are :  ");
        for(int i=0 ; i<row; i++)
        {
            for(int j=0 ; j<col; j++)
            {
               System.out.print(marks[i][j] + "  ");
            }
            System.out.println();
        }

        
    }
    
}
