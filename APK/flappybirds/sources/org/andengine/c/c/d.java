package org.andengine.c.c;

import org.andengine.c.a;
import org.andengine.opengl.b.g;
import org.andengine.opengl.c.c.b;
import org.andengine.opengl.c.f;
import org.andengine.opengl.d.c;
import org.andengine.opengl.util.e;

public abstract class d extends a implements b {
    protected int c = 770;
    protected int d = 771;
    protected boolean e = false;
    protected g f;

    public d(float f2, float f3, g gVar) {
        super(f2, f3);
        this.f = gVar;
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    /* access modifiers changed from: protected */
    public void a(org.andengine.opengl.c.a aVar) {
        a(aVar.g());
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        a(bVar.a());
    }

    /* access modifiers changed from: protected */
    public void a(f fVar) {
        if (fVar.n) {
            a(1, 771);
        }
    }

    public boolean a(org.andengine.input.a.a aVar, float f2, float f3) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void b(e eVar, org.andengine.b.a.a aVar) {
        if (this.e) {
            eVar.a();
            eVar.a(this.c, this.d);
        }
    }

    public void b(boolean z) {
        this.e = z;
    }

    /* access modifiers changed from: protected */
    public void d(e eVar, org.andengine.b.a.a aVar) {
        if (this.e) {
            eVar.b();
        }
    }

    public void n() {
        super.n();
        c a = a();
        if (a != null && a.b() && !a.c()) {
            a.n();
        }
    }
}
