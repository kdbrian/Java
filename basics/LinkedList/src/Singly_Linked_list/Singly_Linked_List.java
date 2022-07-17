public class Singly_Linked_List {

    public static void main(String[] args) {

        // implementation of a singly linked list

        /**
         *  head -> node_1 -> node_n -> null;
         * */

        //the head of the list
        Node head=new Node(null);
        head.isHead=true;


        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);

        //the end of the list
        head.next.next.next.next.next=null;

        System.out.println();

        //getting the number of nodes formed
        System.out.println("Number of nodes "+ Node.getNoNodes());

        // printing the linked list
        head.printList();

    }

}
class Node{

    //pointing to the next node
    Node next;

    // data stored in a node
    Integer data;

    // checking if the node is a head
    boolean isHead;

    /**
     * variable to keep track of the number of nodes created
     * is incremented whenener a new node is created
     * */
    static int noNodes=0;

    /**
     * Constructor for the node
     * */
    public Node(Integer data) {
        this.data = data;
        // initializing a default node to !head
        this.isHead=false;
        noNodes++;
    }

    public void nodeCount(){
        if(!this.isHead)
            noNodes ++;
        //return noNodes;
    }

    public static int getNoNodes() {
        return noNodes;
    }

    /**
     * Function to print the linked list
     * @returns {* void}
     * @params {* none}
     * */
    public  void printList(){
        //pointing to current node
        Node curr=this;

        while(curr != null){

            // printing the head
            if(curr.isHead) {

                System.out.print("head");
                //System.out.println(curr);
                curr=this.next;
                continue;
            }

            //System.out.print(curr);
            System.out.print(" -> "+curr.data);
            curr=curr.next;

            if(curr==null) {
                System.out.println("\n#");
                return;
            }

        }
    }
}

