
interface Animal
{
      void Sound();
}
    
class Dog  implements Animal
{
   public void Sound()
    {
        System.out.println("Dog Barks");
    }
}

public class interface1
{
     public static void main(String[] args)
      {
          Dog d1 = new Dog();
          d1.Sound();
     }
}