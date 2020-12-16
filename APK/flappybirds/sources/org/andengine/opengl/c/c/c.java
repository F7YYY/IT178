package org.andengine.opengl.c.c;

import org.andengine.opengl.c.a;

public class c extends a {
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected float i;
    protected final float j;
    protected final boolean k;

    public c(a aVar, float f2, float f3, float f4, float f5, float f6, boolean z) {
        super(aVar);
        this.b = f2;
        this.c = f3;
        if (z) {
            this.k = true;
            this.d = f5;
            this.e = f4;
        } else {
            this.k = false;
            this.d = f4;
            this.e = f5;
        }
        this.j = f6;
        l();
    }

    public c(a aVar, float f2, float f3, float f4, float f5, boolean z) {
        this(aVar, f2, f3, f4, f5, 1.0f, z);
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.f = f2;
        this.h = f3;
        this.g = f4;
        this.i = f5;
    }

    public float b() {
        return this.k ? this.e * this.j : this.d * this.j;
    }

    public float c() {
        return this.k ? this.d * this.j : this.e * this.j;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.h;
    }

    public float g() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public c i() {
        return this.k ? new c(this.a, this.b, this.c, this.e, this.d, this.j, this.k) : new c(this.a, this.b, this.c, this.d, this.e, this.j, this.k);
    }

    public float j() {
        return this.b;
    }

    public float k() {
        return this.c;
    }

    public void l() {
        a aVar = this.a;
        float a = (float) aVar.a();
        float b2 = (float) aVar.b();
        float j2 = j();
        float k2 = k();
        this.f = j2 / a;
        this.g = (j2 + this.d) / a;
        this.h = k2 / b2;
        this.i = (this.e + k2) / b2;
    }
}
