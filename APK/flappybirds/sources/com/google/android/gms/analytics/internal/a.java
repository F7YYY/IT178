package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

final class a implements Parcelable.Creator {
    a() {
    }

    /* renamed from: a */
    public Command createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    /* renamed from: a */
    public Command[] newArray(int i) {
        return new Command[i];
    }
}
