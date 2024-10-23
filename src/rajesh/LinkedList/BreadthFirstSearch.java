package src.rajesh.LinkedList;

// Leval Order traversal


public class BreadthFirstSearch {
    // Calculate the height of the tree
    static int height(Node root){
        if(root==null){
            return 0;
        }else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if(leftHeight>rightHeight){
                return leftHeight+1;
            }else
                return rightHeight+1;
        }
    }

    static void printCurrentLevelValue(Node root, int level){
        if(root == null)
            return;
        if(level==1){
            System.out.print(" "+root.data);
        } else if (level > 1) {
            printCurrentLevelValue(root.left,level-1);
            printCurrentLevelValue(root.right,level-1);
        }
    }
    static void levelOrderTraversal(Node root){
        int height = height(root);
        for(int i =0; i<=height; i++){
            printCurrentLevelValue(root,i);
        }
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
        levelOrderTraversal(root);
    }
}
