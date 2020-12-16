package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class cu extends dd {
    private cr a;

    public cu(cr crVar) {
        this.a = crVar;
    }

    public void a(int i, IBinder iBinder, Bundle bundle) {
        Cdo.a((Object) "onPostInitComplete can be called only once per call to getServiceFromBroker", (Object) this.a);
        this.a.a(i, iBinder, bundle);
        this.a = null;
    }
}
