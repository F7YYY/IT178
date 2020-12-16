package org.andengine.opengl.c;

import org.andengine.opengl.util.e;

public abstract class d implements a {
    protected final e a;
    protected final c b;
    protected final f c;
    protected int d = -1;
    protected boolean e = false;
    protected b f;

    public d(e eVar, c cVar, f fVar, b bVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = fVar;
        this.f = bVar;
    }

    public void a(e eVar) {
        this.d = eVar.i();
        eVar.d(this.d);
        e(eVar);
        this.c.a();
        this.e = false;
        if (this.f != null) {
            this.f.a(this);
        }
    }

    public void b(e eVar) {
        eVar.e(this.d);
        this.d = -1;
        if (this.f != null) {
            this.f.b(this);
        }
    }

    public void c(e eVar) {
        b(eVar);
        a(eVar);
    }

    public boolean c() {
        return this.d != -1;
    }

    public void d() {
        this.d = -1;
    }

    public void d(e eVar) {
        eVar.d(this.d);
    }

    /* access modifiers changed from: protected */
    public abstract void e(e eVar);

    public boolean e() {
        return this.e;
    }

    public c f() {
        return this.b;
    }

    public f g() {
        return this.c;
    }

    public b h() {
        return this.f;
    }

    public void i() {
        this.a.a((a) this);
    }
}
