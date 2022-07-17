package draft;

public class test1 {

    public static void main(String[] args) {

        // implementation of a singly linked list

        /**
         *  head -> node_1 -> node_n -> null;
         * */
        test1Node head=new test1Node(null);
        head.isHead=true;
        head.nodeCount();

        head.next=new test1Node(1);
        head.next.next=new test1Node(2);
        head.next.next.next=new test1Node(3);
        head.next.next.next.next=new test1Node(4);
        head.next.next.next.next.next=null;

        System.out.println();

        //getting the number of nodes formed
        System.out.println("Number of nodes "+test1Node.getNoNodes());

        // printing the linked list
        head.printList();

    }

}
class test1Node{
    test1Node next;
    Integer data;
    boolean isHead;
    static int noNodes=0;

    public test1Node(Integer data) {
        this.data = data;
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

    public  void printList(){
        test1Node curr=this;



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
                return;
            }

        }
    }
}
