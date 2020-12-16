package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public class r {
    static void a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, circleOptions.a());
        c.a(parcel, 2, (Parcelable) circleOptions.b(), i, false);
        c.a(parcel, 3, circleOptions.c());
        c.a(parcel, 4, circleOptions.d());
        c.a(parcel, 5, circleOptions.e());
        c.a(parcel, 6, circleOptions.f());
        c.a(parcel, 7, circleOptions.g());
        c.a(parcel, 8, circleOptions.h());
        c.a(parcel, a);
    }
}
