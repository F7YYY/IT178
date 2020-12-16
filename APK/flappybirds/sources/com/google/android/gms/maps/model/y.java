package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class y {
    static void a(Tile tile, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.a);
        c.a(parcel, 3, tile.b);
        c.a(parcel, 4, tile.c, false);
        c.a(parcel, a);
    }
}
