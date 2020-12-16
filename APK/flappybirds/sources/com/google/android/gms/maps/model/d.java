package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class d implements Parcelable.Creator {
    static void a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, circleOptions.a());
        c.a(parcel, 2, (Parcelable) circleOptions.b(), i, false);
        c.a(parcel, 3, circleOptions.c());
        c.a(parcel, 4, circleOptions.d());
        c.a(parcel, 5, circleOptions.e());
        c.a(parcel, 6, circleOptions.f());
        c.a(parcel, 7, circleOptions.g());
        c.a(parcel, 8, circleOptions.h());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public CircleOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i3 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    latLng = (LatLng) a.a(parcel, a, (Parcelable.Creator) LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    d = a.j(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    f2 = a.i(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    f = a.i(parcel, a);
                    break;
                case e.MapAttrs_uiScrollGestures:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
