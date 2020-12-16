package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ad;
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

public final class c extends t implements h {
    public static aq a = new d();
    private static final c c = new c(true);
    private static volatile ap k = null;
    /* access modifiers changed from: private */
    public final h d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public f f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    private byte i;
    private int j;

    static {
        c.q();
    }

    private c(k kVar, o oVar) {
        this.i = -1;
        this.j = -1;
        q();
        j i2 = h.i();
        m a2 = m.a((OutputStream) i2);
        boolean z = false;
        while (!z) {
            try {
                int a3 = kVar.a();
                switch (a3) {
                    case e.MapAttrs_mapType /*0*/:
                        z = true;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        int n = kVar.n();
                        f a4 = f.a(n);
                        if (a4 != null) {
                            this.e |= 1;
                            this.f = a4;
                            break;
                        } else {
                            a2.d(a3);
                            a2.d(n);
                            break;
                        }
                    case 16:
                        this.e |= 2;
                        this.g = kVar.f();
                        break;
                    case 24:
                        this.e |= 4;
                        this.h = kVar.f();
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
        try {
            a2.a();
        } catch (IOException e5) {
        } finally {
            this.d = i2.a();
        }
        R();
    }

    private c(v vVar) {
        super(vVar);
        this.i = -1;
        this.j = -1;
        this.d = vVar.r();
    }

    private c(boolean z) {
        this.i = -1;
        this.j = -1;
        this.d = h.a;
    }

    public static c a() {
        return c;
    }

    public static e a(c cVar) {
        return k().a(cVar);
    }

    public static e k() {
        return e.l();
    }

    private void q() {
        this.f = f.NO_CACHE;
        this.g = 0;
        this.h = 0;
    }

    /* renamed from: b */
    public c p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return super.equals(obj);
        }
        c cVar = (c) obj;
        boolean z = d() == cVar.d();
        if (d()) {
            z = z && e() == cVar.e();
        }
        boolean z2 = z && f() == cVar.f();
        if (f()) {
            z2 = z2 && g() == cVar.g();
        }
        boolean z3 = z2 && h() == cVar.h();
        return h() ? z3 && i() == cVar.i() : z3;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return (this.e & 4) == 4;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = c.class.hashCode() + 779;
        if (d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.a((ad) e());
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g();
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 3) * 53) + i();
        }
        int hashCode2 = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode2;
        return hashCode2;
    }

    public int i() {
        return this.h;
    }

    public final boolean j() {
        byte b = this.i;
        if (b != -1) {
            return b == 1;
        }
        this.i = 1;
        return true;
    }

    /* renamed from: l */
    public e o() {
        return k();
    }

    /* renamed from: m */
    public e n() {
        return a(this);
    }
}
