import java.util.*;


//insertion in the middle  of the linked list
public class linkedlist5
{
    class Node
    {
        int data;
        Node next;
    
        Node(int data){
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
       
    Node temp = head;
    public static void SizeOfLinkedlist()
    {
          
           int size =0;
           while(temp!=null)
           {
               temp = head;
              temp = temp.next;
              size++;
              System.out.println("Size of linkedlist :"+size);
           }
           
    }

    void InsertAtPosition(int pos ,int data)
    {
      Node newnode = new Node(data);
      newnode.next = head;
      head = newnode;

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

         linkedlist5  list = new linkedlist5(); 
         list.addLast(5);
         list.addLast(10);
         list.addLast(15);
         list.addLast(20);
         list.addLast(25);
         list.addLast(30);

         System.out.println("Original Linked List");
         list.display();

         System.out.println();

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter data to be inserted :  ");
         int data = sc.nextInt();
         int pos  = sc.nextInt();

        
         int size=0;
         list.SizeOfLinkedlist();
         list.InsertAtPosition(pos ,data);

         System.out.println("Linked list after Insertion");

         list.display();
         sc.close();
    }
}
