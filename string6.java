public class string6
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        System.out.println(str);
        
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        //or
        String str2 = "Aman Singh";
        System.out.println(str2);
        StringBuilder sb2 = new StringBuilder(str2);
        System.out.println(sb2.reverse());
    }
}

// A program to reverse a string