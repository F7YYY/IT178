package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class e implements Parcelable.Creator {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, groundOverlayOptions.b());
        c.a(parcel, 2, groundOverlayOptions.a(), false);
        c.a(parcel, 3, (Parcelable) groundOverlayOptions.c(), i, false);
        c.a(parcel, 4, groundOverlayOptions.d());
        c.a(parcel, 5, groundOverlayOptions.e());
        c.a(parcel, 6, (Parcelable) groundOverlayOptions.f(), i, false);
        c.a(parcel, 7, groundOverlayOptions.g());
        c.a(parcel, 8, groundOverlayOptions.h());
        c.a(parcel, 9, groundOverlayOptions.l());
        c.a(parcel, 10, groundOverlayOptions.i());
        c.a(parcel, 11, groundOverlayOptions.j());
        c.a(parcel, 12, groundOverlayOptions.k());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                    iBinder = a.m(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                    latLng = (LatLng) a.a(parcel, a, (Parcelable.Creator) LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt:
                    f = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom:
                    f2 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, (Parcelable.Creator) LatLngBounds.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures:
                    f3 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures:
                    f4 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures:
                    z = a.c(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls:
                    f5 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures:
                    f6 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle:
                    f7 = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
