import java.util.*;


//insertion in end in linked list but by taking user input 
public class linkedlist3
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

         linkedlist3  list = new linkedlist3(); 
        
         Scanner sc = new Scanner(System.in);
         int choice;
          do{
            System.out.print("Enter the data :   ");
            int  data = sc.nextInt();

            list.addLast(data);
            System.out.println("Select 1 for continue and 0 for stop: ");
             choice = sc.nextInt();

         }while(choice!=0);
         System.out.println("Linked list - ");
         list.display();
         sc.close();
  
    }
}
