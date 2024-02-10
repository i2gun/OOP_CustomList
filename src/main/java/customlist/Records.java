package customlist;

import java.util.Iterator;

public interface Records<E> {

    int getSize();

    E getItem(int i);

    void add(E e);

    void addFirst(E e);

    void addLast(E e);

    boolean isEmpty();

    Iterator<Node<E>> iterator();
}
