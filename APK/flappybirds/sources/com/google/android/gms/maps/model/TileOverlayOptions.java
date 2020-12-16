package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;
import com.google.android.gms.maps.model.a.v;
import com.google.android.gms.maps.model.a.w;

public final class TileOverlayOptions implements SafeParcelable {
    public static final n CREATOR = new n();
    private final int a;
    /* access modifiers changed from: private */
    public v b;
    private o c;
    private boolean d;
    private float e;

    public TileOverlayOptions() {
        this.d = true;
        this.a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f) {
        this.d = true;
        this.a = i;
        this.b = w.a(iBinder);
        this.c = this.b == null ? null : new m(this);
        this.d = z;
        this.e = f;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public IBinder b() {
        return this.b.asBinder();
    }

    public float c() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            z.a(this, parcel, i);
        } else {
            n.a(this, parcel, i);
        }
    }
}
