
public class startend {
    public static void main(String args[])
    {   
        int target = 8;
        int[] arr = {5,7,7,8,8,10};
        int[] nums = {-1 , -1};

        for(int i=0 ; i<arr.length ; i++)
        {
            
            if(arr[i]==target)
            {
                System.out.println(i);
                System.out.println(i+1);
                break;
            }
           
        }
  
           
            

    }
}
