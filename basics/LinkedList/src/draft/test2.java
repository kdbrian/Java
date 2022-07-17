package draft;

public class test2 {

    public static void main(String[] args) {

        doubleNode head=new doubleNode(null);

        //no previous node
        head.prev=null;

        //pointing to the next node

        doubleNode node1=new doubleNode(1);
        doubleNode node2=new doubleNode(2);

        // Node0 1 references
        head.next=node1;
        node1.prev=head;

        // Node0 2 references
        node1.next=node2;
        node2.prev=node1;

        // end of the list
        node2.next=null;

        head.printNode("head");
        node1.printNode("node 1");
        node2.printNode("node 2");

    }
}

class doubleNode{
    doubleNode prev,next;
    Integer data;
    static int noNodes=0;

    doubleNode(Integer data){
        this.data=data;
        noNodes++;
    }

    /***
     * Function to print a node details
     * @params none
     * @returns void
     */
    public void printNode(String str){
//        try{
            System.out.printf("\t%s\n",str);
            System.out.println("Node = "+this);
            System.out.println("Prev = "+this.prev);
            System.out.println("Next = "+this.next);


//        }catch (NullPointerException e){
//
//            System.out.println("null");
//        }
    }

}
