package org.andengine.c.b.a;

import android.opengl.GLES20;
import org.andengine.d.h.c;
import org.andengine.opengl.util.e;

public class a implements b {
    private c a = null;
    private final org.andengine.d.d.a b = new org.andengine.d.d.a(0.0f, 0.0f, 0.0f, 1.0f);
    private boolean c = true;

    protected a() {
    }

    public a(org.andengine.d.d.a aVar) {
        this.b.a(aVar);
    }

    public void a(e eVar, org.andengine.b.a.a aVar) {
        if (this.c) {
            GLES20.glClearColor(this.b.a(), this.b.b(), this.b.c(), this.b.d());
            GLES20.glClear(16384);
        }
    }

    public void a_(float f) {
        if (this.a != null) {
            this.a.a_(f);
        }
    }
}
