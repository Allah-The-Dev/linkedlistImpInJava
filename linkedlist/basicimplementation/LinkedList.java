package linkedlist.basicimplementation;

import linkedlist.linkedlistutilities.LinkedListDeletionUtility;;

public class LinkedList{

    //this head is required at instance level
    //to create head for the linked list
    public Node head;

    public static class Node{
        public int data;
        public Node next;

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
        System.out.println("\n linked list after node with 4 added in head");
        linkList.printLinkedList(linkList);

        //inserting after given node
        linkList.insertNodeAfterAGivenNode(linkList,second,new Node(5));
        //printing new modified list
        System.out.println("\n linked list after node with 5 added after 2");
        linkList.printLinkedList(linkList);

        //inserting node in last
        linkList.insertNodeInLast(linkList,new Node(6));
        //printing new modified list
        System.out.println("\n linked list after node with 6 added in last");
        linkList.printLinkedList(linkList);

        //deleting node when data part of node is given
        LinkedListDeletionUtility llDelUtil = new LinkedListDeletionUtility();
        //deleting mid node 
        llDelUtil.deleteNode(linkList, 2);
        System.out.println("linked list after deleting 2 in mid");
        linkList.printLinkedList(linkList);
        //deleting starting
        llDelUtil.deleteNode(linkList, 4);
        System.out.println("linked list after deleting 4 at starting");
        linkList.printLinkedList(linkList);
        //deleting last node
        llDelUtil.deleteNode(linkList, 6);
        System.out.println("linked list after deleting 6 in last");
        linkList.printLinkedList(linkList);
    }

    private void insertNodeAtFirstPosn(LinkedList linkList,Node tempNode){
        //assign head of linked list to the next of tempnode
        //as tempNode will be the head
        tempNode.next = linkList.head;
        linkList.head = tempNode;

    }

    public void printLinkedList(LinkedList linkList){
        Node tempNode = linkList.head;
        while(tempNode.next !=null){
            System.out.print(tempNode.data +" -> ");
            tempNode = tempNode.next;
        }
        if(tempNode.next == null){
            System.out.println(tempNode.data);
        }
    }

    private void insertNodeAfterAGivenNode(LinkedList linkedList,Node nodeAfter,Node newNode){
        Node tempNode = linkedList.head;

        //check for node after
        if(nodeAfter == null){
            System.out.println("Previous node can not be null");
            return;
        }

        newNode.next = nodeAfter.next;
        nodeAfter.next = newNode;
    }

    private void insertNodeInLast(LinkedList linkedList,Node newNode){
        Node tempNode = linkedList.head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        if(tempNode.next == null){
            tempNode.next = newNode;
        }
    }

}