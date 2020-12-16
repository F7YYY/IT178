package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class i implements Parcelable.Creator {
    static void a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, playerEntity.b(), false);
        c.a(parcel, 1000, playerEntity.g());
        c.a(parcel, 2, playerEntity.c(), false);
        c.a(parcel, 3, (Parcelable) playerEntity.d(), i, false);
        c.a(parcel, 4, (Parcelable) playerEntity.e(), i, false);
        c.a(parcel, 5, playerEntity.f());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Uri uri = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    str2 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_cameraZoom:
                    j = a.g(parcel, a);
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
            return new PlayerEntity(i, str2, str, uri2, uri, j);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
