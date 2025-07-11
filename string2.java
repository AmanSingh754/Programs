// checking a string is palindrome or not 

import java.util.Scanner;
import java.io.*;
public class string2 {
    public static void main(String args[])
    {
         String s = "Madam"   ;
         String t = "" ;
         char ch;
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();   
          for(int i=0 ; i<s.length(); i++)
          {
             ch = s.charAt(i) ;
             t = ch + t;

          }
          System.out.println(t);
         
         if(s.equals(t))
         {
            System.err.println("The string is palindrome ");
         }
         else
         {
            System.out.println("The string is not Palindrome");
         }
    }
    
}
