package pt.tlopes.effective.java.chapter.chapter1;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Item7ObsoleteReferences {

    private Object[] elements;
    private int size;
    private static final int INITIAL_SIZE = 16;

    public Item7ObsoleteReferences() {
        elements = new Object[INITIAL_SIZE];
    }

    public void push(Object o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();

        // Eliminate obsolete reference (which would not be cleaned by GC otherwise)
        final Object element = elements[--size];
        elements[size] = null;

        return element;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
