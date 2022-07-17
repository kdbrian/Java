package Singly_Linked_list;

import java.util.Scanner;

public class Singly_Linked_List {

    public static void main(String[] args) {

        // implementation of a singly linked list

        /**
         * head -> node_1 -> node_n -> null;
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

        // getting a search value from the user and searching for it
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter value to search for : ");
//        String valStr= scanner.nextLine();
//        scanner.close();

//        int val= Integer.parseInt(valStr);

        System.out.println(head.searchFor(2) == 1?"found":"not found");
        Node test = head.searchForNode(3);


        System.out.println(test);

    }

}

/***
 * Representation of a logical node in a linked list
 */
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

    /***
     *
     * @return {int representing the number of nodes}
     */
    public static int getNoNodes() {
        return noNodes;
    }

    /**
     * Function to print the linked list
     * @returns {void}
     * @params {none}
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
                System.out.println("\nReached end");
                return;
            }

        }
    }

    /**
     * Function to treverse the list
     * @params {the value to search for integer in this case}
     */
    public int searchFor(int val){

        //changing pointer to the first node
        Node curr=this.next;

        while(curr != null){

            if (curr.data.equals(val)) {
                return 1;
            }

            curr=curr.next;
        }

        return -1;
    }

    /****
     *
     * @param val
     * @return {node  with the specified value}
     */
    public Node searchForNode(int val){

        // pointing to the node after the head
        Node curr=this.next;

        while(curr != null){

            if (curr.data.equals(val)) {
                return curr;
            }

            curr=curr.next;
        }
        return null;
    }

    /***
     *
     * @param {node to be deleted}
     * @return {1 for success -1 failed}
     */
    public static int deleteNode(Node n){
        // search for the node
        if(n==null){
            System.out.println("Error cannot find node");
        }

        // set previous pointer to the next node
//        Node prev=n.

        //set current node to null

        // return 1(true)

        // otherwise return -1(false)
        return -1;
    }
}

