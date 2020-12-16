package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

class au implements Iterator {
    private final Deque a;
    private aj b;

    private au(h hVar) {
        this.a = new ArrayDeque(ar.c.length);
        this.b = a(hVar);
    }

    private aj a(h hVar) {
        h hVar2 = hVar;
        while (hVar2 instanceof ar) {
            ar arVar = (ar) hVar2;
            this.a.push(arVar);
            hVar2 = arVar.e;
        }
        return (aj) hVar2;
    }

    private aj b() {
        while (!this.a.isEmpty()) {
            aj a2 = a(((ar) this.a.pop()).f);
            if (!a2.d()) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public aj next() {
        if (this.b == null) {
            throw new NoSuchElementException();
        }
        aj ajVar = this.b;
        this.b = b();
        return ajVar;
    }

    public boolean hasNext() {
        return this.b != null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
