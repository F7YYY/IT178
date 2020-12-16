package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;

final class a implements Parcelable.Creator {
    a() {
    }

    /* renamed from: a */
    public RealTimeMessage createFromParcel(Parcel parcel) {
        return new RealTimeMessage(parcel, (a) null);
    }

    /* renamed from: a */
    public RealTimeMessage[] newArray(int i) {
        return new RealTimeMessage[i];
    }
}
