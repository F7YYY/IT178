package org.andengine.d.a.b;

import org.andengine.b.b.c;
import org.andengine.d.a.c.a;

public abstract class d implements c {
    private final b a = new e(this);
    private final a b = new org.andengine.d.a.c.a.a(new org.andengine.d.a.a.a());

    /* access modifiers changed from: protected */
    public abstract void a(c cVar);

    public void a_(float f) {
        a aVar = this.b;
        b bVar = this.a;
        while (true) {
            c cVar = (c) aVar.a();
            if (cVar != null) {
                a(cVar);
                bVar.c(cVar);
            } else {
                return;
            }
        }
    }

    public void b(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        } else if (!this.a.d(cVar)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        } else {
            this.b.a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract c c();

    public c d() {
        return (c) this.a.d();
    }
}
