public class array8 {
    public static void main(String args[])
    {   
        // find the biggest element in an array
        int arr[]={12,35,12,10,1,10,34,1} ;
        int count=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr.length ; j++)
            if(arr[i]==arr[j])
            {
                count++;
                
            }
            System.out.println(arr[i]+" comes " + count + " time");
            count=0;
           
        }

               //printing the occurences

    }
}
