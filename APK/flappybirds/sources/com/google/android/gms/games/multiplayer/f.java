package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class f implements Parcelable.Creator {
    static void a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, (Parcelable) invitationEntity.b(), i, false);
        c.a(parcel, 1000, invitationEntity.h());
        c.a(parcel, 2, invitationEntity.c(), false);
        c.a(parcel, 3, invitationEntity.e());
        c.a(parcel, 4, invitationEntity.f());
        c.a(parcel, 5, (Parcelable) invitationEntity.d(), i, false);
        c.b(parcel, 6, invitationEntity.i(), false);
        c.a(parcel, 7, invitationEntity.g());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int b = a.b(parcel);
        long j = 0;
        ParticipantEntity participantEntity = null;
        int i2 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    gameEntity = (GameEntity) a.a(parcel, a, GameEntity.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    j = a.g(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    participantEntity = (ParticipantEntity) a.a(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case e.MapAttrs_uiCompass:
                    arrayList = a.c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case e.MapAttrs_uiRotateGestures:
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
            return new InvitationEntity(i3, gameEntity, str, j, i2, participantEntity, arrayList, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
