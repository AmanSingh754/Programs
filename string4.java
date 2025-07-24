public class string4
{
    public static void main(String args[])
    {
        String str = "hello";
        System.out.println(str);
        char[] charArray = str.toCharArray();
        for (int i=charArray.length - 1; i >= 0; i--) 
        {
            System.out.print(charArray[i]);
        }

    }
}

// A program to reverse a string