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

public class bn implements Parcelable.Creator {
    static void a(cc.b bVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = bVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, bVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, (Parcelable) bVar.g(), i, true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, (Parcelable) bVar.h(), i, true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, bVar.i());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.b createFromParcel(Parcel parcel) {
        cc.b.C0000b bVar = null;
        int i = 0;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        cc.b.a aVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i2 = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    hashSet.add(2);
                    aVar = (cc.b.a) a.a(parcel, a, (Parcelable.Creator) cc.b.a.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    hashSet.add(3);
                    bVar = (cc.b.C0000b) a.a(parcel, a, (Parcelable.Creator) cc.b.C0000b.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    i = a.f(parcel, a);
                    hashSet.add(4);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc.b(hashSet, i2, aVar, bVar, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.b[] newArray(int i) {
        return new cc.b[i];
    }
}
