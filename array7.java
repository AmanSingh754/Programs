public class array7 {
    public static void main(String[] args) {
        
        int arr1[]={34,23,12,54,56};
        int arr2[] = { 23,43,54,65,11,23};
        int arr[] = new int[arr1.length + arr2.length];
        System.err.println(arr.length);
        for(int i= 0 ; i<arr1.length ; i++)
        {
               arr[i] = arr1[i];
        }

        for(int i= 0 ; i<arr2.length ; i++)
        {
               arr[arr1.length+i] = arr2[i];
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " " );
        }
        System.out.println();

        for(int i=0 ; i<arr.length -1 ; i++)
        {
            for(int j=0 ; j<arr.length -i-1 ; j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " " );
        } 

    }
    
}
