package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.v;

public final class o extends v implements p {
    private int a;
    private int b;
    private int c;

    private o() {
        m();
    }

    private void m() {
    }

    /* access modifiers changed from: private */
    public static o n() {
        return new o();
    }

    /* renamed from: a */
    public o g() {
        return n().a(d());
    }

    public o a(int i) {
        this.a |= 1;
        this.b = i;
        return this;
    }

    public o a(m mVar) {
        if (mVar != m.a()) {
            if (mVar.d()) {
                a(mVar.e());
            }
            if (mVar.f()) {
                b(mVar.g());
            }
            a(r().a(mVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public o c(k kVar, com.google.tagmanager.a.o oVar) {
        m mVar;
        m mVar2;
        try {
            m mVar3 = (m) m.a.b(kVar, oVar);
            if (mVar3 != null) {
                a(mVar3);
            }
            return this;
        } catch (af e) {
            af afVar = e;
            mVar2 = (m) afVar.a();
            throw afVar;
        } catch (Throwable th) {
            Throwable th2 = th;
            mVar = mVar2;
            th = th2;
        }
        if (mVar != null) {
            a(mVar);
        }
        throw th;
    }

    /* renamed from: b */
    public m p() {
        return m.a();
    }

    public o b(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    /* renamed from: c */
    public m h() {
        m d = d();
        if (d.j()) {
            return d;
        }
        throw a(d);
    }

    public m d() {
        int i = 1;
        m mVar = new m((v) this);
        int i2 = this.a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        int unused = mVar.f = this.b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        int unused2 = mVar.g = this.c;
        int unused3 = mVar.e = i;
        return mVar;
    }

    public boolean i() {
        return (this.a & 1) == 1;
    }

    public final boolean j() {
        return i() && k();
    }

    public boolean k() {
        return (this.a & 2) == 2;
    }
}
