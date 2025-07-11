import java.util.*;

// Example of multilevel inheritance
class Parents
{
  Parents()
  {
 System.out.println("GrandFather");
  }
}

class Father extends Parents
{
  Father()
  {
 System.out.println("Father");
  }
}

class Inheritance3  extends Father
{
    Inheritance3()
    {
        System.out.println("Child");
    }
    public static void main(String[] args) {
        
        Inheritance3 ch1 = new Inheritance3();
        System.out.println(ch1);

    }
}