package datastructure.linkedlist;

/**
 * Created by admin on 29/01/16.
 */
public class Run {
    public static void main(String[] args) throws Exception{
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.insertFirst(4);
        simpleLinkedList.insertFirst(3);
        simpleLinkedList.insertFirst(2);
        simpleLinkedList.insertFirst(1);
        simpleLinkedList.display();
        simpleLinkedList.deleteFirst();
        simpleLinkedList.display();
        simpleLinkedList.remove(3);
        simpleLinkedList.display();
        System.out.println(simpleLinkedList.find(1));
        System.out.println(simpleLinkedList.find(4));
    }
}
