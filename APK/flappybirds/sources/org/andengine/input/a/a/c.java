package org.andengine.input.a.a;

import org.andengine.d.a.b.f;
import org.andengine.input.a.a;

class c extends f {
    final /* synthetic */ a a;
    private a d;

    c(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    public void a() {
        super.a();
        a aVar = this.d;
        aVar.k().recycle();
        aVar.a();
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void run() {
        this.a.a.a(this.d);
    }
}
