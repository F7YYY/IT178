package com.dotgears;

public class q extends m {
    d[] a = new d[10];
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i = 1.0f;
    public d j = null;
    public boolean k;
    public boolean l;
    public boolean m = false;
    public boolean n = false;
    public int o;
    public i[] p;

    public void a(float f2) {
        if (this.m && this.j != null) {
            this.j.a(f2);
        }
    }

    public void a(int i2, int i3) {
        this.b = i2;
        this.c = i3;
        this.d = 0;
        this.m = true;
        this.n = true;
        this.k = false;
        this.l = false;
        this.i = 1.0f;
    }

    public void a(int i2, String str, int[] iArr, int i3, int i4, boolean z) {
        this.a[i2] = new d(i2, str, iArr, i3, i4, z);
    }

    public void a(int i2, boolean z) {
        if (z) {
            this.a[i2].a();
        }
        this.a[i2].b();
        this.j = this.a[i2];
    }

    public void a(g gVar) {
        if (this.n) {
            i iVar = this.p[0];
            if (this.j != null) {
                iVar = this.p[this.j.j];
            }
            gVar.a(iVar.i, this.b - this.g, this.c - this.h, 1.0f, 1.0f, this.i);
        }
    }

    public void a(String str, int i2, int i3, int i4, int i5) {
        this.p = g.D.a(str);
        this.o = this.p.length;
        if (i2 == 0 || i3 == 0) {
            this.e = this.p[0].b;
            this.f = this.p[0].c;
        } else {
            this.e = i2;
            this.f = i3;
        }
        if (i4 == 0 || i5 == 0) {
            this.g = (this.p[0].b - this.e) >> 1;
            this.h = (this.p[0].c - this.f) >> 1;
            return;
        }
        this.g = i4;
        this.h = i5;
    }
}
