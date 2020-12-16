package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class f implements Parcelable.Creator {
    static void a(d dVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, dVar.c(), false);
        c.a(parcel, 1000, dVar.b());
        c.a(parcel, 2, (Parcelable[]) dVar.d(), i, false);
        c.a(parcel, 3, dVar.e());
        c.a(parcel, 4, dVar.f(), false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public d createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = a.b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    strArr = a.w(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    cursorWindowArr = (CursorWindow[]) a.b(parcel, a, CursorWindow.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    bundle = a.n(parcel, a);
                    break;
                case 1000:
                    i2 = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        d dVar = new d(i2, strArr, cursorWindowArr, i, bundle);
        dVar.a();
        return dVar;
    }

    /* renamed from: a */
    public d[] newArray(int i) {
        return new d[i];
    }
}
