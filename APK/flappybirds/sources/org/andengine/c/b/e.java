package org.andengine.c.b;

import android.util.SparseArray;
import org.andengine.c.a;
import org.andengine.c.c;
import org.andengine.d.a.a.b;

public class e extends a {
    protected e I;
    protected b J = new b(4);
    private boolean K = false;
    private boolean L = false;
    private final SparseArray M = new SparseArray();
    private boolean N = false;
    private final SparseArray O = new SparseArray();
    private float a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final org.andengine.b.b.a.a e = new org.andengine.b.b.a.a();
    private c f;
    private b g;
    private org.andengine.c.b.a.b h = new org.andengine.c.b.a.a(org.andengine.d.d.a.b);
    private boolean i = true;
    private boolean j = true;

    private Boolean a(org.andengine.input.a.a aVar, float f2, float f3, d dVar) {
        float[] b2 = dVar.b(f2, f3);
        float f4 = b2[0];
        float f5 = b2[1];
        if (dVar.a(aVar, f4, f5)) {
            return Boolean.TRUE;
        }
        if (this.g != null) {
            return Boolean.valueOf(this.g.a(aVar, dVar, f4, f5));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
        this.a += f2;
        this.e.a_(f2);
        e eVar = this.I;
        if (eVar == null || !this.c) {
            this.h.a_(f2);
            super.a(f2);
        }
        if (eVar != null) {
            eVar.a_(f2);
        }
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public void a(c cVar) {
    }

    public boolean a(org.andengine.input.a.a aVar) {
        int size;
        Boolean a2;
        Boolean a3;
        int e2 = aVar.e();
        boolean f2 = aVar.f();
        boolean h2 = aVar.h();
        if (!f2) {
            if (this.N && ((c) this.O.get(aVar.d())) != null) {
                switch (e2) {
                    case com.google.android.gms.e.MapAttrs_cameraBearing:
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                        this.O.remove(aVar.d());
                        break;
                }
                Boolean valueOf = Boolean.valueOf(this.f.a(this, aVar));
                if (valueOf != null && valueOf.booleanValue()) {
                    return true;
                }
            }
            if (this.K) {
                SparseArray sparseArray = this.M;
                d dVar = (d) sparseArray.get(aVar.d());
                if (dVar != null) {
                    float b2 = aVar.b();
                    float c2 = aVar.c();
                    switch (e2) {
                        case com.google.android.gms.e.MapAttrs_cameraBearing:
                        case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                            sparseArray.remove(aVar.d());
                            break;
                    }
                    Boolean a4 = a(aVar, b2, c2, dVar);
                    if (a4 != null && a4.booleanValue()) {
                        return true;
                    }
                }
            }
        }
        if (this.I != null) {
            if (b(aVar)) {
                return true;
            }
            if (this.d) {
                return false;
            }
        }
        float b3 = aVar.b();
        float c3 = aVar.c();
        b bVar = this.J;
        if (bVar != null && (size = bVar.size()) > 0) {
            if (this.j) {
                int i2 = 0;
                while (i2 < size) {
                    d dVar2 = (d) bVar.get(i2);
                    if (!dVar2.a(b3, c3) || (a3 = a(aVar, b3, c3, dVar2)) == null || !a3.booleanValue()) {
                        i2++;
                    } else {
                        if ((this.K && f2) || (this.L && h2)) {
                            this.M.put(aVar.d(), dVar2);
                        }
                        return true;
                    }
                }
            } else {
                int i3 = size - 1;
                while (i3 >= 0) {
                    d dVar3 = (d) bVar.get(i3);
                    if (!dVar3.a(b3, c3) || (a2 = a(aVar, b3, c3, dVar3)) == null || !a2.booleanValue()) {
                        i3--;
                    } else {
                        if ((this.K && f2) || (this.L && h2)) {
                            this.M.put(aVar.d(), dVar3);
                        }
                        return true;
                    }
                }
            }
        }
        if (this.f == null) {
            return false;
        }
        Boolean valueOf2 = Boolean.valueOf(this.f.a(this, aVar));
        if (valueOf2 == null || !valueOf2.booleanValue()) {
            return false;
        }
        if (this.N && f2) {
            this.O.put(aVar.d(), this.f);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(org.andengine.input.a.a aVar) {
        return this.I.a(aVar);
    }

    /* access modifiers changed from: protected */
    public void e(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        e eVar2 = this.I;
        if (eVar2 == null || !this.b) {
            if (this.i) {
                eVar.m();
                aVar.c(eVar);
                eVar.l();
                this.h.a(eVar, aVar);
                eVar.n();
            }
            eVar.m();
            f(eVar, aVar);
            eVar.l();
            super.e(eVar, aVar);
            eVar.n();
        }
        if (eVar2 != null) {
            eVar2.a(eVar, aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void f(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        aVar.b(eVar);
    }
}
