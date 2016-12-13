package net.callofdroidy.datastructure.common;

import net.callofdroidy.datastructure.SinglyLinkedList;

/**
 * Created by admin on 29/01/16.
 */
public class Run {
    public static void main(String[] args) throws Exception{
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(3);
        singlyLinkedList.insertFirst(2);
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.display();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.display();
        singlyLinkedList.remove(3);
        singlyLinkedList.display();
        System.out.println(singlyLinkedList.find(1));
        System.out.println(singlyLinkedList.find(4));
    }
}
