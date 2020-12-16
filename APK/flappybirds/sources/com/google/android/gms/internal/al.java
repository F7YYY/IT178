package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class al {
    public IBinder a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    private al(int i, IBinder iBinder) {
        this.c = -1;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.b = i;
        this.a = iBinder;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.b);
        bundle.putInt("popupLocationInfo.displayId", this.c);
        bundle.putInt("popupLocationInfo.left", this.d);
        bundle.putInt("popupLocationInfo.top", this.e);
        bundle.putInt("popupLocationInfo.right", this.f);
        bundle.putInt("popupLocationInfo.bottom", this.g);
        return bundle;
    }
}
