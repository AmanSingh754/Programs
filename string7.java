// A program to remove the dupilcate characters from a string
public class string7
{
    public static void main(String[] args)
    {
          String str = "programming";
          System.out.println(str);
          StringBuilder result = new StringBuilder();
          str.chars().distinct().forEach(c-> result.append((char)c));
          System.out.println(result);

          //or another way 

          String str2 ="Hello World";
          System.out.println(str2);
          StringBuilder sb2 = new StringBuilder();
            for(int i=0 ; i<str.length() ; i++)
            {
                char ch = str2.charAt(i);
                int idx = str2.indexOf(ch , i+1);
                if(idx ==-1)
                {
                    sb2.append(ch);
                }
            }
            System.out.println(sb2);
    }
}