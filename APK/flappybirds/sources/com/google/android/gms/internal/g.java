package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ah;
import java.util.ArrayList;

public class g implements Parcelable.Creator {
    static void a(ah ahVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, ahVar.b());
        c.b(parcel, 2, ahVar.c(), false);
        c.a(parcel, 3, ahVar.d(), false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ah createFromParcel(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    arrayList = a.c(parcel, a, ah.a.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ah(i, arrayList, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ah[] newArray(int i) {
        return new ah[i];
    }
}
