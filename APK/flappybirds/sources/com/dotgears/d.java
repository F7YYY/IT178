package com.dotgears;

public class d {
    public boolean a;
    public String b;
    public int c;
    public int[] d = new int[this.c];
    public float e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    public d(int i2, String str, int[] iArr, int i3, int i4, boolean z) {
        this.b = str;
        this.c = i3;
        System.arraycopy(iArr, 0, this.d, 0, this.c);
        this.e = (float) (1000 / i4);
        this.f = z;
        this.g = i2;
    }

    public void a() {
        this.h = 0;
        this.i = 0;
        this.j = this.d[0];
    }

    public void a(float f2) {
        if (!this.a) {
            this.h += 15;
            if (((float) this.h) >= this.e) {
                this.h = 0;
                this.i++;
                if (this.i >= this.c) {
                    if (this.f) {
                        this.i = 0;
                    } else {
                        this.a = true;
                    }
                    this.i = 0;
                }
                this.j = this.d[this.i];
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.f && this.a) {
            a();
        }
        this.a = false;
    }
}
