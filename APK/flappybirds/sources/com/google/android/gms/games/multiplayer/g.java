package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.games.PlayerEntity;

public class g implements Parcelable.Creator {
    static void a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, participantEntity.i(), false);
        c.a(parcel, 1000, participantEntity.k());
        c.a(parcel, 2, participantEntity.f(), false);
        c.a(parcel, 3, (Parcelable) participantEntity.g(), i, false);
        c.a(parcel, 4, (Parcelable) participantEntity.h(), i, false);
        c.a(parcel, 5, participantEntity.b());
        c.a(parcel, 6, participantEntity.c(), false);
        c.a(parcel, 7, participantEntity.e());
        c.a(parcel, 8, (Parcelable) participantEntity.j(), i, false);
        c.a(parcel, 9, participantEntity.d());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int i = 0;
        PlayerEntity playerEntity = null;
        int b = a.b(parcel);
        boolean z = false;
        String str = null;
        int i2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    str3 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str2 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_cameraZoom:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    z = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiScrollGestures:
                    playerEntity = (PlayerEntity) a.a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case e.MapAttrs_uiTiltGestures:
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
            return new ParticipantEntity(i3, str3, str2, uri2, uri, i2, str, z, playerEntity, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
