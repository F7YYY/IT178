package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import java.util.ArrayList;

public abstract class cr implements b {
    public static final String[] e = {"service_esmobile", "service_googleme"};
    final Handler a;
    final ArrayList b = new ArrayList();
    boolean c = false;
    boolean d = false;
    /* access modifiers changed from: private */
    public final Context f;
    /* access modifiers changed from: private */
    public IInterface g;
    /* access modifiers changed from: private */
    public ArrayList h;
    private boolean i = false;
    private ArrayList j;
    private boolean k = false;
    /* access modifiers changed from: private */
    public final ArrayList l = new ArrayList();
    /* access modifiers changed from: private */
    public cv m;
    private final String[] n;
    /* access modifiers changed from: private */
    public final Object o = new Object();

    protected cr(Context context, c cVar, d dVar, String... strArr) {
        this.f = (Context) Cdo.a((Object) context);
        this.h = new ArrayList();
        this.h.add(Cdo.a((Object) cVar));
        this.j = new ArrayList();
        this.j.add(Cdo.a((Object) dVar));
        this.a = new cs(this, context.getMainLooper());
        a(strArr);
        this.n = strArr;
    }

    public void a() {
        this.c = true;
        synchronized (this.o) {
            this.d = true;
        }
        int a2 = f.a(this.f);
        if (a2 != 0) {
            this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(a2)));
            return;
        }
        if (this.m != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.g = null;
            cx.a(this.f).b(c(), this.m);
        }
        this.m = new cv(this);
        if (!cx.a(this.f).a(c(), this.m)) {
            Log.e("GmsClient", "unable to connect to service: " + c());
            this.a.sendMessage(this.a.obtainMessage(3, 9));
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle) {
        this.a.sendMessage(this.a.obtainMessage(1, new cw(this, i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public void a(a aVar) {
        this.a.removeMessages(4);
        synchronized (this.j) {
            this.k = true;
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                if (this.c) {
                    if (this.j.contains(arrayList.get(i2))) {
                        ((d) arrayList.get(i2)).a(aVar);
                    }
                    i2++;
                } else {
                    return;
                }
            }
            this.k = false;
        }
    }

    public final void a(ct ctVar) {
        synchronized (this.l) {
            this.l.add(ctVar);
        }
        this.a.sendMessage(this.a.obtainMessage(2, ctVar));
    }

    /* access modifiers changed from: protected */
    public abstract void a(df dfVar, cu cuVar);

    /* access modifiers changed from: protected */
    public void a(String... strArr) {
    }

    /* access modifiers changed from: protected */
    public abstract IInterface b(IBinder iBinder);

    public void b() {
        this.c = false;
        synchronized (this.o) {
            this.d = false;
        }
        synchronized (this.l) {
            int size = this.l.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ct) this.l.get(i2)).d();
            }
            this.l.clear();
        }
        this.g = null;
        if (this.m != null) {
            cx.a(this.f).b(c(), this.m);
            this.m = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    /* access modifiers changed from: protected */
    public final void c(IBinder iBinder) {
        try {
            a(dg.a(iBinder), new cu(this));
        } catch (RemoteException e2) {
            Log.w("GmsClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public Bundle e() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void f() {
        boolean z = true;
        synchronized (this.h) {
            Cdo.a(!this.i);
            this.a.removeMessages(4);
            this.i = true;
            if (this.b.size() != 0) {
                z = false;
            }
            Cdo.a(z);
            Bundle e2 = e();
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.c && h(); i2++) {
                this.b.size();
                if (!this.b.contains(arrayList.get(i2))) {
                    ((c) arrayList.get(i2)).a(e2);
                }
            }
            this.b.clear();
            this.i = false;
        }
    }

    public boolean h() {
        return this.g != null;
    }

    public boolean i() {
        boolean z;
        synchronized (this.o) {
            z = this.d;
        }
        return z;
    }

    public final Context j() {
        return this.f;
    }

    public final String[] k() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final void l() {
        this.a.removeMessages(4);
        synchronized (this.h) {
            this.i = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.c; i2++) {
                if (this.h.contains(arrayList.get(i2))) {
                    ((c) arrayList.get(i2)).a();
                }
            }
            this.i = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (!h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public final IInterface n() {
        m();
        return this.g;
    }
}
