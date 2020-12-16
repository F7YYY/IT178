package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.ArrayList;

public class j implements Parcelable.Creator {
    static void a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, polylineOptions.a());
        c.b(parcel, 2, polylineOptions.b(), false);
        c.a(parcel, 3, polylineOptions.c());
        c.a(parcel, 4, polylineOptions.d());
        c.a(parcel, 5, polylineOptions.e());
        c.a(parcel, 6, polylineOptions.f());
        c.a(parcel, 7, polylineOptions.g());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public PolylineOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        ArrayList arrayList = null;
        boolean z2 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    arrayList = a.c(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    f2 = a.i(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    f = a.i(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    z2 = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolylineOptions(i2, arrayList, f2, i, f, z2, z);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
