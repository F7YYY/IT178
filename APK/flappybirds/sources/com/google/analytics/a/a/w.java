package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class w extends v implements x {
    private int a;
    private List b = Collections.emptyList();
    private List c = Collections.emptyList();
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();
    private List i = Collections.emptyList();
    private List j = Collections.emptyList();
    private List k = Collections.emptyList();

    private w() {
        k();
    }

    private void k() {
    }

    /* access modifiers changed from: private */
    public static w l() {
        return new w();
    }

    private void m() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList(this.b);
            this.a |= 1;
        }
    }

    private void n() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList(this.c);
            this.a |= 2;
        }
    }

    private void o() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList(this.d);
            this.a |= 4;
        }
    }

    private void q() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList(this.e);
            this.a |= 8;
        }
    }

    private void s() {
        if ((this.a & 16) != 16) {
            this.f = new ArrayList(this.f);
            this.a |= 16;
        }
    }

    private void t() {
        if ((this.a & 32) != 32) {
            this.g = new ArrayList(this.g);
            this.a |= 32;
        }
    }

    private void u() {
        if ((this.a & 64) != 64) {
            this.h = new ArrayList(this.h);
            this.a |= 64;
        }
    }

    private void v() {
        if ((this.a & 128) != 128) {
            this.i = new ArrayList(this.i);
            this.a |= 128;
        }
    }

    private void w() {
        if ((this.a & 256) != 256) {
            this.j = new ArrayList(this.j);
            this.a |= 256;
        }
    }

    private void x() {
        if ((this.a & 512) != 512) {
            this.k = new ArrayList(this.k);
            this.a |= 512;
        }
    }

    /* renamed from: a */
    public w g() {
        return l().a(d());
    }

    public w a(u uVar) {
        if (uVar != u.a()) {
            if (!uVar.e.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = uVar.e;
                    this.a &= -2;
                } else {
                    m();
                    this.b.addAll(uVar.e);
                }
            }
            if (!uVar.f.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = uVar.f;
                    this.a &= -3;
                } else {
                    n();
                    this.c.addAll(uVar.f);
                }
            }
            if (!uVar.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = uVar.g;
                    this.a &= -5;
                } else {
                    o();
                    this.d.addAll(uVar.g);
                }
            }
            if (!uVar.h.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = uVar.h;
                    this.a &= -9;
                } else {
                    q();
                    this.e.addAll(uVar.h);
                }
            }
            if (!uVar.i.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = uVar.i;
                    this.a &= -17;
                } else {
                    s();
                    this.f.addAll(uVar.i);
                }
            }
            if (!uVar.j.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = uVar.j;
                    this.a &= -33;
                } else {
                    t();
                    this.g.addAll(uVar.j);
                }
            }
            if (!uVar.k.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = uVar.k;
                    this.a &= -65;
                } else {
                    u();
                    this.h.addAll(uVar.k);
                }
            }
            if (!uVar.l.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = uVar.l;
                    this.a &= -129;
                } else {
                    v();
                    this.i.addAll(uVar.l);
                }
            }
            if (!uVar.m.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = uVar.m;
                    this.a &= -257;
                } else {
                    w();
                    this.j.addAll(uVar.m);
                }
            }
            if (!uVar.n.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = uVar.n;
                    this.a &= -513;
                } else {
                    x();
                    this.k.addAll(uVar.n);
                }
            }
            a(r().a(uVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public w c(k kVar, o oVar) {
        u uVar;
        u uVar2;
        try {
            u uVar3 = (u) u.a.b(kVar, oVar);
            if (uVar3 != null) {
                a(uVar3);
            }
            return this;
        } catch (af e2) {
            af afVar = e2;
            uVar2 = (u) afVar.a();
            throw afVar;
        } catch (Throwable th) {
            Throwable th2 = th;
            uVar = uVar2;
            th = th2;
        }
        if (uVar != null) {
            a(uVar);
        }
        throw th;
    }

    /* renamed from: b */
    public u p() {
        return u.a();
    }

    /* renamed from: c */
    public u h() {
        u d2 = d();
        if (d2.j()) {
            return d2;
        }
        throw a(d2);
    }

    public u d() {
        u uVar = new u((v) this);
        int i2 = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= -2;
        }
        List unused = uVar.e = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= -3;
        }
        List unused2 = uVar.f = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        List unused3 = uVar.g = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        List unused4 = uVar.h = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        List unused5 = uVar.i = this.f;
        if ((this.a & 32) == 32) {
            this.g = Collections.unmodifiableList(this.g);
            this.a &= -33;
        }
        List unused6 = uVar.j = this.g;
        if ((this.a & 64) == 64) {
            this.h = Collections.unmodifiableList(this.h);
            this.a &= -65;
        }
        List unused7 = uVar.k = this.h;
        if ((this.a & 128) == 128) {
            this.i = Collections.unmodifiableList(this.i);
            this.a &= -129;
        }
        List unused8 = uVar.l = this.i;
        if ((this.a & 256) == 256) {
            this.j = Collections.unmodifiableList(this.j);
            this.a &= -257;
        }
        List unused9 = uVar.m = this.j;
        if ((this.a & 512) == 512) {
            this.k = Collections.unmodifiableList(this.k);
            this.a &= -513;
        }
        List unused10 = uVar.n = this.k;
        return uVar;
    }

    public final boolean j() {
        return true;
    }
}
