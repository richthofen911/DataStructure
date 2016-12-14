package net.callofdroidy.datastructure.util;

/**
 * Created by admin on 29/01/16.
 */
public class SinglyLinkedListEntry<E> {
    public E element;
    public SinglyLinkedListEntry<E> next = null;

    public SinglyLinkedListEntry(E element) {
        this.element = element;
    }
}
