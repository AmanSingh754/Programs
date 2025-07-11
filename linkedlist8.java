public class linkedlist8 {
    // mid of the linked list
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
    {    int count = 0;
         Node temp = head; 
         while(temp!=null)
       {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
         count++;
       }
       System.out.println(" NULL ");
       System.out.println("Total Count of the nodes is "+count);    
    }
  
    void middleElement()
    {

        Node temp = head;
        int count = 0;
        while(temp!=null)
       {
          temp = temp.next;
          count++;
       }
       temp=head;
       int mid = count/2 +1;
       for(int i=1 ; i<mid ; i++)
       {
           temp=temp.next;
       }
       System.out.println(temp.data);


    }
    public static void main(String[] args)
    {
      
         linkedlist8  list = new linkedlist8(); 
         list.addLast(5);
         list.addLast(10);
         list.addLast(15);
         list.addLast(20);
       //  list.addLast(25);
         list.addLast(50);
        
         list.display();
         System.out.println();
         list.middleElement();
         
    }
}
