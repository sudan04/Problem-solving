package LinkedList;

import org.w3c.dom.ls.LSOutput;

class Node{
     int data;
     Node next;

     Node(int data){
         this.data= data;
         this.next= null;
     }

}

class SinglyLinkedList{
    Node head= null;

    void insertAtIndex(int value, int index){
        int totalNodes = countNodes();
        if (index > totalNodes || index < 0) {
            System.out.println("Invalid index: requested index is out of range <total nodes: " + totalNodes + " requested index: " + index + ">");
            return;
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            System.out.println("Inserted at index 0");
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Inserted at index " + index);
    }


    int countNodes(){
        int c=0;
        Node first= head;
        while(first != null){
            c++;
            first= first.next;
        }
        return c;
    }
}

public class SinglyLLExample {
   public static void main(String[] args){
       SinglyLinkedList sll= new SinglyLinkedList();

       sll.insertAtIndex(23, 0);
       sll.insertAtIndex(23, 2);
       sll.insertAtIndex(23, 1);
   }
}
