package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class ba implements Iterator {
    ba() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
