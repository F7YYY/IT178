package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.ArrayList;

public class bw implements Parcelable.Creator {
    static void a(co coVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, coVar.g(), false);
        c.a(parcel, 1000, coVar.k());
        c.b(parcel, 2, coVar.a(), false);
        c.b(parcel, 3, coVar.b(), false);
        c.a(parcel, 4, (Parcelable) coVar.c(), i, false);
        c.a(parcel, 5, coVar.d(), false);
        c.a(parcel, 6, coVar.e(), false);
        c.a(parcel, 7, coVar.f(), false);
        c.a(parcel, 8, coVar.h(), false);
        c.a(parcel, 9, coVar.i(), false);
        c.a(parcel, 10, coVar.j());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public co createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = a.b(parcel);
        Bundle bundle2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    str4 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    arrayList2 = a.c(parcel, a, x.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    arrayList = a.c(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
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
                case e.MapAttrs_uiScrollGestures:
                    bundle2 = a.n(parcel, a);
                    break;
                case e.MapAttrs_uiTiltGestures:
                    bundle = a.n(parcel, a);
                    break;
                case e.MapAttrs_uiZoomControls:
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
            return new co(i2, str4, arrayList2, arrayList, uri, str3, str2, str, bundle2, bundle, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public co[] newArray(int i) {
        return new co[i];
    }
}
