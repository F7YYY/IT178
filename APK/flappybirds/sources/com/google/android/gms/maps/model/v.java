package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public class v {
    static void a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, markerOptions.a());
        c.a(parcel, 2, (Parcelable) markerOptions.c(), i, false);
        c.a(parcel, 3, markerOptions.d(), false);
        c.a(parcel, 4, markerOptions.e(), false);
        c.a(parcel, 5, markerOptions.b(), false);
        c.a(parcel, 6, markerOptions.f());
        c.a(parcel, 7, markerOptions.g());
        c.a(parcel, 8, markerOptions.h());
        c.a(parcel, 9, markerOptions.i());
        c.a(parcel, a);
    }
}
