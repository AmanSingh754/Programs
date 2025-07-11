// container with most water
// Solved by the brute force approach
class leetcode11 {
    public static void main(String[] args)
    {
        int[] height = {2,4,2,3,1};
        int high = Integer.MIN_VALUE ;
        int area = 1;
        int length= 0 ;
        int breadth = 0;
        int n = height.length;
        for(int i=0 ; i<n ; i++)
        {
           for(int j = i +1 ; j< n ; j++)
          {      
                length = (j - i) ;
                breadth = Math.min(height[i], height[j]);
                area = breadth * length ;
                high = Math.max(high , area);
        }
    }
               System.out.println(high);
    }
}