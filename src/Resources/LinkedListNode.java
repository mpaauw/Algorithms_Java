// Data_Structures_Java
//
// Author: Matt Paauw
// GitHub: https://github.com/mpaauw
//
// No license, free use

package Resources;

/*
* SUMMARY:  Represents a single node within a LinkedList object.
* */
public class LinkedListNode<T> {
    private T value;
    public LinkedListNode<T> next;

    public LinkedListNode(T v) {
        value = v;
    }

    public T getValue() {
        return value;
    }
}