
public class duplicatesinaArray {
    public static void main(String[] args)
     {
        
      int arr[] = {1,2,3,2,6};
      int count=0;
      for(int i=0 ; i<arr.length ; i++)
       {
          for(int j=0 ; j<arr.length ; j++)
          {
             count=0;  
              if(arr[i]==arr[j])
              {
                 count++;
                 if(count>1)
               {
                System.out.println(arr[i]);
               }
              }
          }
       }
    }

    }
