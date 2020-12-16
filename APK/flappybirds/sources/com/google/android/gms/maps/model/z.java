package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class z {
    static void a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, tileOverlayOptions.a());
        c.a(parcel, 2, tileOverlayOptions.b(), false);
        c.a(parcel, 3, tileOverlayOptions.d());
        c.a(parcel, 4, tileOverlayOptions.c());
        c.a(parcel, a);
    }
}
