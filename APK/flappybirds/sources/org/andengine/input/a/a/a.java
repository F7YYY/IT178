package org.andengine.input.a.a;

import android.view.MotionEvent;
import org.andengine.d.a.b.g;

public abstract class a implements d {
    /* access modifiers changed from: private */
    public e a;
    private final g b = new b(this);

    /* access modifiers changed from: protected */
    public void a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        org.andengine.input.a.a a2 = org.andengine.input.a.a.a(f, f2, i, i2, MotionEvent.obtain(motionEvent));
        c cVar = (c) this.b.d();
        cVar.a(a2);
        this.b.b(cVar);
    }

    public void a(e eVar) {
        this.a = eVar;
    }

    public void a_(float f) {
        this.b.a_(f);
    }
}
