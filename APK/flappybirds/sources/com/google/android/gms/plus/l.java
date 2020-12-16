package com.google.android.gms.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class l implements Parcelable.Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, aVar.b(), false);
        c.a(parcel, 1000, aVar.a());
        c.a(parcel, 2, aVar.c(), false);
        c.a(parcel, 3, aVar.d(), false);
        c.a(parcel, 4, aVar.e(), false);
        c.a(parcel, 5, aVar.f(), false);
        c.a(parcel, 6, aVar.g(), false);
        c.a(parcel, 7, aVar.h(), false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    str4 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    strArr3 = a.w(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    strArr2 = a.w(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    strArr = a.w(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    str3 = a.l(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    str2 = a.l(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    str = a.l(parcel, a);
                    break;
                case 1000:
                    i = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new a(i, str4, strArr3, strArr2, strArr, str3, str2, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public a[] newArray(int i) {
        return new a[i];
    }
}
