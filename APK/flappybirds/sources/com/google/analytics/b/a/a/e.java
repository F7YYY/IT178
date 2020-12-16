package com.google.analytics.b.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.w;
import com.google.tagmanager.a.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class e extends w implements j {
    private int a;
    private h b = h.STRING;
    private Object c = "";
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private Object g = "";
    private Object h = "";
    private long i;
    private boolean j;
    private List k = Collections.emptyList();
    private List l = Collections.emptyList();
    private boolean m;

    private e() {
        t();
    }

    private void t() {
    }

    /* access modifiers changed from: private */
    public static e u() {
        return new e();
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
        if ((this.a & 512) != 512) {
            this.k = new ArrayList(this.k);
            this.a |= 512;
        }
    }

    private void z() {
        if ((this.a & 1024) != 1024) {
            this.l = new ArrayList(this.l);
            this.a |= 1024;
        }
    }

    public c a(int i2) {
        return (c) this.d.get(i2);
    }

    /* renamed from: a */
    public e o() {
        return u().a(d());
    }

    public e a(long j2) {
        this.a |= 128;
        this.i = j2;
        return this;
    }

    public e a(c cVar) {
        if (cVar != c.a()) {
            if (cVar.d()) {
                a(cVar.e());
            }
            if (cVar.f()) {
                this.a |= 2;
                this.c = cVar.g;
            }
            if (!cVar.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = cVar.h;
                    this.a &= -5;
                } else {
                    v();
                    this.d.addAll(cVar.h);
                }
            }
            if (!cVar.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = cVar.i;
                    this.a &= -9;
                } else {
                    w();
                    this.e.addAll(cVar.i);
                }
            }
            if (!cVar.j.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = cVar.j;
                    this.a &= -17;
                } else {
                    x();
                    this.f.addAll(cVar.j);
                }
            }
            if (cVar.r()) {
                this.a |= 32;
                this.g = cVar.k;
            }
            if (cVar.t()) {
                this.a |= 64;
                this.h = cVar.l;
            }
            if (cVar.v()) {
                a(cVar.w());
            }
            if (cVar.x()) {
                a(cVar.y());
            }
            if (!cVar.o.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = cVar.o;
                    this.a &= -513;
                } else {
                    y();
                    this.k.addAll(cVar.o);
                }
            }
            if (!cVar.p.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = cVar.p;
                    this.a &= -1025;
                } else {
                    z();
                    this.l.addAll(cVar.p);
                }
            }
            if (cVar.D()) {
                b(cVar.E());
            }
            a((x) cVar);
            a(r().a(cVar.d));
        }
        return this;
    }

    public e a(h hVar) {
        if (hVar == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = hVar;
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
        } catch (af e2) {
            af afVar = e2;
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

    public e a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = str;
        return this;
    }

    public e a(boolean z) {
        this.a |= 256;
        this.j = z;
        return this;
    }

    /* renamed from: b */
    public c p() {
        return c.a();
    }

    public c b(int i2) {
        return (c) this.e.get(i2);
    }

    public e b(c cVar) {
        if (cVar == null) {
            throw new NullPointerException();
        }
        v();
        this.d.add(cVar);
        return this;
    }

    public e b(boolean z) {
        this.a |= 2048;
        this.m = z;
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

    public c c(int i2) {
        return (c) this.f.get(i2);
    }

    public e c(c cVar) {
        if (cVar == null) {
            throw new NullPointerException();
        }
        w();
        this.e.add(cVar);
        return this;
    }

    public c d() {
        int i2 = 1;
        c cVar = new c((w) this);
        int i3 = this.a;
        if ((i3 & 1) != 1) {
            i2 = 0;
        }
        h unused = cVar.f = this.b;
        if ((i3 & 2) == 2) {
            i2 |= 2;
        }
        Object unused2 = cVar.g = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        List unused3 = cVar.h = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        List unused4 = cVar.i = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        List unused5 = cVar.j = this.f;
        if ((i3 & 32) == 32) {
            i2 |= 4;
        }
        Object unused6 = cVar.k = this.g;
        if ((i3 & 64) == 64) {
            i2 |= 8;
        }
        Object unused7 = cVar.l = this.h;
        if ((i3 & 128) == 128) {
            i2 |= 16;
        }
        long unused8 = cVar.m = this.i;
        if ((i3 & 256) == 256) {
            i2 |= 32;
        }
        boolean unused9 = cVar.n = this.j;
        if ((this.a & 512) == 512) {
            this.k = Collections.unmodifiableList(this.k);
            this.a &= -513;
        }
        List unused10 = cVar.o = this.k;
        if ((this.a & 1024) == 1024) {
            this.l = Collections.unmodifiableList(this.l);
            this.a &= -1025;
        }
        List unused11 = cVar.p = this.l;
        if ((i3 & 2048) == 2048) {
            i2 |= 64;
        }
        boolean unused12 = cVar.q = this.m;
        int unused13 = cVar.e = i2;
        return cVar;
    }

    public c d(int i2) {
        return (c) this.k.get(i2);
    }

    public e d(c cVar) {
        if (cVar == null) {
            throw new NullPointerException();
        }
        x();
        this.f.add(cVar);
        return this;
    }

    public boolean i() {
        return (this.a & 1) == 1;
    }

    public final boolean j() {
        if (!i()) {
            return false;
        }
        for (int i2 = 0; i2 < k(); i2++) {
            if (!a(i2).j()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < l(); i3++) {
            if (!b(i3).j()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < m(); i4++) {
            if (!c(i4).j()) {
                return false;
            }
        }
        for (int i5 = 0; i5 < n(); i5++) {
            if (!d(i5).j()) {
                return false;
            }
        }
        return s();
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
        return this.k.size();
    }
}
