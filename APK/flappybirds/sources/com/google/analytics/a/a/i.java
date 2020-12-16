package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.ac;
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

public final class i extends t implements l {
    public static aq a = new j();
    private static final i c = new i(true);
    private static volatile ap m = null;
    /* access modifiers changed from: private */
    public final h d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public List f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    private byte k;
    private int l;

    static {
        c.u();
    }

    private i(k kVar, o oVar) {
        boolean z = false;
        this.k = -1;
        this.l = -1;
        u();
        j i2 = h.i();
        m a2 = m.a((OutputStream) i2);
        boolean z2 = false;
        while (!z) {
            try {
                int a3 = kVar.a();
                switch (a3) {
                    case e.MapAttrs_mapType /*0*/:
                        z = true;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        this.e |= 8;
                        this.j = kVar.i();
                        break;
                    case 16:
                        this.e |= 1;
                        this.g = kVar.f();
                        break;
                    case 24:
                        if (!z2 || !true) {
                            this.f = new ArrayList();
                            z2 |= true;
                        }
                        this.f.add(Integer.valueOf(kVar.f()));
                        break;
                    case 26:
                        int c2 = kVar.c(kVar.s());
                        if ((!z2 || !true) && kVar.w() > 0) {
                            this.f = new ArrayList();
                            z2 |= true;
                        }
                        while (kVar.w() > 0) {
                            this.f.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(c2);
                        break;
                    case 32:
                        this.e |= 2;
                        this.h = kVar.f();
                        break;
                    case 48:
                        this.e |= 4;
                        this.i = kVar.i();
                        break;
                    default:
                        if (a(kVar, a2, oVar, a3)) {
                            break;
                        } else {
                            z = true;
                            break;
                        }
                }
            } catch (af e2) {
                throw e2.a(this);
            } catch (IOException e3) {
                throw new af(e3.getMessage()).a(this);
            } catch (Throwable th) {
                if (z2 && true) {
                    this.f = Collections.unmodifiableList(this.f);
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
        if (z2 && true) {
            this.f = Collections.unmodifiableList(this.f);
        }
        try {
            a2.a();
        } catch (IOException e5) {
        } finally {
            this.d = i2.a();
        }
        R();
    }

    private i(v vVar) {
        super(vVar);
        this.k = -1;
        this.l = -1;
        this.d = vVar.r();
    }

    private i(boolean z) {
        this.k = -1;
        this.l = -1;
        this.d = h.a;
    }

    public static i a() {
        return c;
    }

    public static k a(i iVar) {
        return r().a(iVar);
    }

    public static k r() {
        return k.m();
    }

    private void u() {
        this.f = Collections.emptyList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
    }

    /* renamed from: b */
    public i p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public List d() {
        return this.f;
    }

    public int e() {
        return this.f.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return super.equals(obj);
        }
        i iVar = (i) obj;
        boolean z = (d().equals(iVar.d())) && f() == iVar.f();
        if (f()) {
            z = z && g() == iVar.g();
        }
        boolean z2 = z && h() == iVar.h();
        if (h()) {
            z2 = z2 && i() == iVar.i();
        }
        boolean z3 = z2 && k() == iVar.k();
        if (k()) {
            z3 = z3 && l() == iVar.l();
        }
        boolean z4 = z3 && m() == iVar.m();
        return m() ? z4 && q() == iVar.q() : z4;
    }

    public boolean f() {
        return (this.e & 1) == 1;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return (this.e & 2) == 2;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = i.class.hashCode() + 779;
        if (e() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + d().hashCode();
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g();
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 4) * 53) + i();
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 6) * 53) + ac.a(l());
        }
        if (m()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.a(q());
        }
        int hashCode2 = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode2;
        return hashCode2;
    }

    public int i() {
        return this.h;
    }

    public final boolean j() {
        byte b = this.k;
        if (b != -1) {
            return b == 1;
        }
        if (!f()) {
            this.k = 0;
            return false;
        }
        this.k = 1;
        return true;
    }

    public boolean k() {
        return (this.e & 4) == 4;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return (this.e & 8) == 8;
    }

    public boolean q() {
        return this.j;
    }

    /* renamed from: s */
    public k o() {
        return r();
    }

    /* renamed from: t */
    public k n() {
        return a(this);
    }
}
