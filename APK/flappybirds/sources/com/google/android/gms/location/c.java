package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;

public class c implements Parcelable.Creator {
    static void a(LocationRequest locationRequest, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, locationRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, locationRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, locationRequest.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, locationRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, locationRequest.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, locationRequest.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, locationRequest.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, locationRequest.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }

    /* renamed from: a */
    public LocationRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    j = a.g(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    j2 = a.g(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    z = a.c(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    j3 = a.g(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    f = a.i(parcel, a);
                    break;
                case 1000:
                    i3 = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequest(i3, i, j, j2, z, j3, i2, f);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
