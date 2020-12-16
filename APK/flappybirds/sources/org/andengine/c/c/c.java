package org.andengine.c.c;

import org.andengine.b.a.a;
import org.andengine.opengl.b.g;

public abstract class c extends d implements a {
    protected float a;
    protected float b;

    public c(float f, float f2, float f3, float f4, g gVar) {
        super(f, f2, gVar);
        this.a = f3;
        this.b = f4;
        q();
        r();
        s();
    }

    public boolean a(float f, float f2) {
        return org.andengine.d.b.a.c.a(this, f, f2);
    }

    public boolean a(a aVar) {
        return !org.andengine.d.b.a.c.a(aVar, this);
    }

    public float[] h() {
        return a_(this.a * 0.5f, this.b * 0.5f);
    }

    public float o() {
        return this.a;
    }

    public float p() {
        return this.b;
    }

    public void q() {
        this.y = this.a * 0.5f;
        this.z = this.b * 0.5f;
    }

    public void r() {
        this.C = this.a * 0.5f;
        this.D = this.b * 0.5f;
    }

    public void s() {
        this.G = this.a * 0.5f;
        this.H = this.b * 0.5f;
    }
}
