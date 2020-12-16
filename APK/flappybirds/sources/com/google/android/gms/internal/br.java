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

public class br implements Parcelable.Creator {
    static void a(cc.d dVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = dVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, dVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, dVar.g(), true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, dVar.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, dVar.i(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, dVar.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, dVar.k(), true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, dVar.l(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc.d createFromParcel(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str6 = a.l(parcel, a);
                    hashSet.add(2);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str5 = a.l(parcel, a);
                    hashSet.add(3);
                    break;
                case e.MapAttrs_cameraTilt:
                    str4 = a.l(parcel, a);
                    hashSet.add(4);
                    break;
                case e.MapAttrs_cameraZoom:
                    str3 = a.l(parcel, a);
                    hashSet.add(5);
                    break;
                case e.MapAttrs_uiCompass:
                    str2 = a.l(parcel, a);
                    hashSet.add(6);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    str = a.l(parcel, a);
                    hashSet.add(7);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc.d(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc.d[] newArray(int i) {
        return new cc.d[i];
    }
}
