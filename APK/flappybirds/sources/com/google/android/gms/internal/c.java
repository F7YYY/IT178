package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;
import com.google.android.gms.internal.ab;

public class c implements Parcelable.Creator {
    static void a(ab.a aVar, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, aVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, aVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, aVar.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }

    /* renamed from: a */
    public ab.a createFromParcel(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    i = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ab.a(i2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ab.a[] newArray(int i) {
        return new ab.a[i];
    }
}
