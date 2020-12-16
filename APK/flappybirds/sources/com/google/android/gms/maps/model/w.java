package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class w {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, polygonOptions.a());
        c.b(parcel, 2, polygonOptions.c(), false);
        c.c(parcel, 3, polygonOptions.b(), false);
        c.a(parcel, 4, polygonOptions.d());
        c.a(parcel, 5, polygonOptions.e());
        c.a(parcel, 6, polygonOptions.f());
        c.a(parcel, 7, polygonOptions.g());
        c.a(parcel, 8, polygonOptions.h());
        c.a(parcel, 9, polygonOptions.i());
        c.a(parcel, a);
    }
}
