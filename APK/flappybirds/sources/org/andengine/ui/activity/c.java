package org.andengine.ui.activity;

import org.andengine.d.e.a;
import org.andengine.ui.b;

class c implements b {
    final /* synthetic */ BaseGameActivity a;
    private final /* synthetic */ org.andengine.ui.c b;

    c(BaseGameActivity baseGameActivity, org.andengine.ui.c cVar) {
        this.a = baseGameActivity;
        this.b = cVar;
    }

    public void a() {
        try {
            a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onCreateScene" + " @(Thread: '" + Thread.currentThread().getName() + "')");
            this.a.a(this.b);
        } catch (Throwable th) {
            a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onCreateScene failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }
}
