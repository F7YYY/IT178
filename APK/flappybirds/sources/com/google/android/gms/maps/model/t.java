package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public class t {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, latLngBounds.a());
        c.a(parcel, 2, (Parcelable) latLngBounds.a, i, false);
        c.a(parcel, 3, (Parcelable) latLngBounds.b, i, false);
        c.a(parcel, a);
    }
}
