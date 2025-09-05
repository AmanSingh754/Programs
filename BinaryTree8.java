
// Find the sum of all nodes in the Tree
public class BinaryTree8
{
       static class Node
    {
        int data;
        Node left;
        Node right;

            Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sumNode(Node root)
    {
        if(root==null)
        {
          return 0;
        }
        int lh = sumNode(root.left);
        int rh = sumNode(root.right);

        int sum = lh + rh + root.data;
        return sum;
    }


    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("The total sum  of nodes in the Tree = "+sumNode(root));
    }
}
