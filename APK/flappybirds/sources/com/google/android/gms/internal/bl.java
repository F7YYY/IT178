package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class bl implements Parcelable.Creator {
    static void a(cc ccVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = ccVar.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ccVar.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, ccVar.g(), true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, (Parcelable) ccVar.h(), i, true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ccVar.i(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, ccVar.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, ccVar.k());
        }
        if (e.contains(7)) {
            c.a(parcel, 7, (Parcelable) ccVar.l(), i, true);
        }
        if (e.contains(8)) {
            c.a(parcel, 8, ccVar.m(), true);
        }
        if (e.contains(9)) {
            c.a(parcel, 9, ccVar.n(), true);
        }
        if (e.contains(12)) {
            c.a(parcel, 12, ccVar.o());
        }
        if (e.contains(14)) {
            c.a(parcel, 14, ccVar.p(), true);
        }
        if (e.contains(15)) {
            c.a(parcel, 15, (Parcelable) ccVar.q(), i, true);
        }
        if (e.contains(16)) {
            c.a(parcel, 16, ccVar.r());
        }
        if (e.contains(19)) {
            c.a(parcel, 19, (Parcelable) ccVar.t(), i, true);
        }
        if (e.contains(18)) {
            c.a(parcel, 18, ccVar.s(), true);
        }
        if (e.contains(21)) {
            c.a(parcel, 21, ccVar.v());
        }
        if (e.contains(20)) {
            c.a(parcel, 20, ccVar.u(), true);
        }
        if (e.contains(23)) {
            c.b(parcel, 23, ccVar.x(), true);
        }
        if (e.contains(22)) {
            c.b(parcel, 22, ccVar.w(), true);
        }
        if (e.contains(25)) {
            c.a(parcel, 25, ccVar.z());
        }
        if (e.contains(24)) {
            c.a(parcel, 24, ccVar.y());
        }
        if (e.contains(27)) {
            c.a(parcel, 27, ccVar.B(), true);
        }
        if (e.contains(26)) {
            c.a(parcel, 26, ccVar.A(), true);
        }
        if (e.contains(29)) {
            c.a(parcel, 29, ccVar.D());
        }
        if (e.contains(28)) {
            c.b(parcel, 28, ccVar.C(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        cc.a aVar = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        cc.b bVar = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        cc.c cVar = null;
        boolean z = false;
        String str7 = null;
        cc.d dVar = null;
        String str8 = null;
        int i4 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        boolean z2 = false;
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
                case e.MapAttrs_cameraTargetLng:
                    hashSet.add(3);
                    aVar = (cc.a) a.a(parcel, a, (Parcelable.Creator) cc.a.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    str2 = a.l(parcel, a);
                    hashSet.add(4);
                    break;
                case e.MapAttrs_cameraZoom:
                    str3 = a.l(parcel, a);
                    hashSet.add(5);
                    break;
                case e.MapAttrs_uiCompass:
                    i2 = a.f(parcel, a);
                    hashSet.add(6);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    hashSet.add(7);
                    bVar = (cc.b) a.a(parcel, a, (Parcelable.Creator) cc.b.CREATOR);
                    break;
                case e.MapAttrs_uiScrollGestures:
                    str4 = a.l(parcel, a);
                    hashSet.add(8);
                    break;
                case e.MapAttrs_uiTiltGestures:
                    str5 = a.l(parcel, a);
                    hashSet.add(9);
                    break;
                case e.MapAttrs_useViewLifecycle:
                    i3 = a.f(parcel, a);
                    hashSet.add(12);
                    break;
                case 14:
                    str6 = a.l(parcel, a);
                    hashSet.add(14);
                    break;
                case 15:
                    hashSet.add(15);
                    cVar = (cc.c) a.a(parcel, a, (Parcelable.Creator) cc.c.CREATOR);
                    break;
                case 16:
                    z = a.c(parcel, a);
                    hashSet.add(16);
                    break;
                case 18:
                    str7 = a.l(parcel, a);
                    hashSet.add(18);
                    break;
                case 19:
                    hashSet.add(19);
                    dVar = (cc.d) a.a(parcel, a, (Parcelable.Creator) cc.d.CREATOR);
                    break;
                case 20:
                    str8 = a.l(parcel, a);
                    hashSet.add(20);
                    break;
                case 21:
                    i4 = a.f(parcel, a);
                    hashSet.add(21);
                    break;
                case 22:
                    arrayList = a.c(parcel, a, cc.f.CREATOR);
                    hashSet.add(22);
                    break;
                case 23:
                    arrayList2 = a.c(parcel, a, cc.g.CREATOR);
                    hashSet.add(23);
                    break;
                case 24:
                    i5 = a.f(parcel, a);
                    hashSet.add(24);
                    break;
                case 25:
                    i6 = a.f(parcel, a);
                    hashSet.add(25);
                    break;
                case 26:
                    str9 = a.l(parcel, a);
                    hashSet.add(26);
                    break;
                case 27:
                    str10 = a.l(parcel, a);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayList3 = a.c(parcel, a, cc.h.CREATOR);
                    hashSet.add(28);
                    break;
                case 29:
                    z2 = a.c(parcel, a);
                    hashSet.add(29);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc(hashSet, i, str, aVar, str2, str3, i2, bVar, str4, str5, i3, str6, cVar, z, str7, dVar, str8, i4, arrayList, arrayList2, i5, i6, str9, str10, arrayList3, z2);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc[] newArray(int i) {
        return new cc[i];
    }
}
