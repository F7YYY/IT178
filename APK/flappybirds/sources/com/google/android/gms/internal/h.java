package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ah;
import java.util.ArrayList;

public class h implements Parcelable.Creator {
    static void a(ah.a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, aVar.a);
        c.a(parcel, 2, aVar.b, false);
        c.b(parcel, 3, aVar.c, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ah.a createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
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
                    arrayList = a.c(parcel, a, ah.b.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ah.a(i, str, arrayList);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ah.a[] newArray(int i) {
        return new ah.a[i];
    }
}
