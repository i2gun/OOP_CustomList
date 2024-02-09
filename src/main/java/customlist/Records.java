package customlist;

import java.util.Iterator;

public interface Records<E> {

    int getSize();

    void add(E e);

    void addFirst(E e);

    void addLast(E e);

    boolean isEmpty();

    Iterator<Node<E>> iterator();
}
