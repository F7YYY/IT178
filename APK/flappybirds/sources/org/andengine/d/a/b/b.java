package org.andengine.d.a.b;

public abstract class b extends a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c c() {
        c cVar = (c) super.c();
        cVar.b = this;
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void b(c cVar) {
        cVar.c = false;
        cVar.c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void a(c cVar) {
        cVar.a();
        cVar.c = true;
    }

    public synchronized void c(c cVar) {
        if (cVar.b == null) {
            throw new IllegalArgumentException("PoolItem not assigned to a pool!");
        } else if (!cVar.a(this)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        } else if (cVar.b()) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        } else {
            super.c(cVar);
        }
    }

    public synchronized boolean d(c cVar) {
        return cVar.b == this;
    }
}
