package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.a;
import com.google.android.gms.e;

public final class cw extends ct {
    public final int a;
    public final Bundle c;
    public final IBinder d;
    final /* synthetic */ cr e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw(cr crVar, int i, IBinder iBinder, Bundle bundle) {
        super(crVar, true);
        this.e = crVar;
        this.a = i;
        this.d = iBinder;
        this.c = bundle;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void a(Boolean bool) {
        if (bool != null) {
            switch (this.a) {
                case e.MapAttrs_mapType:
                    try {
                        if (this.e.d().equals(this.d.getInterfaceDescriptor())) {
                            IInterface unused = this.e.g = this.e.b(this.d);
                            if (this.e.g != null) {
                                this.e.f();
                                return;
                            }
                        }
                    } catch (RemoteException e2) {
                    }
                    cx.a(this.e.f).b(this.e.c(), this.e.m);
                    cv unused2 = this.e.m = null;
                    IInterface unused3 = this.e.g = null;
                    this.e.a(new a(8, (PendingIntent) null));
                    return;
                case e.MapAttrs_uiZoomControls:
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    PendingIntent pendingIntent = this.c != null ? (PendingIntent) this.c.getParcelable("pendingIntent") : null;
                    if (this.e.m != null) {
                        cx.a(this.e.f).b(this.e.c(), this.e.m);
                        cv unused4 = this.e.m = null;
                    }
                    IInterface unused5 = this.e.g = null;
                    this.e.a(new a(this.a, pendingIntent));
                    return;
            }
        }
    }
}
