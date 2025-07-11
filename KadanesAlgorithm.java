
public class KadanesAlgorithm
 {
    public static void main(String[] args) {
       
        int max1 = Integer.MIN_VALUE;
        int[] num = {2,5,-3,0,2};
        for(int i=0 ; i<num.length ; i++)
        {
            int sum = 0;
            for(int j=i ; j<num.length ; j++)
            {
                sum += num[j];
                max1 = Math.max(max1 , sum);
            }
    
        }

         System.out.println(max1);
    }    
   
}
