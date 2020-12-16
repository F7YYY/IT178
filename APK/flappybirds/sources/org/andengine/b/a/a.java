package org.andengine.b.a;

import org.andengine.b.b.c;
import org.andengine.b.b.d;
import org.andengine.opengl.util.e;

public class a implements c {
    static final float[] a = new float[2];
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f = 0.0f;
    protected float g = 0.0f;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected d m;
    private float n = -1.0f;
    private float o = 1.0f;
    private org.andengine.b.a.a.a p;
    private org.andengine.c.c q;

    public a(float f2, float f3, float f4, float f5) {
        a(f2, f3, f2 + f4, f3 + f5);
    }

    private void a(org.andengine.input.a.a aVar, float f2, float f3) {
        float a2 = a();
        float b2 = b();
        float c2 = c();
        aVar.a(a2 + ((b2 - a2) * f2), ((d() - c2) * f3) + c2);
    }

    private static void a(e eVar, float f2, float f3, float f4) {
        eVar.b(f2, f3, 0.0f);
        eVar.b(f4, 0.0f, 0.0f, 1.0f);
        eVar.b(-f2, -f3, 0.0f);
    }

    private void e(org.andengine.input.a.a aVar) {
        float f2 = this.f;
        if (f2 != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.a(a, -f2, g(), h());
            aVar.a(a[0], a[1]);
        }
    }

    private void f(org.andengine.input.a.a aVar) {
        float f2 = this.f;
        if (f2 != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.b(a, f2, g(), h());
            aVar.a(a[0], a[1]);
        }
    }

    private void g(org.andengine.input.a.a aVar) {
        float f2 = -this.g;
        if (f2 != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.a(a, f2, (this.c - this.b) * 0.5f, (this.e - this.d) * 0.5f);
            aVar.a(a[0], a[1]);
        }
    }

    private void h(org.andengine.input.a.a aVar) {
        float f2 = -this.g;
        if (f2 != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.b(a, f2, (this.c - this.b) * 0.5f, (this.e - this.d) * 0.5f);
            aVar.a(a[0], a[1]);
        }
    }

    public float a() {
        return this.b;
    }

    public void a(float f2, float f3) {
        float g2 = f2 - g();
        float h2 = f3 - h();
        this.b += g2;
        this.c = g2 + this.c;
        this.d += h2;
        this.e += h2;
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f4;
        this.d = f3;
        this.e = f5;
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (this.k == 0 && this.j == 0) {
            b(i2, i3, i4, i5);
        } else if (this.j != i4 || this.k != i5) {
            a(this.h, this.i, this.j, this.k, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.l) {
            float g2 = g();
            float h2 = h();
            float e2 = (((float) i8) / ((float) i4)) * e() * 0.5f;
            float f2 = (((float) i9) / ((float) i5)) * f() * 0.5f;
            a(g2 - e2, h2 - f2, e2 + g2, f2 + h2);
        }
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    public void a(org.andengine.input.a.a aVar) {
        f(aVar);
        c(aVar);
        g(aVar);
    }

    public void a(org.andengine.input.a.a aVar, int i2, int i3) {
        float f2;
        float f3;
        float b2 = aVar.b();
        float c2 = aVar.c();
        float f4 = this.f;
        if (f4 == 0.0f) {
            f2 = b2 / ((float) i2);
            f3 = c2 / ((float) i3);
        } else if (f4 == 180.0f) {
            f2 = 1.0f - (b2 / ((float) i2));
            f3 = 1.0f - (c2 / ((float) i3));
        } else {
            a[0] = b2;
            a[1] = c2;
            org.andengine.d.g.a.a(a, f4, (float) (i2 >> 1), (float) (i3 >> 1));
            f2 = a[0] / ((float) i2);
            f3 = a[1] / ((float) i3);
        }
        a(aVar, f2, f3);
    }

    public void a(e eVar) {
        if (this.p != null) {
            this.p.a(eVar, this);
        }
    }

    public void a_(float f2) {
        if (this.m != null) {
            this.m.a_(f2);
        }
        if (this.p != null) {
            this.p.a_(f2);
        }
        l();
    }

    public float b() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void b(int i2, int i3, int i4, int i5) {
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    public void b(org.andengine.input.a.a aVar) {
        h(aVar);
        d(aVar);
        e(aVar);
    }

    public void b(e eVar) {
        eVar.a(a(), b(), d(), c(), this.n, this.o);
        float f2 = this.f;
        if (f2 != 0.0f) {
            a(eVar, g(), h(), f2);
        }
    }

    public float c() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public void c(org.andengine.input.a.a aVar) {
        aVar.b(-this.b, -this.d);
    }

    public void c(e eVar) {
        float e2 = e();
        float f2 = f();
        eVar.a(0.0f, e2, f2, 0.0f, this.n, this.o);
        float f3 = this.f;
        if (f3 != 0.0f) {
            a(eVar, e2 * 0.5f, f2 * 0.5f, f3);
        }
    }

    public float d() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void d(org.andengine.input.a.a aVar) {
        aVar.b(this.b, this.d);
    }

    public void d(e eVar) {
        float e2 = e();
        float f2 = f();
        eVar.a(0.0f, e2, f2, 0.0f, this.n, this.o);
        float f3 = this.g;
        if (f3 != 0.0f) {
            a(eVar, e2 * 0.5f, f2 * 0.5f, f3);
        }
    }

    public float e() {
        return this.c - this.b;
    }

    public float f() {
        return this.e - this.d;
    }

    public float g() {
        return (this.b + this.c) * 0.5f;
    }

    public float h() {
        return (this.d + this.e) * 0.5f;
    }

    public org.andengine.b.a.a.a i() {
        return this.p;
    }

    public boolean j() {
        return this.p != null;
    }

    public float k() {
        return this.f;
    }

    public void l() {
        if (this.q != null) {
            float[] h2 = this.q.h();
            a(h2[0], h2[1]);
        }
    }
}
