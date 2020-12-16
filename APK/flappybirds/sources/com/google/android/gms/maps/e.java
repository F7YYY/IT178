package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public class e {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, googleMapOptions.a());
        c.a(parcel, 2, googleMapOptions.b());
        c.a(parcel, 3, googleMapOptions.c());
        c.a(parcel, 4, googleMapOptions.j());
        c.a(parcel, 5, (Parcelable) googleMapOptions.k(), i, false);
        c.a(parcel, 6, googleMapOptions.d());
        c.a(parcel, 7, googleMapOptions.e());
        c.a(parcel, 8, googleMapOptions.f());
        c.a(parcel, 9, googleMapOptions.g());
        c.a(parcel, 10, googleMapOptions.h());
        c.a(parcel, 11, googleMapOptions.i());
        c.a(parcel, a);
    }
}
