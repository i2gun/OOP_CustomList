package customlist;

public class Node<E> {

    private final E item;
    private Node<E> next;
    private Node<E> prev;

    Node(E element, Node<E> nextElement, Node<E> prevElement) {
        item = element;
        next = nextElement;
        prev = prevElement;
    }

    Node(E e) {
        this(e, null, null);
    }

    void setNext(Node<E> node) {
        next = node;
    }

    void setPrev(Node<E> node) {
        prev = node;
    }

    E getItem() {
        return item;
    }

    Node<E> getNext() {
        return next;
    }

    Node<E> getPrev() {
        return next;
    }
}