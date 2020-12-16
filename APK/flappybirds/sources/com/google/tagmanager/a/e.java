package com.google.tagmanager.a;

class e extends aj {
    private final int d;
    private final int e;

    e(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            throw new IllegalArgumentException("Offset too small: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Length too small: " + i);
        } else if (((long) i) + ((long) i2) > ((long) bArr.length)) {
            throw new IllegalArgumentException("Offset+Length too large: " + i + "+" + i2);
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public byte a(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index too small: " + i);
        } else if (i < a()) {
            return this.c[this.d + i];
        } else {
            throw new ArrayIndexOutOfBoundsException("Index too large: " + i + ", " + a());
        }
    }

    public int a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, b() + i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    public int b() {
        return this.d;
    }

    /* renamed from: c */
    public i iterator() {
        return new g(this);
    }
}
