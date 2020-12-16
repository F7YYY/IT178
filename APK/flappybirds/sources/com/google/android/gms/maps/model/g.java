package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class g implements Parcelable.Creator {
    static void a(LatLng latLng, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, latLng.a());
        c.a(parcel, 2, latLng.a);
        c.a(parcel, 3, latLng.b);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public LatLng createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int b = a.b(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    d2 = a.j(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    d = a.j(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LatLng(i, d2, d);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
