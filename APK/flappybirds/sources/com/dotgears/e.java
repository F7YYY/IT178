package com.dotgears;

public class e extends q {
    public e() {
        a("blink", 10, 10, 4, 4);
        int[] iArr = new int[5];
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 1;
        a(0, "blink", iArr, 5, 10, false);
        this.m = false;
        this.n = false;
        a(0, true);
    }

    public void a(float f) {
        if (this.m) {
            super.a(f);
            if (this.j != null && this.j.a) {
                this.m = false;
                this.n = false;
            }
        }
    }

    public void a(int i, int i2) {
        super.a(i, i2);
        a(0, true);
    }

    public void a(g gVar) {
        if (this.n) {
            super.a(gVar);
        }
    }
}
