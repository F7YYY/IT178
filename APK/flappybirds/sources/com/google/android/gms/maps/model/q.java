package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public class q {
    static void a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, cameraPosition.a());
        c.a(parcel, 2, (Parcelable) cameraPosition.a, i, false);
        c.a(parcel, 3, cameraPosition.b);
        c.a(parcel, 4, cameraPosition.c);
        c.a(parcel, 5, cameraPosition.d);
        c.a(parcel, a);
    }
}
