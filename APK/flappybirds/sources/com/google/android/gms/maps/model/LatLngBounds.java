package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.dl;
import com.google.android.gms.maps.a.bk;

public final class LatLngBounds implements SafeParcelable {
    public static final f CREATOR = new f();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        Cdo.a((Object) latLng, (Object) "null southwest");
        Cdo.a((Object) latLng2, (Object) "null northeast");
        Cdo.a(latLng2.a >= latLng.a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.a), Double.valueOf(latLng2.a));
        this.c = i;
        this.a = latLng;
        this.b = latLng2;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public int hashCode() {
        return dl.a(this.a, this.b);
    }

    public String toString() {
        return dl.a((Object) this).a("southwest", this.a).a("northeast", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            t.a(this, parcel, i);
        } else {
            f.a(this, parcel, i);
        }
    }
}
