package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ah;

public class f implements Parcelable.Creator {
    static void a(ah.b bVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, bVar.a);
        c.a(parcel, 2, bVar.b, false);
        c.a(parcel, 3, (Parcelable) bVar.c, i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ah.b createFromParcel(Parcel parcel) {
        ae.a aVar = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    aVar = (ae.a) a.a(parcel, a, (Parcelable.Creator) ae.a.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ah.b(i, str, aVar);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ah.b[] newArray(int i) {
        return new ah.b[i];
    }
}
