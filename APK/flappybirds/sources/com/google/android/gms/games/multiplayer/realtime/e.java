package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class e implements Parcelable.Creator {
    static void a(RoomEntity roomEntity, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, roomEntity.b(), false);
        c.a(parcel, 1000, roomEntity.k());
        c.a(parcel, 2, roomEntity.c(), false);
        c.a(parcel, 3, roomEntity.d());
        c.a(parcel, 4, roomEntity.e());
        c.a(parcel, 5, roomEntity.f(), false);
        c.a(parcel, 6, roomEntity.g());
        c.a(parcel, 7, roomEntity.h(), false);
        c.b(parcel, 8, roomEntity.i(), false);
        c.a(parcel, 9, roomEntity.j());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public RoomEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int b = a.b(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing:
                    str3 = a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                    str2 = a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                    j = a.g(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt:
                    i3 = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom:
                    str = a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass:
                    i2 = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures:
                    bundle = a.n(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures:
                    arrayList = a.c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures:
                    i = a.f(parcel, a);
                    break;
                case 1000:
                    i4 = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
