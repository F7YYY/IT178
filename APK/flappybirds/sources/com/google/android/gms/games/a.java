package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class a extends h {
    a() {
    }

    /* renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        if (GameEntity.b(GameEntity.u()) || GameEntity.b(GameEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        Uri parse = readString7 == null ? null : Uri.parse(readString7);
        String readString8 = parcel.readString();
        Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
        String readString9 = parcel.readString();
        return new GameEntity(1, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
