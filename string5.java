public class string5
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        System.out.println(str);
        for(int i=str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}

// A program to reverese a string