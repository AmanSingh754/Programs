
interface  Vehicle
{
    void Wheels();
}

class Bike implements Vehicle
{
   public  void Wheels()
    {
       System.out.println("Bike has two wheels");
    }
}

class Car implements Vehicle
{
   public  void Wheels()
    {
      System.out.println("A car has four wheels");
    }
}


public class interface2
 {
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.Wheels();
        b1.Wheels();
    }
}
