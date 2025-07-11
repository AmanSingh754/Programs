public class KadanesAlgorithm2 
{

      public static void main(String[] args) {
       int sum = 0;
        int max1 = Integer.MIN_VALUE;
        int[] num = {2,5,-3,0,2};
        for(int i=0 ; i<num.length ; i++)
        {
            sum = sum + num[i];
             max1 = Math.max(max1 , sum);
            if(sum<0)
            {
                sum =0;
            }
        }
        System.out.println(max1);
    }
}