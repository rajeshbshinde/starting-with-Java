package src.rajesh.LinkedList;


public class InOrderTraversal {

    static void inOrderTraversal(Node root){
        if(root == null)
            return;
        inOrderTraversal( root.left);
        System.out.print(root.data+" ");
        inOrderTraversal( root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(8);
        root.left.right = new Node(5);
        root.left.right.right = new Node(9);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        inOrderTraversal(root);
    }
}
