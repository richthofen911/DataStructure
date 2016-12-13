package net.callofdroidy.datastructure;

import net.callofdroidy.datastructure.common.SinglyLinkedListData;

/**
 * Created by admin on 29/01/16.
 */
public class SinglyLinkedList {
    private SinglyLinkedListData first = null;

    public void insertFirst(Object obj){
        SinglyLinkedListData singlyLinkedListData = new SinglyLinkedListData(obj);
        singlyLinkedListData.next = first;
        first = singlyLinkedListData;
    }

    public Object deleteFirst() throws Exception{
        if(first == null)
            throw new Exception("empty");
        SinglyLinkedListData temp = first;
        first = first.next;
        return temp.obj;
    }

    public Object find(Object obj) throws Exception{
        if(first == null)
            throw new Exception("LinkedList is empty");
        SinglyLinkedListData cur = first;
        while (cur != null){
            if(cur.obj.equals(obj)){
                return cur.obj;
            }
            cur = cur.next;
        }
        return null;
    }

    public void remove(Object obj) throws Exception{
        if(first == null)
            throw new Exception("LinkedList is empty");
        if (first.obj.equals(obj)) {
            first = first.next;
        }else {
            SinglyLinkedListData pre = first;
            SinglyLinkedListData cur = first.next;
            while(cur != null){
                if(cur.obj.equals(obj)){
                    pre.next = cur.next;
                }
                pre = cur;
                cur = cur.next;
            }
        }
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void display(){
        if(first == null)
            System.out.println("empty");
        else {
            SinglyLinkedListData cur = first;
            while(cur != null){
                System.out.print(cur.obj.toString() + " -> ");
                cur = cur.next;
            }
            System.out.print("\n");
        }

    }
}
