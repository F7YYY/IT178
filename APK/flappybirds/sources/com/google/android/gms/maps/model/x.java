package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class x {
    static void a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, polylineOptions.a());
        c.b(parcel, 2, polylineOptions.b(), false);
        c.a(parcel, 3, polylineOptions.c());
        c.a(parcel, 4, polylineOptions.d());
        c.a(parcel, 5, polylineOptions.e());
        c.a(parcel, 6, polylineOptions.f());
        c.a(parcel, 7, polylineOptions.g());
        c.a(parcel, a);
    }
}
