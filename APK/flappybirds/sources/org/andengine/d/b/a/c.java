package org.andengine.d.b.a;

import org.andengine.d.a.d.a;

public class c extends d {
    private static final float[] a = new float[8];
    private static final float[] b = new float[8];
    private static final float[] c = new float[8];

    public static void a(float f, float f2, float f3, float f4, a aVar, float[] fArr) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f5;
        fArr[3] = f2;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f;
        fArr[7] = f6;
        aVar.a(fArr);
    }

    private static void a(org.andengine.b.a.a aVar, float[] fArr) {
        fArr[0] = aVar.a();
        fArr[1] = aVar.c();
        fArr[2] = aVar.b();
        fArr[3] = aVar.c();
        fArr[4] = aVar.b();
        fArr[5] = aVar.d();
        fArr[6] = aVar.a();
        fArr[7] = aVar.d();
        org.andengine.d.g.a.a(fArr, aVar.k(), aVar.g(), aVar.h());
    }

    public static void a(org.andengine.c.c.c cVar, float[] fArr) {
        a(0.0f, 0.0f, cVar.o(), cVar.p(), cVar.k(), fArr);
    }

    public static boolean a(org.andengine.b.a.a aVar, org.andengine.c.c.c cVar) {
        a(aVar, b);
        a(cVar, c);
        return d.a(b, 4, c, 4);
    }

    public static boolean a(org.andengine.c.c.c cVar, float f, float f2) {
        a(cVar, a);
        return d.a(a, 4, f, f2);
    }
}
