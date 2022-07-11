public class node_1 {

    public static void main(String[] args) {

        //root node
        Node root = new Node(0, true);

        //left side of the root
        root.left = new Node(1, false);
        root.left.left=new Node(3,false);
        root.left.right=new Node(4,false);

        //right side of the root
        root.right = new Node(2, false);
        root.right.left=new Node(5,false);
        root.right.right=new Node(6,false);

        print(root);
    }

    public static void print(Node n) {

        Node curr = n;//asigning root to current node

        while (curr != null) {
            System.out.println(curr.data);
            while (true) {
                //to the left
                curr = (curr.left != null)?curr.left : null;

                if(curr == null)break;

                if (!curr.isRoot) { //printing only nodes that are not the root
                    if (!curr.visited) {
                        System.out.println(curr.data);
                        curr.visited = true;
                        //curr.isRoot=true;
                    }
                }

            }

            curr=n;
            while (true) {
                //to the right
                curr = (curr.right != null)?curr.right : null;

                if(curr == null)break;

                if (!curr.isRoot) { //printing only nodes that are not the root
                    if (!curr.visited) {
                        System.out.println("\t"+curr.data);
                        curr.visited = true;
                        //curr=null;
                    }
                }
            }
            break;
        }
    }

    public static void printleft(Node n){

    }

    public static void printright(Node n){

    }

}

class Node{
    Node left,right;
    Integer data;
    Boolean visited;
    Boolean isRoot;
    public Node(Integer data,Boolean isRoot) {
        this.data = data;
        this.isRoot=false;
        this.visited=false;
    }

    public void printTreeWhile(){

    }

    public void printTree(){
        Node n;
        n=this;
        if(n.left==null || n.right == null){
            // if no available nodes
            System.out.println("Reached end");
        }else{
            // printing the root
            System.out.println(n.data);
            if(this.left != null)
                printNode(this.left);

            if(this.right != null)
                printNode(this.right);
        }
    }

    public void printNode(Node n){
        if(n != null)
            System.out.print(n.data);

        if(n.left != null)
            System.out.print(n.left.data);

        if(n.right != null)
            System.out.println("\t"+n.right.data);
    }

    public void printNodeLeft(Node n){
        System.out.println(n.data);
        //System.out.println(n.left.data);
    }
}
