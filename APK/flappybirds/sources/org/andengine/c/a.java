package org.andengine.c;

import org.andengine.b.b.d;
import org.andengine.d.a.a.b;
import org.andengine.d.c;
import org.andengine.opengl.util.e;

public class a implements c {
    private static final float[] a = new float[2];
    private static final float[] b = new float[2];
    private static final org.andengine.d.c.a c = new b();
    protected float A;
    protected float B;
    protected float C;
    protected float D;
    protected float E;
    protected float F;
    protected float G;
    protected float H;
    private org.andengine.d.a.d.a I;
    private org.andengine.d.a.d.a J;
    private c d;
    private org.andengine.c.a.a e;
    private d f;
    private boolean g;
    private boolean h;
    private org.andengine.d.a.d.a i;
    private org.andengine.d.a.d.a j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected int r;
    protected int s;
    protected b t;
    protected org.andengine.d.d.a u;
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    protected float z;

    public a() {
        this(0.0f, 0.0f);
    }

    public a(float f2, float f3) {
        this.l = true;
        this.o = true;
        this.r = Integer.MIN_VALUE;
        this.s = 0;
        this.u = new org.andengine.d.d.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.g = true;
        this.h = true;
        this.v = f2;
        this.w = f3;
    }

    private void a() {
        this.t = new b(4);
    }

    private void c(c cVar) {
        if (cVar.d()) {
            String simpleName = cVar.getClass().getSimpleName();
            String simpleName2 = cVar.e().getClass().getSimpleName();
            throw new IllegalStateException("pEntity '" + simpleName + "' already has a parent: '" + simpleName2 + "'. New parent: '" + getClass().getSimpleName() + "'!");
        }
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
        if (this.e != null) {
            this.e.a_(f2);
        }
        if (this.f != null) {
            this.f.a_(f2);
        }
        if (this.t != null && !this.p) {
            b bVar = this.t;
            int size = bVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((c) bVar.get(i2)).a_(f2);
            }
        }
    }

    public void a(StringBuilder sb) {
        sb.append(getClass().getSimpleName());
        if (this.t != null && this.t.size() > 0) {
            sb.append(" [");
            b bVar = this.t;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bVar.size()) {
                    sb.append("]");
                    return;
                }
                ((c) bVar.get(i3)).a(sb);
                if (i3 < bVar.size() - 1) {
                    sb.append(", ");
                }
                i2 = i3 + 1;
            }
        }
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    /* access modifiers changed from: protected */
    public void a(e eVar) {
        b(eVar);
        c(eVar);
        d(eVar);
        e(eVar);
    }

    public final void a(e eVar, org.andengine.b.a.a aVar) {
        if (!this.l) {
            return;
        }
        if (!this.m || !a(aVar)) {
            e(eVar, aVar);
        }
    }

    public void a(boolean z2) {
        this.l = z2;
    }

    public boolean a(org.andengine.b.a.a aVar) {
        return false;
    }

    public float[] a(float f2, float f3, float[] fArr) {
        org.andengine.d.a.d.a k2 = k();
        fArr[0] = f2;
        fArr[1] = f3;
        k2.a(fArr);
        return fArr;
    }

    public final void a_(float f2) {
        if (!this.n) {
            a(f2);
        }
    }

    public float[] a_(float f2, float f3) {
        return a(f2, f3, b);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void b(float f2) {
        if (this.u.a(f2)) {
            b();
        }
    }

    public void b(c cVar) {
        c(cVar);
        if (this.t == null) {
            a();
        }
        this.t.add(cVar);
        cVar.a((c) this);
        cVar.m();
    }

    /* access modifiers changed from: protected */
    public void b(e eVar) {
        eVar.a(this.v, this.w, 0.0f);
    }

    /* access modifiers changed from: protected */
    public void b(e eVar, org.andengine.b.a.a aVar) {
    }

    public float[] b(float f2, float f3) {
        return b(f2, f3, a);
    }

    public float[] b(float f2, float f3, float[] fArr) {
        fArr[0] = f2;
        fArr[1] = f3;
        l().a(fArr);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public void c(e eVar) {
        float f2 = this.x;
        if (f2 != 0.0f) {
            float f3 = this.y;
            float f4 = this.z;
            eVar.a(f3, f4, 0.0f);
            eVar.a(f2, 0.0f, 0.0f, 1.0f);
            eVar.a(-f3, -f4, 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void c(e eVar, org.andengine.b.a.a aVar) {
    }

    public boolean c() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public void d(e eVar) {
        float f2 = this.E;
        float f3 = this.F;
        if (f2 != 0.0f || f3 != 0.0f) {
            float f4 = this.G;
            float f5 = this.H;
            eVar.a(f4, f5, 0.0f);
            eVar.a(f2, f3);
            eVar.a(-f4, -f5, 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void d(e eVar, org.andengine.b.a.a aVar) {
    }

    public boolean d() {
        return this.d != null;
    }

    public c e() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public void e(e eVar) {
        float f2 = this.A;
        float f3 = this.B;
        if (f2 != 1.0f || f3 != 1.0f) {
            float f4 = this.C;
            float f5 = this.D;
            eVar.a(f4, f5, 0.0f);
            eVar.a(f2, f3, 1);
            eVar.a(-f4, -f5, 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void e(e eVar, org.andengine.b.a.a aVar) {
        int i2 = 0;
        eVar.j();
        a(eVar);
        b bVar = this.t;
        if (bVar == null || !this.o) {
            b(eVar, aVar);
            c(eVar, aVar);
            d(eVar, aVar);
        } else {
            if (this.q) {
                d.a().a(this.t);
                this.q = false;
            }
            int size = bVar.size();
            while (i2 < size) {
                c cVar = (c) bVar.get(i2);
                if (cVar.f() >= 0) {
                    break;
                }
                cVar.a(eVar, aVar);
                i2++;
            }
            b(eVar, aVar);
            c(eVar, aVar);
            d(eVar, aVar);
            while (i2 < size) {
                ((c) bVar.get(i2)).a(eVar, aVar);
                i2++;
            }
        }
        eVar.k();
    }

    public int f() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        if (!this.k) {
            n();
        }
    }

    public org.andengine.d.d.a g() {
        return this.u;
    }

    public float[] h() {
        return a_(0.0f, 0.0f);
    }

    public org.andengine.d.a.d.a i() {
        if (this.i == null) {
            this.i = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.i;
        if (this.g) {
            aVar.a();
            float f2 = this.A;
            float f3 = this.B;
            if (!(f2 == 1.0f && f3 == 1.0f)) {
                float f4 = this.C;
                float f5 = this.D;
                aVar.a(-f4, -f5);
                aVar.b(f2, f3);
                aVar.a(f4, f5);
            }
            float f6 = this.E;
            float f7 = this.F;
            if (!(f6 == 0.0f && f7 == 0.0f)) {
                float f8 = this.G;
                float f9 = this.H;
                aVar.a(-f8, -f9);
                aVar.c(f6, f7);
                aVar.a(f8, f9);
            }
            float f10 = this.x;
            if (f10 != 0.0f) {
                float f11 = this.y;
                float f12 = this.z;
                aVar.a(-f11, -f12);
                aVar.a(f10);
                aVar.a(f11, f12);
            }
            aVar.a(this.v, this.w);
            this.g = false;
        }
        return aVar;
    }

    public org.andengine.d.a.d.a j() {
        if (this.j == null) {
            this.j = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.j;
        if (this.h) {
            aVar.a();
            aVar.a(-this.v, -this.w);
            float f2 = this.x;
            if (f2 != 0.0f) {
                float f3 = this.y;
                float f4 = this.z;
                aVar.a(-f3, -f4);
                aVar.a(-f2);
                aVar.a(f3, f4);
            }
            float f5 = this.E;
            float f6 = this.F;
            if (!(f5 == 0.0f && f6 == 0.0f)) {
                float f7 = this.G;
                float f8 = this.H;
                aVar.a(-f7, -f8);
                aVar.c(-f5, -f6);
                aVar.a(f7, f8);
            }
            float f9 = this.A;
            float f10 = this.B;
            if (!(f9 == 1.0f && f10 == 1.0f)) {
                float f11 = this.C;
                float f12 = this.D;
                aVar.a(-f11, -f12);
                aVar.b(1.0f / f9, 1.0f / f10);
                aVar.a(f11, f12);
            }
            this.h = false;
        }
        return aVar;
    }

    public org.andengine.d.a.d.a k() {
        if (this.I == null) {
            this.I = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.I;
        aVar.a(i());
        c cVar = this.d;
        if (cVar != null) {
            aVar.b(cVar.k());
        }
        return aVar;
    }

    public org.andengine.d.a.d.a l() {
        if (this.J == null) {
            this.J = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.J;
        aVar.a(j());
        c cVar = this.d;
        if (cVar != null) {
            aVar.c(cVar.l());
        }
        return aVar;
    }

    public void m() {
    }

    public void n() {
        if (!this.k) {
            this.k = true;
            return;
        }
        throw new c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }
}
