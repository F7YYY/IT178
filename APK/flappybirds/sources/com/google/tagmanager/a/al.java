package com.google.tagmanager.a;

import java.util.NoSuchElementException;

class al implements i {
    final /* synthetic */ aj a;
    private int b;
    private final int c;

    private al(aj ajVar) {
        this.a = ajVar;
        this.b = 0;
        this.c = ajVar.a();
    }

    /* renamed from: a */
    public Byte next() {
        return Byte.valueOf(b());
    }

    public byte b() {
        try {
            byte[] bArr = this.a.c;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.b < this.c;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
