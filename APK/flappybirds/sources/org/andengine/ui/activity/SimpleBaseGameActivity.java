package org.andengine.ui.activity;

import org.andengine.c.b.e;
import org.andengine.ui.b;
import org.andengine.ui.c;
import org.andengine.ui.d;

public abstract class SimpleBaseGameActivity extends BaseGameActivity {
    public final void a(e eVar, d dVar) {
        dVar.a();
    }

    public final void a(b bVar) {
        l();
        bVar.a();
    }

    public final void a(c cVar) {
        cVar.a(m());
    }

    /* access modifiers changed from: protected */
    public abstract void l();

    /* access modifiers changed from: protected */
    public abstract e m();
}
