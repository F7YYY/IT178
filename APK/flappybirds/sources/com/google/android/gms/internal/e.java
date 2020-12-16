package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ae;

public class e implements Parcelable.Creator {
    static void a(ae.a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, aVar.a());
        c.a(parcel, 2, aVar.b());
        c.a(parcel, 3, aVar.c());
        c.a(parcel, 4, aVar.d());
        c.a(parcel, 5, aVar.e());
        c.a(parcel, 6, aVar.f(), false);
        c.a(parcel, 7, aVar.g());
        c.a(parcel, 8, aVar.i(), false);
        c.a(parcel, 9, (Parcelable) aVar.k(), i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ae.a createFromParcel(Parcel parcel) {
        z zVar = null;
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing:
                    i4 = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                    i3 = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                    z2 = a.c(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt:
                    i2 = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom:
                    z = a.c(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass:
                    str2 = a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures:
                    i = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures:
                    str = a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures:
                    zVar = (z) a.a(parcel, a, (Parcelable.Creator) z.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ae.a(i4, i3, z2, i2, z, str2, i, str, zVar);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ae.a[] newArray(int i) {
        return new ae.a[i];
    }
}
