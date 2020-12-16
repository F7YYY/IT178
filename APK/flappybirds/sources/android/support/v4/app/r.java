package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

final class r implements Parcelable.Creator {
    r() {
    }

    /* renamed from: a */
    public FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    /* renamed from: a */
    public FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
