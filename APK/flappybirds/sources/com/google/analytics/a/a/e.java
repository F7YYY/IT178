package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;

public final class e extends v implements h {
    private int a;
    private f b = f.NO_CACHE;
    private int c;
    private int d;

    private e() {
        k();
    }

    private void k() {
    }

    /* access modifiers changed from: private */
    public static e l() {
        return new e();
    }

    /* renamed from: a */
    public e g() {
        return l().a(d());
    }

    public e a(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    public e a(c cVar) {
        if (cVar != c.a()) {
            if (cVar.d()) {
                a(cVar.e());
            }
            if (cVar.f()) {
                a(cVar.g());
            }
            if (cVar.h()) {
                b(cVar.i());
            }
            a(r().a(cVar.d));
        }
        return this;
    }

    public e a(f fVar) {
        if (fVar == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = fVar;
        return this;
    }

    /* renamed from: a */
    public e c(k kVar, o oVar) {
        c cVar;
        c cVar2;
        try {
            c cVar3 = (c) c.a.b(kVar, oVar);
            if (cVar3 != null) {
                a(cVar3);
            }
            return this;
        } catch (af e) {
            af afVar = e;
            cVar2 = (c) afVar.a();
            throw afVar;
        } catch (Throwable th) {
            Throwable th2 = th;
            cVar = cVar2;
            th = th2;
        }
        if (cVar != null) {
            a(cVar);
        }
        throw th;
    }

    /* renamed from: b */
    public c p() {
        return c.a();
    }

    public e b(int i) {
        this.a |= 4;
        this.d = i;
        return this;
    }

    /* renamed from: c */
    public c h() {
        c d2 = d();
        if (d2.j()) {
            return d2;
        }
        throw a(d2);
    }

    public c d() {
        int i = 1;
        c cVar = new c((v) this);
        int i2 = this.a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        f unused = cVar.f = this.b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        int unused2 = cVar.g = this.c;
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        int unused3 = cVar.h = this.d;
        int unused4 = cVar.e = i;
        return cVar;
    }

    public final boolean j() {
        return true;
    }
}
