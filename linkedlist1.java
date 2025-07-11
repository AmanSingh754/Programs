import java.util.*;
public class linkedlist1 {
    
public static void main(String[] args)
{

LinkedList<String> list = new LinkedList<String>();

list.addFirst("AMAN");
list.addFirst("Akash");
list.addFirst("Nibha");
list.addFirst("Aarti");

System.out.println(list);

list.addLast("HELLO");
System.out.println(list);
System.out.println(list.size());

for(int i=0 ; i<list.size() ; i++)
{
    System.out.print(list.get(i) +" -> ");
}
System.out.println( "null");

list.removeLast();
System.out.println(list);
}
}
