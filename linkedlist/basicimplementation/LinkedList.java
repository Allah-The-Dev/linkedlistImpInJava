package linkedlist.basicimplementation;

class LinkedList{

    //this head is required at instance level
    //to create head for the linked list
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =  data;
            next=null;
        }
    }

    public static void main(String args[]){
        LinkedList linkList = new LinkedList();

        //assigning head to the new linked list
        linkList.head = new Node(1);

        //now creating 2 other node objects 
        Node second = new Node(2);
        Node third = new Node(3);

        //finally connecting all the nodes
        linkList.head.next = second;
        second.next = third;

        //iterating through linked list
        Node tempNode = linkList.head;
        while(tempNode.next!=null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }

    }
}