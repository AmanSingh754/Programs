import java.util.*;
 
 public class classobj2 
 {
    public static class Student
    {
        String name;
        int roll_no;
        int marks;
    }
   public static void main(String args[])
      {
        Student x = new Student();
        x.name = "Aman";
        x.roll_no = 11;
        x.marks = 96;
        
        System.out.println(x.name);
        System.out.println(x.roll_no);
        System.out.println(x.marks);

     }
 }
