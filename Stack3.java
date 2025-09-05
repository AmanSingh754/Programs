import java.util.*;
//stack using collections framework

public class Stack3
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();    // using built in stack class
        s.push(1);                        //inbuilt method
        s.push(2);
        s.push(3);

     
       while(!s.empty())          //inbuilt method
        {
            System.out.println(s.peek());     //inbuilt method 
            s.pop();
        }
       
    }
}