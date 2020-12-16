package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class l implements Parcelable.Creator {
    static void a(Tile tile, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.a);
        c.a(parcel, 3, tile.b);
        c.a(parcel, 4, tile.c, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public Tile createFromParcel(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i3 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    bArr = a.o(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
