public class Recursion2 {

    

    public static int printn(int limit)
    {    
        if(limit==1)
        {
          return 1;
        }
       
        int  sum = limit + printn(limit -1) ; 
        return sum;
    }

    public static void main(String[] args)
    {
        int limit = 5;
        int total_Sum =  printn(limit);
        System.out.println("Total sum of integers upto n :"+total_Sum);
           
    }
}
