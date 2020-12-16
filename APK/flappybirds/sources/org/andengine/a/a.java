package org.andengine.a;

public abstract class a implements c {
    protected float a = 1.0f;
    protected float b = 1.0f;
    private final d c;
    private boolean d;

    public a(d dVar) {
        this.c = dVar;
    }

    /* access modifiers changed from: protected */
    public d a() {
        g();
        return this.c;
    }

    /* access modifiers changed from: protected */
    public float b() {
        g();
        return this.c.a();
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    public void d() {
        g();
    }

    public void e() {
        g();
    }

    public void f() {
        g();
        this.d = true;
    }

    /* access modifiers changed from: protected */
    public void g() {
        if (this.d) {
            c();
        }
    }
}
