package com.google.tagmanager.a;

import java.util.Iterator;

class bi implements Iterator {
    Iterator a = this.b.a.iterator();
    final /* synthetic */ bg b;

    bi(bg bgVar) {
        this.b = bgVar;
    }

    /* renamed from: a */
    public String next() {
        return (String) this.a.next();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
