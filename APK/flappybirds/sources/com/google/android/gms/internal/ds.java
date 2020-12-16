package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class ds implements Parcelable.Creator {
    static void a(x xVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, xVar.b());
        c.a(parcel, 1000, xVar.a());
        c.a(parcel, 2, xVar.c());
        c.a(parcel, 3, xVar.d(), false);
        c.a(parcel, 4, xVar.e(), false);
        c.a(parcel, 5, xVar.f(), false);
        c.a(parcel, 6, xVar.g(), false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public x createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str4 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    str3 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    str2 = a.l(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    str = a.l(parcel, a);
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
            return new x(i3, i2, i, str4, str3, str2, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public x[] newArray(int i) {
        return new x[i];
    }
}
