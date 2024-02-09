package customlist;

import java.util.Iterator;
import java.util.function.Function;

public class LinkedRecords<E> implements Records<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public LinkedRecords(E e) {
        if (e != null) {
            first = new Node<>(e);
            last = first;
            size = 1;
        } else {
            first = null;
            last = null;
            size = 0;
        }
    }

    public LinkedRecords() {
        this(null);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(E e) {
        addFirst(e);
    }

    @Override
    public void addFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(e, f, null);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.setPrev(newNode);
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(e, null, l);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.setNext(newNode);
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<Node<E>> iterator() {
        return new Iterator<Node<E>>() {
            Node<E> element = new Node<>(null, first, null);

            @Override
            public boolean hasNext() {
                return element != null && element.getNext() != null;
            }

            @Override
            public Node<E> next() {
                element = element != null ? element.getNext() : null;
                return element;
            }
        };
    }

    public String toString(Function<E, String> func) {
        StringBuilder str = new StringBuilder();
        for (Iterator<Node<E>> iter = iterator(); iter.hasNext(); ) {
            Node<E> item = iter.next();
            E elem = item.getItem();
            str.append(func.apply(elem));

            if (iter.hasNext()) {
                str.append(", ");
            } else {
                str.append("\n");
            }
        }
        return str.toString();
    }
}