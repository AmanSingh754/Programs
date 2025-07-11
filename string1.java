public class string1 {
    public static void main(String args[])
      {
        
        String first ="Aman";
        String Second = "Singh";
        System.out.println(first.length());

        String part = Second.substring(0,3);


    System.out.println(part);
// compareTo function
    if(first.compareTo(Second)==0)
 {
    System.out.println("Strings are equal");
 }
    else if(first.compareTo(Second)>0)
 {
    System.out.println("first string is greater than second");
 }
    else
 {
    System.out.println("Second string is greater than First");
 }

    }
}
