package com.google.tagmanager.a;

import java.io.InputStream;

class aw extends InputStream {
    final /* synthetic */ ar a;
    private au b;
    private aj c;
    private int d;
    private int e;
    private int f;
    private int g;

    public aw(ar arVar) {
        this.a = arVar;
        a();
    }

    private int a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            b();
            if (this.c != null) {
                int min = Math.min(this.d - this.e, i3);
                if (bArr != null) {
                    this.c.b(bArr, this.e, i4, min);
                    i4 += min;
                }
                this.e += min;
                i3 -= min;
            } else if (i3 == i2) {
                return -1;
            }
        }
        return i2 - i3;
    }

    private void a() {
        this.b = new au(this.a);
        this.c = this.b.next();
        this.d = this.c.a();
        this.e = 0;
        this.f = 0;
    }

    private void b() {
        if (this.c != null && this.e == this.d) {
            this.f += this.d;
            this.e = 0;
            if (this.b.hasNext()) {
                this.c = this.b.next();
                this.d = this.c.a();
                return;
            }
            this.c = null;
            this.d = 0;
        }
    }

    public int available() {
        return this.a.a() - (this.f + this.e);
    }

    public void mark(int i) {
        this.g = this.f + this.e;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        b();
        if (this.c == null) {
            return -1;
        }
        aj ajVar = this.c;
        int i = this.e;
        this.e = i + 1;
        return ajVar.a(i) & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return a(bArr, i, i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void reset() {
        a();
        a((byte[]) null, 0, this.g);
    }

    public long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) a((byte[]) null, 0, (int) j);
    }
}
