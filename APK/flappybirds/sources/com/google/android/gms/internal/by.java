package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.ArrayList;

public class by implements Parcelable.Creator {
    static void a(cq cqVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1000, cqVar.f());
        c.b(parcel, 2, cqVar.a(), false);
        c.b(parcel, 3, cqVar.b(), false);
        c.a(parcel, 4, cqVar.c(), false);
        c.a(parcel, 5, cqVar.d());
        c.a(parcel, 6, cqVar.e());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cq createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int b = a.b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraTargetLat:
                    arrayList2 = a.c(parcel, a, x.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    arrayList = a.c(parcel, a, x.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    bundle = a.n(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    z = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    i = a.f(parcel, a);
                    break;
                case 1000:
                    i2 = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cq(i2, arrayList2, arrayList, bundle, z, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cq[] newArray(int i) {
        return new cq[i];
    }
}
