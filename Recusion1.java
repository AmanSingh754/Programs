public class Recusion1 {

    public static void recursive(int n)
    {
        System.out.println(n);
       
        if (n==1)
        {
            return ;
        }
      recursive(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        recursive(n);
         return;
    }
}
