package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable;

class b implements Parcelable.Creator {
    final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public Object createFromParcel(Parcel parcel) {
        return this.a.a(parcel, (ClassLoader) null);
    }

    public Object[] newArray(int i) {
        return this.a.a(i);
    }
}
