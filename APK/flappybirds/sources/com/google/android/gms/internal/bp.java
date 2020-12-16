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

public class bp implements Parcelable.Creator {
    static void a(cc.b.C0000b bVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = bVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, bVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, bVar.g());
        }
        if (e.contains(3)) {
            c.a(parcel, 3, bVar.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, bVar.i());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.b.C0000b createFromParcel(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i3 = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    i2 = a.f(parcel, a);
                    hashSet.add(2);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str = a.l(parcel, a);
                    hashSet.add(3);
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
            return new cc.b.C0000b(hashSet, i3, i2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.b.C0000b[] newArray(int i) {
        return new cc.b.C0000b[i];
    }
}
