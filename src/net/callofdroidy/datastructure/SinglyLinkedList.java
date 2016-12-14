package net.callofdroidy.datastructure;

import net.callofdroidy.datastructure.util.SinglyLinkedListEntry;

import java.util.EmptyStackException;

/**
 * Created by yli on 13/12/16.
 * Tips:
 *　1. 头结点的数据域尽量不存放数据，以免在要删除该数据时,无法找到指向这个头结点的结点而无法删除, 不利于针对所有数据的循环滚动操作
 * ２．最后哦一个结点的指针域一定要记得赋null, 不然在对该链表遍历时就没有结尾了
 */
public class SinglyLinkedList<E> {
    private SinglyLinkedListEntry<E> head;
    private int size = 0;

    public SinglyLinkedList(){
        head = new SinglyLinkedListEntry<E>(null);
    }

    public void insertAtHead(E newEntryElement){
        SinglyLinkedListEntry<E> newEntry = new SinglyLinkedListEntry<E>(newEntryElement);
        newEntry.next = head;
        head = newEntry;
        size++;
    }

    public E deleteAtHead() throws EmptyStackException{
        if(head.next == null)
            throw new EmptyStackException();
        else {
            SinglyLinkedListEntry<E> removedEntry = head;
            head = head.next;
            size--;
            return removedEntry.element;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean contains(E targetElement){
        SinglyLinkedListEntry<E> node = head;
        while(node.next != null){
            if(node.element.equals(targetElement))
                return true;
            else
                node = node.next;
        }
        return false;
    }

    // 单链表反转的四种方法：　http://blog.csdn.net/feliciafay/article/details/6841115

    public void reverseWayOne(){ // non-recursive
        SinglyLinkedListEntry<E> pNode = head;
        SinglyLinkedListEntry<E> qNode = head.next;

        SinglyLinkedListEntry<E> rNode = null;

        head.next = null;

        while(qNode != null){
            rNode = qNode.next;
            qNode.next = pNode;
            pNode = qNode;
            qNode = rNode;

        }

        head = pNode;
    }

    public void reverseWayTwo(){ // recursive

    }

    public String printAll(){
        StringBuilder stringBuilder = new StringBuilder();
        SinglyLinkedListEntry<E> node = head;
        while(node != null){
            //if(node.element != null){
                stringBuilder.append(node.element).append(", ");
                node = node.next;
            //}
        }
        return stringBuilder.toString();
    }

    public int size(){
        return size;
    }
}
