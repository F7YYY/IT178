package com.dotgears;

import android.util.Log;

public class h {
    public static String l = "0123456789";
    public i[] a = new i[256];
    protected int[] b = new int[256];
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected float h;
    public char[] i = new char[256];
    public char[] j = new char[256];
    public int k = 0;

    public h(String str, int i2) {
        i[] a2 = g.D.a(str);
        for (int i3 = 0; i3 < a2.length; i3++) {
            int parseInt = Integer.parseInt(a2[i3].a.split("_")[1]);
            this.a[parseInt] = a2[i3];
            this.b[parseInt] = a2[i3].b;
            this.c = this.c > a2[i3].c ? this.c : a2[i3].c;
            Log.i("FlappyBird", "Number: " + a2[i3].a + " " + parseInt);
        }
        this.b[32] = this.b[48];
        this.d = i2;
    }

    public void a(int i2, int i3) {
        this.k = 0;
        int i4 = i2;
        while (i3 > 0) {
            if (i4 > 0) {
                int i5 = i4 % 10;
                i4 /= 10;
                this.j[this.k] = l.charAt(i5);
                this.k++;
            }
            i3--;
        }
        for (int i6 = 0; i6 < this.k; i6++) {
            this.i[i6] = this.j[(this.k - i6) - 1];
        }
        if (this.k == 0) {
            this.i[0] = '0';
            this.k = 1;
        }
    }

    public void a(int i2, int i3, int i4, float f2) {
        this.f = i2;
        this.g = i3;
        this.e = i4;
        this.h = f2;
    }

    public void a(g gVar) {
        int i2 = this.k;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 + this.b[this.i[i4]]) - this.d;
        }
        int i5 = i3 + 2;
        int i6 = this.c;
        if ((this.e & 2) != 0) {
            this.f -= i5 / 2;
        } else if ((this.e & 1) != 0) {
            this.f -= i5;
        }
        if ((this.e & 4) != 0) {
            this.g -= i6 / 2;
        } else if ((this.e & 8) != 0) {
            this.g -= i6;
        }
        int i7 = this.f;
        int i8 = this.g;
        for (int i9 = 0; i9 < i2; i9++) {
            if (this.a[this.i[i9]] != null) {
                gVar.a(this.a[this.i[i9]], i7, i8, this.h);
            }
            i7 = (i7 + this.b[this.i[i9]]) - this.d;
        }
    }
}
