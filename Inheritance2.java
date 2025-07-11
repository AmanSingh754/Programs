import java.util.*;

// Example of multiple inheritance
 interface Father {
   default void showFather()
    {
        System.out.println("I am the Father");
    }
}

  interface Uncle
{
   default void showUncle()
    {
        System.out.println("I am the Uncle");
    }
}

class Inheritance2 implements Father , Uncle
{
      Inheritance2()
    {
        System.out.println("I am the Child class of all the parent classes");
    }

    public static void main(String[] args)
    {
        Inheritance2 ch1 = new Inheritance2();
        ch1.showFather();
        ch1.showUncle();
    }
}
