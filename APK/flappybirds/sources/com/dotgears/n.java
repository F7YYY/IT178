package com.dotgears;

public class n extends m {
    public m[] a = new m[30];
    int b;
    int c;

    public int a() {
        return this.c;
    }

    public void a(float f) {
        for (int i = 0; i < a(); i++) {
            this.a[i].a(f);
        }
    }

    public void a(g gVar) {
        for (int i = 0; i < a(); i++) {
            this.a[i].a(gVar);
        }
    }

    public void a(m mVar) {
        this.a[this.c] = mVar;
        this.b = 0;
        this.c++;
    }

    public void b() {
        for (int i = 0; i < a(); i++) {
            this.a[i].F = false;
            this.a[i].G = false;
        }
        this.b = 0;
    }

    /* access modifiers changed from: package-private */
    public m c() {
        m mVar = this.a[this.b];
        this.b++;
        if (this.b == a()) {
            this.b = 0;
        }
        return mVar;
    }
}
