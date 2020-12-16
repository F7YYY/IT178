package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k extends v implements l {
    private int a;
    private List b = Collections.emptyList();
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    private k() {
        l();
    }

    private void l() {
    }

    /* access modifiers changed from: private */
    public static k m() {
        return new k();
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList(this.b);
            this.a |= 1;
        }
    }

    /* renamed from: a */
    public k g() {
        return m().a(d());
    }

    public k a(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    public k a(i iVar) {
        if (iVar != i.a()) {
            if (!iVar.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = iVar.f;
                    this.a &= -2;
                } else {
                    n();
                    this.b.addAll(iVar.f);
                }
            }
            if (iVar.f()) {
                a(iVar.g());
            }
            if (iVar.h()) {
                b(iVar.i());
            }
            if (iVar.k()) {
                a(iVar.l());
            }
            if (iVar.m()) {
                b(iVar.q());
            }
            a(r().a(iVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public k c(com.google.tagmanager.a.k kVar, o oVar) {
        i iVar;
        i iVar2;
        try {
            i iVar3 = (i) i.a.b(kVar, oVar);
            if (iVar3 != null) {
                a(iVar3);
            }
            return this;
        } catch (af e2) {
            af afVar = e2;
            iVar2 = (i) afVar.a();
            throw afVar;
        } catch (Throwable th) {
            Throwable th2 = th;
            iVar = iVar2;
            th = th2;
        }
        if (iVar != null) {
            a(iVar);
        }
        throw th;
    }

    public k a(boolean z) {
        this.a |= 8;
        this.e = z;
        return this;
    }

    /* renamed from: b */
    public i p() {
        return i.a();
    }

    public k b(int i) {
        this.a |= 4;
        this.d = i;
        return this;
    }

    public k b(boolean z) {
        this.a |= 16;
        this.f = z;
        return this;
    }

    /* renamed from: c */
    public i h() {
        i d2 = d();
        if (d2.j()) {
            return d2;
        }
        throw a(d2);
    }

    public i d() {
        int i = 1;
        i iVar = new i((v) this);
        int i2 = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= -2;
        }
        List unused = iVar.f = this.b;
        if ((i2 & 2) != 2) {
            i = 0;
        }
        int unused2 = iVar.g = this.c;
        if ((i2 & 4) == 4) {
            i |= 2;
        }
        int unused3 = iVar.h = this.d;
        if ((i2 & 8) == 8) {
            i |= 4;
        }
        boolean unused4 = iVar.i = this.e;
        if ((i2 & 16) == 16) {
            i |= 8;
        }
        boolean unused5 = iVar.j = this.f;
        int unused6 = iVar.e = i;
        return iVar;
    }

    public boolean i() {
        return (this.a & 2) == 2;
    }

    public final boolean j() {
        return i();
    }
}
