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

public class bu implements Parcelable.Creator {
    static void a(cc.h hVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = hVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, hVar.f());
        }
        if (e.contains(3)) {
            c.a(parcel, 3, hVar.h());
        }
        if (e.contains(4)) {
            c.a(parcel, 4, hVar.j(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, hVar.g(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, hVar.i());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.h createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i3 = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    i = a.f(parcel, a);
                    hashSet.add(3);
                    break;
                case e.MapAttrs_cameraTilt:
                    str = a.l(parcel, a);
                    hashSet.add(4);
                    break;
                case e.MapAttrs_cameraZoom:
                    str2 = a.l(parcel, a);
                    hashSet.add(5);
                    break;
                case e.MapAttrs_uiCompass:
                    i2 = a.f(parcel, a);
                    hashSet.add(6);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc.h(hashSet, i3, str2, i2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.h[] newArray(int i) {
        return new cc.h[i];
    }
}
