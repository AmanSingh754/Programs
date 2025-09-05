//stack using linkedlist 
public class Stack2

{
    static class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    } 
     static class Stack {
        static Node head = null;
        public static boolean isEmpty()
        {
           return  head==null;
        }

        public static void push(int data)
        {
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("The Stack is Empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek()
        {
          if(isEmpty())
            {
                System.out.println("The Stack is Empty");
                return -1;
            }
            return head.data;   
        }
    }


       public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}