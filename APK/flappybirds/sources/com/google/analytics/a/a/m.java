package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.j;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;
import java.io.OutputStream;

public final class m extends t implements p {
    public static aq a = new n();
    private static final m c = new m(true);
    private static volatile ap j = null;
    /* access modifiers changed from: private */
    public final h d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    private byte h;
    private int i;

    static {
        c.l();
    }

    private m(k kVar, o oVar) {
        this.h = -1;
        this.i = -1;
        l();
        j i2 = h.i();
        com.google.tagmanager.a.m a2 = com.google.tagmanager.a.m.a((OutputStream) i2);
        boolean z = false;
        while (!z) {
            try {
                int a3 = kVar.a();
                switch (a3) {
                    case e.MapAttrs_mapType /*0*/:
                        z = true;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        this.e |= 1;
                        this.f = kVar.f();
                        break;
                    case 16:
                        this.e |= 2;
                        this.g = kVar.f();
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

    private m(v vVar) {
        super(vVar);
        this.h = -1;
        this.i = -1;
        this.d = vVar.r();
    }

    private m(boolean z) {
        this.h = -1;
        this.i = -1;
        this.d = h.a;
    }

    public static m a() {
        return c;
    }

    public static o a(m mVar) {
        return h().a(mVar);
    }

    public static o h() {
        return o.n();
    }

    private void l() {
        this.f = 0;
        this.g = 0;
    }

    /* renamed from: b */
    public m p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        boolean z = d() == mVar.d();
        if (d()) {
            z = z && e() == mVar.e();
        }
        boolean z2 = z && f() == mVar.f();
        return f() ? z2 && g() == mVar.g() : z2;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public int g() {
        return this.g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = m.class.hashCode() + 779;
        if (d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + e();
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g();
        }
        int hashCode2 = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode2;
        return hashCode2;
    }

    /* renamed from: i */
    public o o() {
        return h();
    }

    public final boolean j() {
        byte b = this.h;
        if (b != -1) {
            return b == 1;
        }
        if (!d()) {
            this.h = 0;
            return false;
        } else if (!f()) {
            this.h = 0;
            return false;
        } else {
            this.h = 1;
            return true;
        }
    }

    /* renamed from: k */
    public o n() {
        return a(this);
    }
}
