package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.j;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.m;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class u extends t implements x {
    public static aq a = new v();
    private static final u c = new u(true);
    private static volatile ap q = null;
    /* access modifiers changed from: private */
    public final h d;
    /* access modifiers changed from: private */
    public List e;
    /* access modifiers changed from: private */
    public List f;
    /* access modifiers changed from: private */
    public List g;
    /* access modifiers changed from: private */
    public List h;
    /* access modifiers changed from: private */
    public List i;
    /* access modifiers changed from: private */
    public List j;
    /* access modifiers changed from: private */
    public List k;
    /* access modifiers changed from: private */
    public List l;
    /* access modifiers changed from: private */
    public List m;
    /* access modifiers changed from: private */
    public List n;
    private byte o;
    private int p;

    static {
        c.E();
    }

    private u(k kVar, o oVar) {
        this.o = -1;
        this.p = -1;
        E();
        boolean z = false;
        j i2 = h.i();
        m a2 = m.a((OutputStream) i2);
        boolean z2 = false;
        while (!z2) {
            try {
                int a3 = kVar.a();
                switch (a3) {
                    case e.MapAttrs_mapType /*0*/:
                        z2 = true;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        if (!z || !true) {
                            this.e = new ArrayList();
                            z |= true;
                        }
                        this.e.add(Integer.valueOf(kVar.f()));
                        break;
                    case e.MapAttrs_uiZoomControls /*10*/:
                        int c2 = kVar.c(kVar.s());
                        if ((!z || !true) && kVar.w() > 0) {
                            this.e = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.e.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c2);
                        break;
                    case 16:
                        if (!(z & true)) {
                            this.f = new ArrayList();
                            z |= true;
                        }
                        this.f.add(Integer.valueOf(kVar.f()));
                        break;
                    case 18:
                        int c3 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.f = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.f.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c3);
                        break;
                    case 24:
                        if (!(z & true)) {
                            this.g = new ArrayList();
                            z |= true;
                        }
                        this.g.add(Integer.valueOf(kVar.f()));
                        break;
                    case 26:
                        int c4 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.g = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.g.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c4);
                        break;
                    case 32:
                        if (!(z & true)) {
                            this.h = new ArrayList();
                            z |= true;
                        }
                        this.h.add(Integer.valueOf(kVar.f()));
                        break;
                    case 34:
                        int c5 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.h = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.h.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c5);
                        break;
                    case 40:
                        if (!(z & true)) {
                            this.i = new ArrayList();
                            z |= true;
                        }
                        this.i.add(Integer.valueOf(kVar.f()));
                        break;
                    case 42:
                        int c6 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.i = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.i.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c6);
                        break;
                    case 48:
                        if (!(z & true)) {
                            this.j = new ArrayList();
                            z |= true;
                        }
                        this.j.add(Integer.valueOf(kVar.f()));
                        break;
                    case 50:
                        int c7 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.j = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.j.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c7);
                        break;
                    case 56:
                        if (!(z & true)) {
                            this.k = new ArrayList();
                            z |= true;
                        }
                        this.k.add(Integer.valueOf(kVar.f()));
                        break;
                    case 58:
                        int c8 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.k = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.k.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c8);
                        break;
                    case 64:
                        if (!(z & true)) {
                            this.l = new ArrayList();
                            z |= true;
                        }
                        this.l.add(Integer.valueOf(kVar.f()));
                        break;
                    case 66:
                        int c9 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.l = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.l.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c9);
                        break;
                    case 72:
                        if (!(z & true)) {
                            this.m = new ArrayList();
                            z |= true;
                        }
                        this.m.add(Integer.valueOf(kVar.f()));
                        break;
                    case 74:
                        int c10 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.m = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.m.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c10);
                        break;
                    case 80:
                        if (!(z & true)) {
                            this.n = new ArrayList();
                            z |= true;
                        }
                        this.n.add(Integer.valueOf(kVar.f()));
                        break;
                    case 82:
                        int c11 = kVar.c(kVar.s());
                        if (!(z & true) && kVar.w() > 0) {
                            this.n = new ArrayList();
                            z |= true;
                        }
                        while (kVar.w() > 0) {
                            this.n.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c11);
                        break;
                    default:
                        if (a(kVar, a2, oVar, a3)) {
                            break;
                        } else {
                            z2 = true;
                            break;
                        }
                }
            } catch (af e2) {
                throw e2.a(this);
            } catch (IOException e3) {
                throw new af(e3.getMessage()).a(this);
            } catch (Throwable th) {
                if (z && true) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if (z & true) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if (z & true) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if (z & true) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if (z & true) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (z & true) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if (z & true) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (z & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (z & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (z & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    a2.a();
                } catch (IOException e4) {
                } finally {
                    this.d = i2.a();
                }
                R();
                throw th;
            }
        }
        if (z && true) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if (z & true) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if (z & true) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if (z & true) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if (z & true) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if (z & true) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if (z & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z & true) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if (z & true) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if (z & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            a2.a();
        } catch (IOException e5) {
        } finally {
            this.d = i2.a();
        }
        R();
    }

    private u(v vVar) {
        super(vVar);
        this.o = -1;
        this.p = -1;
        this.d = vVar.r();
    }

    private u(boolean z) {
        this.o = -1;
        this.p = -1;
        this.d = h.a;
    }

    public static w B() {
        return w.l();
    }

    private void E() {
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
    }

    public static u a() {
        return c;
    }

    public static w a(u uVar) {
        return B().a(uVar);
    }

    public int A() {
        return this.n.size();
    }

    /* renamed from: C */
    public w o() {
        return B();
    }

    /* renamed from: D */
    public w n() {
        return a(this);
    }

    /* renamed from: b */
    public u p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public List d() {
        return this.e;
    }

    public int e() {
        return this.e.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        return (((((((((d().equals(uVar.d())) && f().equals(uVar.f())) && h().equals(uVar.h())) && k().equals(uVar.k())) && m().equals(uVar.m())) && r().equals(uVar.r())) && t().equals(uVar.t())) && v().equals(uVar.v())) && x().equals(uVar.x())) && z().equals(uVar.z());
    }

    public List f() {
        return this.f;
    }

    public int g() {
        return this.f.size();
    }

    public List h() {
        return this.g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = u.class.hashCode() + 779;
        if (e() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
        }
        if (g() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
        }
        if (i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + k().hashCode();
        }
        if (q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m().hashCode();
        }
        if (s() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + r().hashCode();
        }
        if (u() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + t().hashCode();
        }
        if (w() > 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + v().hashCode();
        }
        if (y() > 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + x().hashCode();
        }
        if (A() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + z().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode2;
        return hashCode2;
    }

    public int i() {
        return this.g.size();
    }

    public final boolean j() {
        byte b = this.o;
        if (b != -1) {
            return b == 1;
        }
        this.o = 1;
        return true;
    }

    public List k() {
        return this.h;
    }

    public int l() {
        return this.h.size();
    }

    public List m() {
        return this.i;
    }

    public int q() {
        return this.i.size();
    }

    public List r() {
        return this.j;
    }

    public int s() {
        return this.j.size();
    }

    public List t() {
        return this.k;
    }

    public int u() {
        return this.k.size();
    }

    public List v() {
        return this.l;
    }

    public int w() {
        return this.l.size();
    }

    public List x() {
        return this.m;
    }

    public int y() {
        return this.m.size();
    }

    public List z() {
        return this.n;
    }
}
