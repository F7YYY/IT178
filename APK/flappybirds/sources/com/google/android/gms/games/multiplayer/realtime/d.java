package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

final class d extends e {
    d() {
    }

    /* renamed from: a */
    public RoomEntity createFromParcel(Parcel parcel) {
        if (RoomEntity.b(RoomEntity.u()) || RoomEntity.b(RoomEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        int readInt2 = parcel.readInt();
        Bundle readBundle = parcel.readBundle();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
    }
}
