package com.dotgears;

import com.google.android.gms.e;

public class p extends m {
    public int a;
    public int b;
    public int c = this.r.b;
    public int d = this.r.c;
    public int e = 0;
    public int f = 0;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = 0;
    public boolean m;
    public int n = ((512 - this.d) >> 1);
    public k o = new k();
    public r p = new r();
    public i q = g.D.b("new");
    public i r = g.D.b("score_panel");
    public l s = g.D.B;

    public void a(float f2) {
        if (this.F) {
            if (!this.p.g) {
                this.p.a(f2);
            }
            switch (this.k) {
                case e.MapAttrs_mapType /*0*/:
                    this.b = (int) this.p.a;
                    if (!this.p.g) {
                        return;
                    }
                    if (this.l > 0) {
                        this.k = 1;
                        this.p.a(0.0f, (float) this.l, 0, 0.5f);
                        return;
                    }
                    this.k = 2;
                    return;
                case e.MapAttrs_cameraBearing /*1*/:
                    this.e = (int) this.p.a;
                    if (this.p.g) {
                        this.k = 2;
                        g.D.a(this.e);
                        if (this.e > this.f) {
                            this.f = this.e;
                            this.m = true;
                        }
                        if (this.e >= this.j) {
                            this.o.a(0);
                        } else if (this.e >= this.i) {
                            this.o.a(1);
                        } else if (this.e >= this.h) {
                            this.o.a(2);
                        } else if (this.e >= this.g) {
                            this.o.a(3);
                        }
                        this.o.a = this.a + 32;
                        this.o.b = this.b + 44;
                        return;
                    }
                    return;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    this.o.a(f2);
                    return;
                default:
                    return;
            }
        }
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.l = i2;
        this.f = i3;
        this.e = 0;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.F = true;
        this.G = true;
        this.m = false;
        this.a = (288 - this.c) >> 1;
        this.b = 504;
        this.p.a((float) this.b, (float) this.n, 11, 0.5f);
        this.k = 0;
        this.o.F = false;
        this.o.G = false;
    }

    public void a(g gVar) {
        if (this.G) {
            gVar.a(this.r.i, this.a, this.b, 1.0f, 1.0f, 1.0f);
            this.s.a(gVar, this.e, this.a + 210, this.b + 36, false, 10);
            this.s.a(gVar, this.f, this.a + 210, this.b + 78, false, 10);
            if (this.m) {
                gVar.a(this.q.i, this.a + 142, this.b + 60, 1.0f, 1.0f, 1.0f);
            }
            this.o.a(gVar);
        }
    }
}
