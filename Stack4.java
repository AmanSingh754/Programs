import java.util.*;

//push at the buttom of stack
public class Stack4
{ 
    public static void pushAtButtom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();    //the top's value was kept stored each time locally 
        pushAtButtom(s, data);
        s.push(top);          
    }
    public static void main(String[] args)
        {
          Stack<Integer> s = new Stack<>();
           s.push(1);
           s.push(2);
           s.push(3);

           pushAtButtom( s ,4);

           while(!s.isEmpty())
           {
            System.out.println(s.pop());
           }
        }
}