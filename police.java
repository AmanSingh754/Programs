import java.util.*;

public class police
{
    public static void main(String[] args)
     {

    Scanner sc = new Scanner(System.in);
    int num[] = {-1 ,-1, 2, -1, -1 ,-1, -1, -1, -1, -1 ,-1 };
    int count=0;
   //py if(num[0]==-1)  count=1;
    for(int i=0 ; i<num.length-1 ; i++)
    {
        if(num[i]==-1 && num[i+1]==-1)
        {
            count++;
        }
    }
    System.out.println("The number of all the thieves ran away are:  "+count);
    sc.close();
 }

}