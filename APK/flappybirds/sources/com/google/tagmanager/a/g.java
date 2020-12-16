package com.google.tagmanager.a;

import java.util.NoSuchElementException;

class g implements i {
    final /* synthetic */ e a;
    private int b;
    private final int c;

    private g(e eVar) {
        this.a = eVar;
        this.b = eVar.b();
        this.c = this.b + eVar.a();
    }

    /* renamed from: a */
    public Byte next() {
        return Byte.valueOf(b());
    }

    public byte b() {
        if (this.b >= this.c) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.a.c;
        int i = this.b;
        this.b = i + 1;
        return bArr[i];
    }

    public boolean hasNext() {
        return this.b < this.c;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
