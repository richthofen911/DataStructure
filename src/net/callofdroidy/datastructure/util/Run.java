package net.callofdroidy.datastructure.util;

import net.callofdroidy.datastructure.SinglyLinkedList;

/**
 * Created by admin on 29/01/16.
 */
public class Run {
    public static void main(String[] args) throws Exception{

        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
        singlyLinkedList.insertAtHead("a");
        singlyLinkedList.insertAtHead("b");
        singlyLinkedList.insertAtHead("c");
        singlyLinkedList.insertAtHead("d");
        singlyLinkedList.insertAtHead("e");

        System.out.println(singlyLinkedList.printAll());

        SinglyLinkedListEntry<String> head = singlyLinkedList.getAtIndex(0);
        //System.out.println(head.next.element);
        singlyLinkedList.reverseRecursive(head);

        System.out.println(singlyLinkedList.printAll());



        //singlyLinkedList.deleteAtHead();
        //System.out.println(singlyLinkedList.printAll());

        /*
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("alpha");
        linkedList.add("beta");
        linkedList.add("gamma");
        linkedList.add("delta");
        linkedList.add("eta");
        System.out.println(linkedList.toString());
        */
    }
}
