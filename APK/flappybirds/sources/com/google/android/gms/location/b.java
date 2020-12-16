package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class b implements Parcelable.Creator {
    static void a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, detectedActivity.a);
        c.a(parcel, 1000, detectedActivity.b());
        c.a(parcel, 2, detectedActivity.b);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public DetectedActivity createFromParcel(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    i = a.f(parcel, a);
                    break;
                case 1000:
                    i3 = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DetectedActivity(i3, i2, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public DetectedActivity[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
