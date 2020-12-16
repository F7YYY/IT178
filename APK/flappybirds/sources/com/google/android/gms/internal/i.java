package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class i implements Parcelable.Creator {
    static void a(ak akVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, akVar.a());
        c.a(parcel, 2, akVar.e(), false);
        c.a(parcel, 3, (Parcelable) akVar.f(), i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ak createFromParcel(Parcel parcel) {
        ah ahVar = null;
        int b = a.b(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    parcel2 = a.y(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    ahVar = (ah) a.a(parcel, a, (Parcelable.Creator) ah.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ak(i, parcel2, ahVar);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ak[] newArray(int i) {
        return new ak[i];
    }
}
