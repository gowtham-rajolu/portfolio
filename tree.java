public class tree {

    public static void main(String[] args) {
        // Initialize and allocate memory for tree nodes
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        // Connect binary tree nodes
        firstNode.left = secondNode;
        secondNode.left = thirdNode;
        thirdNode.left = fourthNode;
     //   System.out.println(firstNode.key+"\n"+firstNode.left.key+"  "+firstNode.right.key+"\n"+secondNode.left.key);
        Node temp=firstNode;
        System.out.println(temp.key);
        while(temp.left!=null)
        {
            System.out.println(temp.left.key);
            temp=temp.left;
        }
    }
}
class Node {
    int key;
    Node left, right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}