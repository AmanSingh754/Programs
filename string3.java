 class ReverseString {

    public static void main(String[] args)
     {
        String a = "Geeks"; 
        String b = "";

         for (int i = a.length() - 1; i >= 0; i--) 
          {
            char ch = a.charAt(i);

            // Convert the character to a String object 
            // using the "Character.toString" method
            String ch1 = Character.toString(ch);
            b = b.concat(ch1);
        }

        System.out.println("" + a);
        System.out.println("" + b);
    }
}