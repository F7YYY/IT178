package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class u {
    static void a(LatLng latLng, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, latLng.a());
        c.a(parcel, 2, latLng.a);
        c.a(parcel, 3, latLng.b);
        c.a(parcel, a);
    }
}
