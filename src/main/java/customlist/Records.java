package customlist;

import java.util.Iterator;

public interface Records<E> extends Iterable<Node<E>> {

    int getSize();

    E getItem(int i);

    void add(E e);

    void addFirst(E e);

    void addLast(E e);

    boolean isEmpty();
}
