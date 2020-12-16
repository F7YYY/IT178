package org.andengine.opengl.c.a.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.util.ArrayList;
import org.andengine.opengl.c.a.b;
import org.andengine.opengl.c.a.c;
import org.andengine.opengl.c.e;
import org.andengine.opengl.c.f;

public class a extends c {
    private final org.andengine.opengl.c.b.a j;

    public a(e eVar, int i, int i2, org.andengine.opengl.c.b.a aVar, f fVar, b bVar) {
        super(eVar, i, i2, aVar.b(), fVar, bVar);
        this.j = aVar;
    }

    public a(e eVar, int i, int i2, f fVar) {
        this(eVar, i, i2, org.andengine.opengl.c.b.a.RGBA_8888, fVar, (b) null);
    }

    /* access modifiers changed from: protected */
    public void e(org.andengine.opengl.util.e eVar) {
        org.andengine.opengl.c.c b = this.j.b();
        int a = b.a();
        int b2 = b.b();
        int c = b.c();
        GLES20.glTexImage2D(3553, 0, a, this.g, this.h, 0, b2, c, (Buffer) null);
        boolean z = this.c.n;
        Bitmap.Config a2 = z ? this.j.a() : Bitmap.Config.ARGB_8888;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        b k = k();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < size) {
                org.andengine.opengl.c.a.a.a.b bVar = (org.andengine.opengl.c.a.a.a.b) arrayList.get(i2);
                try {
                    Bitmap a3 = bVar.a(a2);
                    if (a3 == null) {
                        throw new org.andengine.d.f.b("Caused by: " + bVar.getClass().toString() + " --> " + bVar.toString() + " returned a null Bitmap.");
                    }
                    boolean z2 = org.andengine.d.g.a.a(a3.getWidth()) && org.andengine.d.g.a.a(a3.getHeight()) && b == org.andengine.opengl.c.c.RGBA_8888;
                    if (!z2) {
                        GLES20.glPixelStorei(3317, 1);
                    }
                    if (z) {
                        GLUtils.texSubImage2D(3553, 0, bVar.a(), bVar.b(), a3, b2, c);
                    } else {
                        eVar.a(3553, 0, bVar.a(), bVar.b(), a3, this.b);
                    }
                    if (!z2) {
                        GLES20.glPixelStorei(3317, 4);
                    }
                    a3.recycle();
                    if (k != null) {
                        k.a(this, bVar);
                    }
                    i = i2 + 1;
                } catch (org.andengine.d.f.b e) {
                    if (k != null) {
                        k.a(this, bVar, e);
                    } else {
                        throw e;
                    }
                }
            } else {
                return;
            }
        }
    }
}
