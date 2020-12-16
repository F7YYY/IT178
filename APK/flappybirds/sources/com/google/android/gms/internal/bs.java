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

public class bs implements Parcelable.Creator {
    static void a(cc.f fVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = fVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, fVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, fVar.g(), true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, fVar.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, fVar.i(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, fVar.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, fVar.k(), true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, fVar.l());
        }
        if (e.contains(8)) {
            c.a(parcel, 8, fVar.m(), true);
        }
        if (e.contains(9)) {
            c.a(parcel, 9, fVar.n(), true);
        }
        if (e.contains(10)) {
            c.a(parcel, 10, fVar.o());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.f createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i2 = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str7 = a.l(parcel, a);
                    hashSet.add(2);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str6 = a.l(parcel, a);
                    hashSet.add(3);
                    break;
                case e.MapAttrs_cameraTilt:
                    str5 = a.l(parcel, a);
                    hashSet.add(4);
                    break;
                case e.MapAttrs_cameraZoom:
                    str4 = a.l(parcel, a);
                    hashSet.add(5);
                    break;
                case e.MapAttrs_uiCompass:
                    str3 = a.l(parcel, a);
                    hashSet.add(6);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    z = a.c(parcel, a);
                    hashSet.add(7);
                    break;
                case e.MapAttrs_uiScrollGestures:
                    str2 = a.l(parcel, a);
                    hashSet.add(8);
                    break;
                case e.MapAttrs_uiTiltGestures:
                    str = a.l(parcel, a);
                    hashSet.add(9);
                    break;
                case e.MapAttrs_uiZoomControls:
                    i = a.f(parcel, a);
                    hashSet.add(10);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc.f(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.f[] newArray(int i) {
        return new cc.f[i];
    }
}
