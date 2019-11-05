package linkedlist.linkedlistutilities;

import linkedlist.basicimplementation.LinkedList;

public class LinkedListDeletionUtility{
    public void deleteNode(LinkedList llist,int data){
        
        LinkedList.Node tempNode = llist.head;
        LinkedList.Node nodePrevToTemp = null;
        //if head.data == data 
        if(tempNode.data == data){
            llist.head = llist.head.next;
        }else{
            nodePrevToTemp = tempNode;
            tempNode = tempNode.next;
            while(nodePrevToTemp.next != null){
                if(tempNode.data == data){
                    nodePrevToTemp.next = tempNode.next;
                    break;
                }else{
                    nodePrevToTemp = tempNode;
                    tempNode = tempNode.next;
                }
            }
        }
    }
}