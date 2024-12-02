import java.util.Scanner;

public class binarytree {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value");
    Node root=new Node(s.nextInt());
    boolean x=true;
    while(x)
    {
        System.out.println("do you want to enter some more values(0/1)");
        int choice=s.nextInt();
        x=(choice==1);
        if(!x)
        {break;}
        System.out.println("enter the value");
        int val=s.nextInt();
        Node temp=root;
        boolean y=true;
        while (y) {
            if(val>temp.data)
            {
                if(temp.right==null)
                {
                    temp.right=new Node(val);
                    break;
                }
                temp=temp.right;
            }
            if(val<temp.data)
            {
                if(temp.left==null)
                {
                    temp.left=new Node(val);
                    break;
                }
                temp=temp.left;
            }
        }
    }
    Node temp=root;
    System.out.println(temp.data);
    while(temp.left!=null){
        temp=temp.left;
        System.out.println(temp.data);
    }
    System.out.println("do you want to search any element");
    int se=s.nextInt();
    boolean e=(se==1);
    if(e)
    {
        System.out.println("enter the element to be search");
        int searchele=s.nextInt();
        Node tempse=root;
        while(tempse!=null)
        {
            if(tempse.data==searchele)
            {
                System.out.println("element is found");
                break;
            }
            if(searchele>tempse.data)
            {
                tempse=tempse.right;
                if(tempse.data==searchele)
                {
                    System.out.println("element is found");
                    break;
                }
            }
            if(searchele<tempse.data)
            {
                tempse=tempse.left;
                if(tempse.data==searchele)
                {
                    System.out.println("element is found");
                    break;
                }
            }
            
        }
        if(tempse==null)
        {
            System.out.println("element is not found");
        }
    }
    }

}
class Node{
    int data;
    Node(int val){
        data=val;
    }
    Node left=null,right=null;
}
