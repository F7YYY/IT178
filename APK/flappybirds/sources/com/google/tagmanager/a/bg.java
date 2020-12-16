package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class bg extends AbstractList implements ai, RandomAccess {
    /* access modifiers changed from: private */
    public final ai a;

    public bg(ai aiVar) {
        this.a = aiVar;
    }

    /* renamed from: a */
    public String get(int i) {
        return (String) this.a.get(i);
    }

    public List a() {
        return this.a.a();
    }

    public void a(h hVar) {
        throw new UnsupportedOperationException();
    }

    public Iterator iterator() {
        return new bi(this);
    }

    public ListIterator listIterator(int i) {
        return new bh(this, i);
    }

    public int size() {
        return this.a.size();
    }
}
