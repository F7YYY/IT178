package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable;

class d implements Parcelable.ClassLoaderCreator {
    private final c a;

    public d(c cVar) {
        this.a = cVar;
    }

    public Object createFromParcel(Parcel parcel) {
        return this.a.a(parcel, (ClassLoader) null);
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.a(parcel, classLoader);
    }

    public Object[] newArray(int i) {
        return this.a.a(i);
    }
}
