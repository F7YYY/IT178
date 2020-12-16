package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.ArrayList;

public class bg implements Parcelable.Creator {
    static void a(bv bvVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, bvVar.b(), false);
        c.a(parcel, 1000, bvVar.a());
        c.b(parcel, 2, bvVar.c(), false);
        c.b(parcel, 3, bvVar.d(), false);
        c.a(parcel, 4, bvVar.e());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public bv createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int b = a.b(parcel);
        ArrayList arrayList2 = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    arrayList2 = a.c(parcel, a, x.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    arrayList = a.c(parcel, a, x.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    z = a.c(parcel, a);
                    break;
                case 1000:
                    i = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bv(i, str, arrayList2, arrayList, z);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public bv[] newArray(int i) {
        return new bv[i];
    }
}
