package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.HashSet;
import java.util.Set;

public class bk implements Parcelable.Creator {
    static void a(bz bzVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = bzVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, bzVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, bzVar.g(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, (Parcelable) bzVar.h(), i, true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, bzVar.i(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, (Parcelable) bzVar.j(), i, true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, bzVar.k(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public bz createFromParcel(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        bx bxVar = null;
        String str2 = null;
        bx bxVar2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i = a.f(parcel, a);
                    hashSet.add(1);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str3 = a.l(parcel, a);
                    hashSet.add(2);
                    break;
                case e.MapAttrs_cameraTilt:
                    hashSet.add(4);
                    bxVar2 = (bx) a.a(parcel, a, (Parcelable.Creator) bx.CREATOR);
                    break;
                case e.MapAttrs_cameraZoom:
                    str2 = a.l(parcel, a);
                    hashSet.add(5);
                    break;
                case e.MapAttrs_uiCompass:
                    hashSet.add(6);
                    bxVar = (bx) a.a(parcel, a, (Parcelable.Creator) bx.CREATOR);
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
            return new bz(hashSet, i, str3, bxVar2, str2, bxVar, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public bz[] newArray(int i) {
        return new bz[i];
    }
}
