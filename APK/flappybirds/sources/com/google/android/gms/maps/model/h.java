package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class h implements Parcelable.Creator {
    static void a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, markerOptions.a());
        c.a(parcel, 2, (Parcelable) markerOptions.c(), i, false);
        c.a(parcel, 3, markerOptions.d(), false);
        c.a(parcel, 4, markerOptions.e(), false);
        c.a(parcel, 5, markerOptions.b(), false);
        c.a(parcel, 6, markerOptions.f());
        c.a(parcel, 7, markerOptions.g());
        c.a(parcel, 8, markerOptions.h());
        c.a(parcel, 9, markerOptions.i());
        c.a(parcel, 10, markerOptions.j());
        c.a(parcel, 11, markerOptions.k());
        c.a(parcel, 12, markerOptions.l());
        c.a(parcel, 13, markerOptions.m());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public MarkerOptions createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    latLng = (LatLng) a.a(parcel, a, (Parcelable.Creator) LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    str2 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    iBinder = a.m(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    f = a.i(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    f2 = a.i(parcel, a);
                    break;
                case e.MapAttrs_uiScrollGestures:
                    z = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiTiltGestures:
                    z2 = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiZoomControls:
                    z3 = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiZoomGestures:
                    f3 = a.i(parcel, a);
                    break;
                case e.MapAttrs_useViewLifecycle:
                    f4 = a.i(parcel, a);
                    break;
                case e.MapAttrs_zOrderOnTop:
                    f5 = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
