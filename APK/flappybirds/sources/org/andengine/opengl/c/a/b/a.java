package org.andengine.opengl.c.a.b;

public abstract class a implements b {
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "( " + c() + "x" + d() + " @ " + this.a + "/" + this.b + " )";
    }
}
