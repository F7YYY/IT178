package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

final class a extends f {
    a() {
    }

    /* renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        if (InvitationEntity.b(InvitationEntity.u()) || InvitationEntity.b(InvitationEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        for (int i = 0; i < readInt2; i++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(1, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1);
    }
}
