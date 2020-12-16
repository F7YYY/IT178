package com.dotgears;

public class l {
    public int a = this.c[0].b;
    public int b = this.c[0].c;
    private i[] c;

    public l(String str) {
        this.c = g.D.a(str);
    }

    public void a(g gVar, int i, int i2, int i3, boolean z, int i4) {
        int i5;
        int i6 = i2 - this.a;
        boolean z2 = true;
        int i7 = i;
        while (i4 > 0) {
            if (i7 > 0 || z2) {
                gVar.a(this.c[i7 % 10].i, i6, i3, 1.0f, 1.0f, 1.0f);
                i6 -= this.a;
                i5 = i7 / 10;
                z2 = z;
            } else {
                i5 = i7;
            }
            i4--;
            i7 = i5;
        }
    }
}
