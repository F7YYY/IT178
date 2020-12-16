package com.google.analytics.a.a;

import com.google.analytics.b.a.a.c;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.bg;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s extends v implements t {
    private int a;
    private ai b = ah.a;
    private List c = Collections.emptyList();
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();
    private Object i = "";
    private Object j = "";
    private Object k = "0";
    private Object l = "";
    private c m = c.a();
    private float n;
    private boolean o;
    private ai p = ah.a;
    private int q;

    private s() {
        q();
    }

    private void A() {
        if ((this.a & 16384) != 16384) {
            this.p = new ah(this.p);
            this.a |= 16384;
        }
    }

    private void q() {
    }

    /* access modifiers changed from: private */
    public static s s() {
        return new s();
    }

    private void t() {
        if ((this.a & 1) != 1) {
            this.b = new ah(this.b);
            this.a |= 1;
        }
    }

    private void u() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList(this.c);
            this.a |= 2;
        }
    }

    private void v() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList(this.d);
            this.a |= 4;
        }
    }

    private void w() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList(this.e);
            this.a |= 8;
        }
    }

    private void x() {
        if ((this.a & 16) != 16) {
            this.f = new ArrayList(this.f);
            this.a |= 16;
        }
    }

    private void y() {
        if ((this.a & 32) != 32) {
            this.g = new ArrayList(this.g);
            this.a |= 32;
        }
    }

    private void z() {
        if ((this.a & 64) != 64) {
            this.h = new ArrayList(this.h);
            this.a |= 64;
        }
    }

    /* renamed from: a */
    public s g() {
        return s().a(d());
    }

    public s a(float f2) {
        this.a |= 4096;
        this.n = f2;
        return this;
    }

    public s a(c cVar) {
        if ((this.a & 2048) != 2048 || this.m == c.a()) {
            this.m = cVar;
        } else {
            this.m = c.a(this.m).a(cVar).d();
        }
        this.a |= 2048;
        return this;
    }

    public s a(q qVar) {
        if (qVar != q.a()) {
            if (!qVar.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = qVar.f;
                    this.a &= -2;
                } else {
                    t();
                    this.b.addAll(qVar.f);
                }
            }
            if (!qVar.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = qVar.g;
                    this.a &= -3;
                } else {
                    u();
                    this.c.addAll(qVar.g);
                }
            }
            if (!qVar.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = qVar.h;
                    this.a &= -5;
                } else {
                    v();
                    this.d.addAll(qVar.h);
                }
            }
            if (!qVar.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = qVar.i;
                    this.a &= -9;
                } else {
                    w();
                    this.e.addAll(qVar.i);
                }
            }
            if (!qVar.j.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = qVar.j;
                    this.a &= -17;
                } else {
                    x();
                    this.f.addAll(qVar.j);
                }
            }
            if (!qVar.k.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = qVar.k;
                    this.a &= -33;
                } else {
                    y();
                    this.g.addAll(qVar.k);
                }
            }
            if (!qVar.l.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = qVar.l;
                    this.a &= -65;
                } else {
                    z();
                    this.h.addAll(qVar.l);
                }
            }
            if (qVar.v()) {
                this.a |= 128;
                this.i = qVar.m;
            }
            if (qVar.x()) {
                this.a |= 256;
                this.j = qVar.n;
            }
            if (qVar.z()) {
                this.a |= 512;
                this.k = qVar.o;
            }
            if (qVar.B()) {
                this.a |= 1024;
                this.l = qVar.p;
            }
            if (qVar.D()) {
                a(qVar.E());
            }
            if (qVar.F()) {
                a(qVar.G());
            }
            if (qVar.H()) {
                a(qVar.I());
            }
            if (!qVar.t.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = qVar.t;
                    this.a &= -16385;
                } else {
                    A();
                    this.p.addAll(qVar.t);
                }
            }
            if (qVar.L()) {
                f(qVar.M());
            }
            a(r().a(qVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public s c(k kVar, o oVar) {
        q qVar;
        q qVar2;
        try {
            q qVar3 = (q) q.a.b(kVar, oVar);
            if (qVar3 != null) {
                a(qVar3);
            }
            return this;
        } catch (af e2) {
            af afVar = e2;
            qVar2 = (q) afVar.a();
            throw afVar;
        } catch (Throwable th) {
            Throwable th2 = th;
            qVar = qVar2;
            th = th2;
        }
        if (qVar != null) {
            a(qVar);
        }
        throw th;
    }

    public s a(boolean z) {
        this.a |= 8192;
        this.o = z;
        return this;
    }

    public c a(int i2) {
        return (c) this.c.get(i2);
    }

    public m b(int i2) {
        return (m) this.d.get(i2);
    }

    /* renamed from: b */
    public q p() {
        return q.a();
    }

    public i c(int i2) {
        return (i) this.e.get(i2);
    }

    /* renamed from: c */
    public q h() {
        q d2 = d();
        if (d2.j()) {
            return d2;
        }
        throw a(d2);
    }

    public i d(int i2) {
        return (i) this.f.get(i2);
    }

    public q d() {
        int i2 = 1;
        q qVar = new q((v) this);
        int i3 = this.a;
        if ((this.a & 1) == 1) {
            this.b = new bg(this.b);
            this.a &= -2;
        }
        ai unused = qVar.f = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= -3;
        }
        List unused2 = qVar.g = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        List unused3 = qVar.h = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        List unused4 = qVar.i = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        List unused5 = qVar.j = this.f;
        if ((this.a & 32) == 32) {
            this.g = Collections.unmodifiableList(this.g);
            this.a &= -33;
        }
        List unused6 = qVar.k = this.g;
        if ((this.a & 64) == 64) {
            this.h = Collections.unmodifiableList(this.h);
            this.a &= -65;
        }
        List unused7 = qVar.l = this.h;
        if ((i3 & 128) != 128) {
            i2 = 0;
        }
        Object unused8 = qVar.m = this.i;
        if ((i3 & 256) == 256) {
            i2 |= 2;
        }
        Object unused9 = qVar.n = this.j;
        if ((i3 & 512) == 512) {
            i2 |= 4;
        }
        Object unused10 = qVar.o = this.k;
        if ((i3 & 1024) == 1024) {
            i2 |= 8;
        }
        Object unused11 = qVar.p = this.l;
        if ((i3 & 2048) == 2048) {
            i2 |= 16;
        }
        c unused12 = qVar.q = this.m;
        if ((i3 & 4096) == 4096) {
            i2 |= 32;
        }
        float unused13 = qVar.r = this.n;
        if ((i3 & 8192) == 8192) {
            i2 |= 64;
        }
        boolean unused14 = qVar.s = this.o;
        if ((this.a & 16384) == 16384) {
            this.p = new bg(this.p);
            this.a &= -16385;
        }
        ai unused15 = qVar.t = this.p;
        if ((i3 & 32768) == 32768) {
            i2 |= 128;
        }
        int unused16 = qVar.u = this.q;
        int unused17 = qVar.e = i2;
        return qVar;
    }

    public i e(int i2) {
        return (i) this.g.get(i2);
    }

    public s f(int i2) {
        this.a |= 32768;
        this.q = i2;
        return this;
    }

    public int i() {
        return this.c.size();
    }

    public final boolean j() {
        for (int i2 = 0; i2 < i(); i2++) {
            if (!a(i2).j()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < k(); i3++) {
            if (!b(i3).j()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < l(); i4++) {
            if (!c(i4).j()) {
                return false;
            }
        }
        for (int i5 = 0; i5 < m(); i5++) {
            if (!d(i5).j()) {
                return false;
            }
        }
        for (int i6 = 0; i6 < n(); i6++) {
            if (!e(i6).j()) {
                return false;
            }
        }
        return true;
    }

    public int k() {
        return this.d.size();
    }

    public int l() {
        return this.e.size();
    }

    public int m() {
        return this.f.size();
    }

    public int n() {
        return this.g.size();
    }
}
