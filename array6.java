public class array6 {
    public static void main(String args[])
    {   
        // find the biggest element in an array
        int arr[]={12,35,1,10,34,1} ;
        int big=arr[0];
        int sec= arr[1];
        for(int i=0 ; i<arr.length; i++)
        {
               if(big>arr[i+1])
               {
                  big=arr[i];
               }
        }
        System.out.println(big);

        
    }
    
}//      Problem not solved
