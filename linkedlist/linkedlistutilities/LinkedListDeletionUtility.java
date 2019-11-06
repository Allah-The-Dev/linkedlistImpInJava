package linkedlist.linkedlistutilities;

import linkedlist.basicimplementation.LinkedList;

public class LinkedListDeletionUtility{
    public void deleteNode(LinkedList llist,int data){
        
        LinkedList.Node tempNode = llist.head;
        LinkedList.Node nodePrevToTemp = null;
        //if head.data == data 
        if(tempNode.data == data){
            llist.head = llist.head.next;
            return;
        }else{
            while(tempNode.next != null){
                nodePrevToTemp = tempNode;
                tempNode = tempNode.next;
                if(tempNode.data == data){
                    nodePrevToTemp.next = tempNode.next;
                    return;
                }
            }
        }
        if(tempNode.next == null && tempNode.data == data){
            nodePrevToTemp.next = null;
            return;
        }
    }
}