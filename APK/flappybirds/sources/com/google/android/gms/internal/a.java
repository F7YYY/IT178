package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class a implements Parcelable.Creator {
    static void a(z zVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, zVar.a());
        c.a(parcel, 2, (Parcelable) zVar.b(), i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public z createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        ab abVar = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    abVar = (ab) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable.Creator) ab.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new z(i, abVar);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public z[] newArray(int i) {
        return new z[i];
    }
}
