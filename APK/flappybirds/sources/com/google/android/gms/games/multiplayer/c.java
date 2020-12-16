package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;

final class c extends g {
    c() {
    }

    /* renamed from: a */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        boolean z = false;
        if (ParticipantEntity.b(ParticipantEntity.u()) || ParticipantEntity.b(ParticipantEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Uri parse = readString3 == null ? null : Uri.parse(readString3);
        String readString4 = parcel.readString();
        Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
        int readInt = parcel.readInt();
        String readString5 = parcel.readString();
        boolean z2 = parcel.readInt() > 0;
        if (parcel.readInt() > 0) {
            z = true;
        }
        return new ParticipantEntity(1, readString, readString2, parse, parse2, readInt, readString5, z2, z ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7);
    }
}
