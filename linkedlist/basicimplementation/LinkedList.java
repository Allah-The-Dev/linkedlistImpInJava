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
        System.out.println("A new linked list");
        linkList.printLinkedList(linkList);

        //inserting an element in first position
        linkList.insertNodeAtFirstPosn(linkList,new Node(4));
        //printing new list 
        System.out.println("linked list after node with 4 added in head");
        linkList.printLinkedList(linkList);

    }

    private void insertNodeAtFirstPosn(LinkedList linkList,Node tempNode){
        //assign head of linked list to the next of tempnode
        //as tempNode will be the head
        tempNode.next = linkList.head;
        linkList.head = tempNode;

    }

    private void printLinkedList(LinkedList linkList){
        Node tempNode = linkList.head;
        while(tempNode!=null){
            System.out.print(tempNode.data +" -> ");
            tempNode = tempNode.next;
        }
    }
}