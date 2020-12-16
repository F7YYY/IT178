package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.ArrayList;

public class i implements Parcelable.Creator {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, polygonOptions.a());
        c.b(parcel, 2, polygonOptions.c(), false);
        c.c(parcel, 3, polygonOptions.b(), false);
        c.a(parcel, 4, polygonOptions.d());
        c.a(parcel, 5, polygonOptions.e());
        c.a(parcel, 6, polygonOptions.f());
        c.a(parcel, 7, polygonOptions.g());
        c.a(parcel, 8, polygonOptions.h());
        c.a(parcel, 9, polygonOptions.i());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public PolygonOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
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
                    arrayList = a.c(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    a.a(parcel, a, arrayList2, getClass().getClassLoader());
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
                    z2 = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiTiltGestures:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolygonOptions(i3, arrayList, arrayList2, f2, i2, i, f, z2, z);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
