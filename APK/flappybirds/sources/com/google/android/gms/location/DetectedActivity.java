package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable {
    public static final b CREATOR = new b();
    int a;
    int b;
    private final int c;

    public DetectedActivity(int i, int i2, int i3) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    private int a(int i) {
        if (i > 5) {
            return 4;
        }
        return i;
    }

    public int a() {
        return a(this.a);
    }

    public int b() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DetectedActivity [type=" + a() + ", confidence=" + this.b + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
