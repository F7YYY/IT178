package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;

public class bi implements SafeParcelable {
    public static final ap CREATOR = new ap();
    private final int a;
    private final String b;
    private final long c;
    private final short d;
    private final double e;
    private final double f;
    private final float g;
    private final int h;

    public bi(int i, String str, int i2, short s, double d2, double d3, float f2, long j) {
        a(str);
        a(f2);
        a(d2, d3);
        int a2 = a(i2);
        this.a = i;
        this.d = s;
        this.b = str;
        this.e = d2;
        this.f = d3;
        this.g = f2;
        this.c = j;
        this.h = a2;
    }

    private static int a(int i) {
        int i2 = i & 3;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("No supported transition specified: " + i);
    }

    private static void a(double d2, double d3) {
        if (d2 > 90.0d || d2 < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d2);
        } else if (d3 > 180.0d || d3 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d3);
        }
    }

    private static void a(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f2);
        }
    }

    private static void a(String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }

    private static String b(int i) {
        switch (i) {
            case e.MapAttrs_cameraBearing:
                return "CIRCLE";
            default:
                return null;
        }
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }

    public int describeContents() {
        ap apVar = CREATOR;
        return 0;
    }

    public float e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        if (this.g != biVar.g) {
            return false;
        }
        if (this.e != biVar.e) {
            return false;
        }
        if (this.f != biVar.f) {
            return false;
        }
        return this.d == biVar.d;
    }

    public String f() {
        return this.b;
    }

    public long g() {
        return this.c;
    }

    public int h() {
        return this.h;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.g)) * 31) + this.d) * 31) + this.h;
    }

    public String toString() {
        return String.format("Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, @%d]", new Object[]{b(this.d), this.b, Integer.valueOf(this.h), Double.valueOf(this.e), Double.valueOf(this.f), Float.valueOf(this.g), Long.valueOf(this.c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ap apVar = CREATOR;
        ap.a(this, parcel, i);
    }
}
