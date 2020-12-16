package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

final class s implements Parcelable.Creator {
    s() {
    }

    /* renamed from: a */
    public FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    /* renamed from: a */
    public FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }
}
