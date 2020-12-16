package com.google.tagmanager.a;

import java.io.OutputStream;

class aj extends h {
    protected final byte[] c;
    private int d = 0;

    aj(byte[] bArr) {
        this.c = bArr;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int a() {
        return this.c.length;
    }

    /* access modifiers changed from: protected */
    public int a(int i, int i2, int i3) {
        int b = b() + i2;
        return bj.a(i, this.c, b, b + i3);
    }

    public String a(String str) {
        return new String(this.c, b(), a(), str);
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public boolean a(aj ajVar, int i, int i2) {
        if (i2 > ajVar.a()) {
            throw new IllegalArgumentException("Length too large: " + i2 + a());
        } else if (i + i2 > ajVar.a()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + ajVar.a());
        } else {
            byte[] bArr = this.c;
            byte[] bArr2 = ajVar.c;
            int b = b() + i2;
            int b2 = b();
            int b3 = ajVar.b() + i;
            while (b2 < b) {
                if (bArr[b2] != bArr2[b3]) {
                    return false;
                }
                b2++;
                b3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int b(int i, int i2, int i3) {
        return a(i, this.c, b() + i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void b(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.c, b() + i, i2);
    }

    /* renamed from: c */
    public i iterator() {
        return new al(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        if (a() != ((h) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (obj instanceof aj) {
            return a((aj) obj, 0, a());
        }
        if (obj instanceof ar) {
            return obj.equals(this);
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + obj.getClass());
    }

    public boolean g() {
        int b = b();
        return bj.a(this.c, b, a() + b);
    }

    public k h() {
        return k.a(this);
    }

    public int hashCode() {
        int i = this.d;
        if (i == 0) {
            int a = a();
            i = b(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.d = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public int j() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return true;
    }

    /* access modifiers changed from: protected */
    public int l() {
        return this.d;
    }
}
