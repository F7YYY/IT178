package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ab;
import java.util.ArrayList;

public class b implements Parcelable.Creator {
    static void a(ab abVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, abVar.a());
        c.b(parcel, 2, abVar.b(), false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ab createFromParcel(Parcel parcel) {
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
                    arrayList = a.c(parcel, a, ab.a.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ab(i, arrayList);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ab[] newArray(int i) {
        return new ab[i];
    }
}
