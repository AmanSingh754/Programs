import java.util.*;

// This is for single level inheritance
class Inheritance1
{
    Inheritance1()
    {
        System.out.println("I am the parent class");
    }
   
}

class Child extends Inheritance1
{
     Child()
     {
    System.out.println("I am the child class");
     }
   public static void main(String args[])
    {
        Child ch1 = new Child();
     
    }
}