package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.Cdo;

public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final byte[] b;
    private final int c;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    /* synthetic */ RealTimeMessage(Parcel parcel, a aVar) {
        this(parcel);
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.a = (String) Cdo.a((Object) str);
        this.b = (byte[]) ((byte[]) Cdo.a((Object) bArr)).clone();
        this.c = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
    }
}
