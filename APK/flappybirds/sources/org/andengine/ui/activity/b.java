package org.andengine.ui.activity;

import org.andengine.c.b.e;
import org.andengine.d.e.a;
import org.andengine.ui.c;
import org.andengine.ui.d;

class b implements c {
    final /* synthetic */ BaseGameActivity a;
    private final /* synthetic */ d b;

    b(BaseGameActivity baseGameActivity, d dVar) {
        this.a = baseGameActivity;
        this.b = dVar;
    }

    public void a(e eVar) {
        this.a.k.a(eVar);
        try {
            a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onPopulateScene" + " @(Thread: '" + Thread.currentThread().getName() + "')");
            this.a.a(eVar, this.b);
        } catch (Throwable th) {
            a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onPopulateScene failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }
}
