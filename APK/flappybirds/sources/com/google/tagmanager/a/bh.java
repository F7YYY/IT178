package com.google.tagmanager.a;

import java.util.ListIterator;

class bh implements ListIterator {
    ListIterator a = this.c.a.listIterator(this.b);
    final /* synthetic */ int b;
    final /* synthetic */ bg c;

    bh(bg bgVar, int i) {
        this.c = bgVar;
        this.b = i;
    }

    /* renamed from: a */
    public String next() {
        return (String) this.a.next();
    }

    /* renamed from: a */
    public void set(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public String previous() {
        return (String) this.a.previous();
    }

    /* renamed from: b */
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public int nextIndex() {
        return this.a.nextIndex();
    }

    public int previousIndex() {
        return this.a.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
