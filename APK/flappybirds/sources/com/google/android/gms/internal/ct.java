package com.google.android.gms.internal;

import android.util.Log;

public abstract class ct {
    private Object a;
    final /* synthetic */ cr b;
    private boolean c = false;

    public ct(cr crVar, Object obj) {
        this.b = crVar;
        this.a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    public void b() {
        Object obj;
        synchronized (this) {
            obj = this.a;
            if (this.c) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e) {
                a();
                throw e;
            }
        } else {
            a();
        }
        synchronized (this) {
            this.c = true;
        }
        c();
    }

    public void c() {
        d();
        synchronized (this.b.l) {
            this.b.l.remove(this);
        }
    }

    public void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
