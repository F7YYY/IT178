package com.google.tagmanager.a;

import java.io.OutputStream;

public final class m {
    private final byte[] a;
    private final int b;
    private int c;
    private int d = 0;
    private final OutputStream e;

    private m(OutputStream outputStream, byte[] bArr) {
        this.e = outputStream;
        this.a = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public static m a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static m a(OutputStream outputStream, int i) {
        return new m(outputStream, new byte[i]);
    }

    private void b() {
        if (this.e == null) {
            throw new n();
        }
        this.e.write(this.a, 0, this.c);
        this.c = 0;
    }

    public void a() {
        if (this.e != null) {
            b();
        }
    }

    public void a(byte b2) {
        if (this.c == this.b) {
            b();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
        this.d++;
    }

    public void a(int i) {
        e(i);
    }

    public void a(long j) {
        c(j);
    }

    public void a(h hVar) {
        d(hVar.a());
        b(hVar);
    }

    public void a(h hVar, int i, int i2) {
        if (this.b - this.c >= i2) {
            hVar.b(this.a, i, this.c, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        int i3 = this.b - this.c;
        hVar.b(this.a, i, this.c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.c = this.b;
        this.d = i3 + this.d;
        b();
        if (i5 <= this.b) {
            hVar.b(this.a, i4, 0, i5);
            this.c = i5;
        } else {
            hVar.a(this.e, i4, i5);
        }
        this.d += i5;
    }

    public void b(int i) {
        d(i);
    }

    public void b(long j) {
        d(j);
    }

    public void b(h hVar) {
        a(hVar, 0, hVar.a());
    }

    public void c(int i) {
        a((byte) i);
    }

    public void c(long j) {
        while ((-128 & j) != 0) {
            c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c((int) j);
    }

    public void d(int i) {
        while ((i & -128) != 0) {
            c((i & 127) | 128);
            i >>>= 7;
        }
        c(i);
    }

    public void d(long j) {
        c(((int) j) & 255);
        c(((int) (j >> 8)) & 255);
        c(((int) (j >> 16)) & 255);
        c(((int) (j >> 24)) & 255);
        c(((int) (j >> 32)) & 255);
        c(((int) (j >> 40)) & 255);
        c(((int) (j >> 48)) & 255);
        c(((int) (j >> 56)) & 255);
    }

    public void e(int i) {
        c(i & 255);
        c((i >> 8) & 255);
        c((i >> 16) & 255);
        c((i >> 24) & 255);
    }
}
