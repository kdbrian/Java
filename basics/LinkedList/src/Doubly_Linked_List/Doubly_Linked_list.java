package Doubly_Linked_List;

public class Doubly_Linked_list {


    public static void main(String[] args) {

        Node head=new Node(null);

        head.isHead=true;
        //no previous node
        head.prev=null;

        //pointing to the next node

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);


        // Node 1 references
        head.next=node1;
        node1.prev=head;

        // Node 2 references
        node1.next=node2;
        node2.prev=node1;
        node2.next=node3;

        // node 3
        node3.prev=node2;

        // end of the list
        node3.next=null;


        //        head.printNode("head");
        //        node1.printNode("node 1");
        //        node2.printNode("node 2");

        //printing starts at the head
        head.printList();

    }
}

class Node{
    Node prev,next;
    Integer data;
    boolean isHead;
    static int noNodes=0;

    Node(Integer data){
        this.data=data;
        this.isHead=false;
        noNodes++;
    }

    /***
     * Function to print a node details
     * @params none
     * @returns void
     */
    public void printNode(String str){

        System.out.printf("\t%s\n",str);
        System.out.println("Node0 = "+this);
        System.out.println("Prev = "+this.prev);
        System.out.println("Next = "+this.next);


    }

    public  void printList(){

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
                return;
            }

        }
    }
}//end of node class

