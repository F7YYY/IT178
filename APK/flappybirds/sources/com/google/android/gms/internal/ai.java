package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.view.View;

public class ai {
    protected r a;
    protected al b;

    private ai(r rVar, int i) {
        this.a = rVar;
        a(i);
    }

    public static ai a(r rVar, int i) {
        return p.b() ? new am(rVar, i) : new ai(rVar, i);
    }

    public void a() {
        this.a.a(this.b.a, this.b.a());
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        this.b = new al(i, new Binder());
    }

    public void a(View view) {
    }

    public IBinder b() {
        return this.b.a;
    }
}
