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

public class bq implements Parcelable.Creator {
    static void a(cc.c cVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = cVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, cVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, cVar.g(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.c createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str = a.l(parcel, a);
                    hashSet.add(2);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc.c(hashSet, i, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.c[] newArray(int i) {
        return new cc.c[i];
    }
}
