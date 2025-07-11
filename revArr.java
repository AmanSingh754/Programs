
public class revArr
{
     public static void main(String[] args)
     {
        int arr[] = { 1,2,3,4,5,6};
        int n = arr.length;
        int temp=0;
        for(int i=0 ; i<n/2 ; i++)
        {
                temp = arr[i];
                arr[i] = arr[n-1-i];
                arr[n-1-i] = temp;
        }


        System.out.println("All the values are :   ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println(arr[i]);
        } 

     }
}