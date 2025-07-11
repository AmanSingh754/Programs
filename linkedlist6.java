public class linkedlist6 {
    
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
     
        Node head;
       public void addLast(int data)
    {  
        Node newnode = new Node(data);
        if(head==null)
        {
           head = newnode;
           return;
        }

        Node temp = head;
        while(temp.next!=null)
       {
        temp = temp.next;
       }
        temp.next =newnode;

    }

     void display()
    {   
         Node temp = head; 
         while(temp!=null)
       {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
       }
       System.out.print(" NULL ");
    }

    public static void main(String[] args)
    {

         linkedlist6  list = new linkedlist6(); 
         list.addLast(5);
         list.addLast(10);
         list.addLast(15);
         list.addLast(20);
         list.addLast(25);
         list.addLast(50);
        
         list.display();
         return;
    }
}
