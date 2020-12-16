package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.ArrayList;

public final class j extends OutputStream {
    private static final byte[] a = new byte[0];
    private final int b;
    private final ArrayList c;
    private int d;
    private byte[] e;
    private int f;

    j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.b = i;
        this.c = new ArrayList();
        this.e = new byte[i];
    }

    private void a(int i) {
        this.c.add(new aj(this.e));
        this.d += this.e.length;
        this.e = new byte[Math.max(this.b, Math.max(i, this.d >>> 1))];
        this.f = 0;
    }

    private void c() {
        if (this.f >= this.e.length) {
            this.c.add(new aj(this.e));
            this.e = a;
        } else if (this.f > 0) {
            byte[] bArr = new byte[this.f];
            System.arraycopy(this.e, 0, bArr, 0, this.f);
            this.c.add(new aj(bArr));
        }
        this.d += this.f;
        this.f = 0;
    }

    public synchronized h a() {
        c();
        return h.a((Iterable) this.c);
    }

    public synchronized int b() {
        return this.d + this.f;
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
    }

    public synchronized void write(int i) {
        if (this.f == this.e.length) {
            a(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.e.length - this.f) {
            System.arraycopy(bArr, i, this.e, this.f, i2);
            this.f += i2;
        } else {
            int length = this.e.length - this.f;
            System.arraycopy(bArr, i, this.e, this.f, length);
            int i3 = i + length;
            int i4 = i2 - length;
            a(i4);
            System.arraycopy(bArr, i3, this.e, 0, i4);
            this.f = i4;
        }
    }
}
