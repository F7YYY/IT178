package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class z implements SafeParcelable {
    public static final a CREATOR = new a();
    private final int a;
    private final ab b;

    z(int i, ab abVar) {
        this.a = i;
        this.b = abVar;
    }

    private z(ab abVar) {
        this.a = 1;
        this.b = abVar;
    }

    public static z a(d dVar) {
        if (dVar instanceof ab) {
            return new z((ab) dVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public ab b() {
        return this.b;
    }

    public d c() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        a aVar = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a aVar = CREATOR;
        a.a(this, parcel, i);
    }
}
