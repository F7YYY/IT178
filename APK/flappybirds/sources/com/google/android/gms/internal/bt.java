package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc;
import java.util.HashSet;
import java.util.Set;

public class bt implements Parcelable.Creator {
    static void a(cc.g gVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = gVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, gVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, gVar.g());
        }
        if (e.contains(3)) {
            c.a(parcel, 3, gVar.h(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.g createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    z = a.c(parcel, a);
                    hashSet.add(2);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str = a.l(parcel, a);
                    hashSet.add(3);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc.g(hashSet, i, z, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.g[] newArray(int i) {
        return new cc.g[i];
    }
}
