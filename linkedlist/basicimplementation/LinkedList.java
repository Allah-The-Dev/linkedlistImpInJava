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
    }

    private void insertNodeAtFirstPosn(LinkedList linkList,Node tempNode){
        //assign head of linked list to the next of tempnode
        //as tempNode will be the head
        tempNode.next = linkList.head;
        linkList.head = tempNode;

    }

    private void printLinkedList(LinkedList linkList){
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

        //what if nodeAfter.data == linkedList.head.data
        while(tempNode.next != null){
            if(tempNode.data == nodeAfter.data){
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                break;
            }else{
                tempNode = tempNode.next;
            }
        }
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