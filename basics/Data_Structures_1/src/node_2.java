public class node_2 {

    public static void main(String[] args) {

        Node2 myRoot=new Node2(0);

        myRoot.left=new Node2(1);
        myRoot.right=new Node2(1);

        printNode(myRoot);
    }

    public static void printNode(Node2 n){
        System.out.println(n.data);

        System.out.println((n.left != null)?n.left.data:" ");
        System.out.print("\t");
        System.out.print((n.right != null)?n.right.data:" ");
    }

}

class Node2 {
    Node2 left,right;
    Integer data;

    public Node2(Integer data) {
        this.data = data;
    }
}