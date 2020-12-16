package org.andengine.c.d.a;

import org.andengine.opengl.d.a.c;
import org.andengine.opengl.d.b;
import org.andengine.opengl.d.e;

public class a extends b implements b {
    public a(e eVar, int i, org.andengine.opengl.d.a aVar, boolean z, c cVar) {
        super(eVar, i, aVar, z, cVar);
    }

    public void a(org.andengine.c.d.a aVar) {
        float[] fArr = this.a;
        float f = aVar.g().f();
        fArr[2] = f;
        fArr[7] = f;
        fArr[12] = f;
        fArr[17] = f;
        f();
    }

    public void a(org.andengine.c.d.a aVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[15] = f7;
        fArr[16] = f8;
        f();
    }

    public void b(org.andengine.c.d.a aVar) {
        float[] fArr = this.a;
        float o = aVar.o();
        float p = aVar.p();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = p;
        fArr[10] = o;
        fArr[11] = 0.0f;
        fArr[15] = o;
        fArr[16] = p;
        f();
    }

    public void c(org.andengine.c.d.a aVar) {
        float d;
        float e;
        float f;
        float g;
        float[] fArr = this.a;
        org.andengine.opengl.c.c.b t = aVar.t();
        if (aVar.v()) {
            if (aVar.u()) {
                d = t.e();
                e = t.d();
                f = t.g();
                g = t.f();
            } else {
                d = t.d();
                e = t.e();
                f = t.g();
                g = t.f();
            }
        } else if (aVar.u()) {
            d = t.e();
            e = t.d();
            f = t.f();
            g = t.g();
        } else {
            d = t.d();
            e = t.e();
            f = t.f();
            g = t.g();
        }
        if (t.h()) {
            fArr[3] = e;
            fArr[4] = f;
            fArr[8] = d;
            fArr[9] = f;
            fArr[13] = e;
            fArr[14] = g;
            fArr[18] = d;
            fArr[19] = g;
        } else {
            fArr[3] = d;
            fArr[4] = f;
            fArr[8] = d;
            fArr[9] = g;
            fArr[13] = e;
            fArr[14] = f;
            fArr[18] = e;
            fArr[19] = g;
        }
        f();
    }
}
