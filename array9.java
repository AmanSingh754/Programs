import java.util.*;

public class array9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit in array:-");
        int n=sc.nextInt();
        System.out.println("enter the value in array");
        int arr[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     //   for(int i=0;i<n;i++){
     //       for(int j=i+1;j<n;j++){
      //          if(arr[i]>arr[j]){
      //            temp=arr[i];
       //           arr[i]=arr[j];
       //           arr[j]=temp;
       //         }
       //     }
         Arrays.sort(arr);

      //  }
        System.out.println("shortest array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}