package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class f implements Parcelable.Creator {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, latLngBounds.a());
        c.a(parcel, 2, (Parcelable) latLngBounds.a, i, false);
        c.a(parcel, 3, (Parcelable) latLngBounds.b, i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int i;
        LatLng latLng3 = null;
        int b = a.b(parcel);
        int i2 = 0;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    LatLng latLng5 = latLng3;
                    latLng2 = latLng4;
                    i = a.f(parcel, a);
                    latLng = latLng5;
                    break;
                case e.MapAttrs_cameraTargetLat:
                    i = i2;
                    LatLng latLng6 = (LatLng) a.a(parcel, a, (Parcelable.Creator) LatLng.CREATOR);
                    latLng = latLng3;
                    latLng2 = latLng6;
                    break;
                case e.MapAttrs_cameraTargetLng:
                    latLng = (LatLng) a.a(parcel, a, (Parcelable.Creator) LatLng.CREATOR);
                    latLng2 = latLng4;
                    i = i2;
                    break;
                default:
                    a.b(parcel, a);
                    latLng = latLng3;
                    latLng2 = latLng4;
                    i = i2;
                    break;
            }
            i2 = i;
            latLng4 = latLng2;
            latLng3 = latLng;
        }
        if (parcel.dataPosition() == b) {
            return new LatLngBounds(i2, latLng4, latLng3);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
