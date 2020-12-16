package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class n implements Parcelable.Creator {
    static void a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, tileOverlayOptions.a());
        c.a(parcel, 2, tileOverlayOptions.b(), false);
        c.a(parcel, 3, tileOverlayOptions.d());
        c.a(parcel, 4, tileOverlayOptions.c());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        IBinder iBinder = null;
        float f = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    iBinder = a.m(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    z = a.c(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    f = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TileOverlayOptions(i, iBinder, z, f);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
