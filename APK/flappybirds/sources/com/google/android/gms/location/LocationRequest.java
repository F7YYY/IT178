package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;

public final class LocationRequest implements SafeParcelable {
    public static final c CREATOR = new c();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    private final int h;

    public LocationRequest() {
        this.h = 1;
        this.a = 102;
        this.b = 3600000;
        this.c = 600000;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f2) {
        this.h = i;
        this.a = i2;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i3;
        this.g = f2;
    }

    public static String a(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.h;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g;
    }

    public int hashCode() {
        return dl.a(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f), Float.valueOf(this.g));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[").append(a(this.a));
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b + "ms");
        }
        sb.append(" fastest=");
        sb.append(this.c + "ms");
        if (this.e != Long.MAX_VALUE) {
            long elapsedRealtime = this.e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime + "ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
