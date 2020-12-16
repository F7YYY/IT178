package com.dotgears;

public class o extends m {
    public int a = 12;
    public int b = 14;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    private i[] m = g.D.a("number_context");

    public void a(float f2) {
        if (this.F && this.d > 0) {
            this.d--;
            if (this.g < 2) {
                this.k += this.g;
                this.i++;
                if (this.i == 4) {
                    this.i = 0;
                    this.g += this.h;
                }
            }
            if (this.d <= 0) {
                this.F = false;
                this.G = false;
            }
        }
    }

    public void a(g gVar) {
        if (this.G) {
            if (this.c) {
                gVar.a(this.m[10].i, this.j, this.k, 1.0f, 1.0f, 1.0f);
            }
            a(gVar, this.e, this.j + this.l, this.k, false, this.f);
        }
    }

    public void a(g gVar, int i2, int i3, int i4, boolean z, int i5) {
        int i6;
        int i7 = i3 - this.a;
        boolean z2 = true;
        int i8 = i2;
        while (i5 > 0) {
            if (i8 > 0 || z2) {
                int i9 = i8 % 10;
                gVar.a(this.m[i9].i, i7, i4, 1.0f, 1.0f, 1.0f);
                i6 = i8 / 10;
                i7 = i9 != 1 ? i7 - (this.a - 2) : i7 - 4;
                z2 = z;
            } else {
                i6 = i8;
            }
            i5--;
            i8 = i6;
        }
    }
}
